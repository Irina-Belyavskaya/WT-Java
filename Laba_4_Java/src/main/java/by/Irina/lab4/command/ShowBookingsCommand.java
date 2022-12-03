package by.Irina.lab4.command;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import by.Irina.lab4.constant.PageConstant;
import by.Irina.lab4.constant.RequestConstant;
import by.Irina.lab4.entity.Booking;
import by.Irina.lab4.entity.User;
import by.Irina.lab4.exception.ServiceException;
import by.Irina.lab4.message.MessageHandler;
import by.Irina.lab4.service.CommonService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShowBookingsCommand implements Command {

    private static Logger log = LogManager.getLogger("show bookings");

    private CommonService commonService;

    public ShowBookingsCommand(CommonService commonService) {
        this.commonService = commonService;
    }

    @Override
    public CommandResult execute(RequestContent requestContent) {
        CommandResult commandResult;
        User user = (User) requestContent.getSessionAttribute(RequestConstant.USER);
        Map<String, Object> requestAttributes = new HashMap<>();
        try {
            List<Booking> bookingList = commonService.findBookings(user.getLogin());
            if (bookingList.isEmpty()) {
                requestAttributes.put(RequestConstant.ERROR_FINDING_BOOKINGS, MessageHandler.getMessage(
                        "message.no_bookings", (String) requestContent.getSessionAttribute(RequestConstant.LOCALE)));
                commandResult = new CommandResult(CommandResult.ResponseType.FORWARD, PageConstant.USER_MAIN_PAGE,
                        requestAttributes);
            } else {
                requestAttributes.put(RequestConstant.BOOKINGS, bookingList);
                commandResult = new CommandResult(CommandResult.ResponseType.FORWARD, PageConstant.BOOKINGS_PAGE,
                        requestAttributes);
            }
            return commandResult;
        } catch (ServiceException e) {
            log.error("Error in receiving bookings");
            return new DefaultCommand().execute(requestContent);
        }
    }
}
