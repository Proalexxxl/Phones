package controllers;

import database.entities.Contact;
import models.AppModel;
import models.ContactCreateModel;
import utils.Constants;
import views.AppView;
import views.ContactCreateView;

public class ContactCreateController {

    ContactCreateModel model;
    ContactCreateView view;
    AppModel appModel;
    AppView appView;
    AppController appController;
    Contact contact;

    public ContactCreateController(ContactCreateModel model, ContactCreateView view) {
        this.model = model;
        this.view = view;
    }

    public void addContacts() {
        contact = view.doInputs();
        String str = model.createContact(contact);

        if (str.equals(Constants.DB_ABSENT_MSG)) {
            view.getOutput(str);
            System.exit(0);
        } else {
            view.getOutput(str);

            appController = new AppController(appModel, appView);
            appController.restartApp();
        }
    }
}
