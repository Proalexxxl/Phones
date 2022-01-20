package controllers;

import models.ContactDeleteModel;
import views.ContactDeleteView;

public class ContactDeleteController {

    ContactDeleteModel model;
    ContactDeleteView view;

    public ContactDeleteController(ContactDeleteModel model, ContactDeleteView view) {
        this.model = model;
        this.view = view;
    }

    public void deleteContacts() {

    }
}
