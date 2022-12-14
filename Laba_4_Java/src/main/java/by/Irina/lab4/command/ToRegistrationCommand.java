package by.Irina.lab4.command;

import by.Irina.lab4.constant.PageConstant;

public class ToRegistrationCommand implements Command {
    @Override
    public CommandResult execute(RequestContent requestContent) {
        return new CommandResult(CommandResult.ResponseType.FORWARD, PageConstant.REGISTRATION_PAGE);
    }
}
