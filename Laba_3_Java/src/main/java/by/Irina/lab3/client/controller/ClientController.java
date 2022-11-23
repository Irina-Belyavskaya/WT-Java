package by.Irina.lab3.client.controller;

import by.Irina.lab3.beans.*;

public interface ClientController {
	Request createRequest();
	void processResponse(Response response);
}
