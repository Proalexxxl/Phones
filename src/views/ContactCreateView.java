package views;

import database.entities.Contact;
import models.ContactCreateModel;
import utils.Validator;

import java.util.Scanner;

public class ContactCreateView {

    ContactCreateModel model;
    Scanner scanner;
    Contact contact;
    String title;
    String name;
    String phone;

    public ContactCreateView(ContactCreateModel model) {
        this.model = model;
    }

    public Contact doInputs() {

        scanner = new Scanner(System.in);
        contact = new Contact();

        title = "Введите имя: ";
        System.out.print(title);
        name = Validator.validateNameInput(scanner);
        contact.setName(name);

        title = "Введите телефон: ";
        System.out.print(title);
        phone = Validator.validatePhoneInput(scanner);
        contact.setPhone(phone);

        return contact;
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}
