package controllers;

import models.ContactUpdateModel;
import views.ContactUpdateView;

public class ContactUpdateController {

    ContactUpdateModel model;
    ContactUpdateView view;

    public ContactUpdateController(ContactUpdateModel model, ContactUpdateView view) {
        this.model = model;
        this.view = view;
    }

    public void updateContacts() {

    }
}
