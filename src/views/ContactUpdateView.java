package views;

import database.entities.Contact;
import models.ContactUpdateModel;
import utils.Validator;

import java.util.Scanner;

public class ContactUpdateView {

    ContactUpdateModel model;
    Scanner scanner;
    Contact contact;
    String title;
    int id;
    String phone;

    public ContactUpdateView(ContactUpdateModel model) {
        this.model = model;
    }

    public Contact doInputs() {

        scanner = new Scanner(System.in);
        contact = new Contact();

        title = "Введите ID контакта: ";
        System.out.print(title);
        id = Validator.validateIdInput(scanner);
        contact.setId(id);

//        scanner = new Scanner(System.in);
        title = "Введите новый телефон: ";
        System.out.print(title);
        phone = Validator.validatePhoneInput(scanner);
        contact.setPhone(phone);

        return contact;
    }

    // Вывод уведомления
    public void getOutput(String output) {
        System.out.println(output);
    }
}
