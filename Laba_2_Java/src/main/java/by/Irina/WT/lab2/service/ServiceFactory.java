package main.java.by.Irina.WT.lab2.service;

import main.java.by.Irina.WT.lab2.service.impl.ApplianceServiceImpl;

/**
 * A factory for creating ApplianceService.
 */
public class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();

    private ServiceFactory() {
    }

    public ApplianceService getApplianceService() {
        return new ApplianceServiceImpl();
    }

    public static ServiceFactory getInstance() {
        return instance;
    }
}
