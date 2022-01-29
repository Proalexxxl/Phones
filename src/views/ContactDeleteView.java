package views;

import database.entities.Contact;
import models.ContactDeleteModel;
import utils.Validator;

import java.util.Scanner;

public class ContactDeleteView {

    ContactDeleteModel model;

    public ContactDeleteView(ContactDeleteModel model) {
        this.model = model;
    }

    public Contact doInput() {

        Contact contact = new Contact();
        Scanner scanner = new Scanner(System.in);

        String title = "Введите ID контакта:";
        System.out.println(title);
        contact.setId(Validator.validateIdInput(scanner));

        return contact;
}

    public void getOutput(String output) {
        System.out.println(output);
    }
}
