package controllers;

import database.entities.Contact;
import models.AppModel;
import models.ContactReadModel;
import utils.Constants;
import views.AppView;
import views.ContactReadView;

import java.util.List;

public class ContactReadController {

    ContactReadModel model;
    ContactReadView view;
    AppController appController;
    AppModel appModel;
    AppView appView;

    public ContactReadController(ContactReadModel model, ContactReadView view) {
        this.model = model;
        this.view = view;
    }

    public void getContacts() {
        String str = readContacts();

        if (str.equals(Constants.DB_ABSENT_MSG)) {
            view.getOutput(str);
            System.exit(0);
        } else {
            view.getOutput(str);

            appController = new AppController(appModel, appView);
            appController.restartApp();
        }
    }

    private String readContacts() {
        List<Contact> contacts = model.readContacts();

        if (contacts != null) {
            if (!contacts.isEmpty()) {
                int count = 0;
                String str;

                StringBuilder stringBuilder = new StringBuilder();

                for (Contact contact : contacts) {
                    count++;
                    str = count + ") ID: "
                            + contact.getId() + " - "
                            + " " + contact.getName()
                            + " " + contact.getPhone()
                            + "\n";
                    stringBuilder.append(str);
                }
                return stringBuilder.toString();
            } else
                return Constants.DATA_ABSENT_MSG;
        } else
            return Constants.DB_ABSENT_MSG;
    }
}
