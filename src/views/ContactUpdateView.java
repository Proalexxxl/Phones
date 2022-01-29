package views;

import database.entities.Contact;
import models.ContactUpdateModel;
import utils.Validator;

import java.util.Scanner;

public class ContactUpdateView {

    ContactUpdateModel model;
    Contact contact;
    String title;
    int id;
    String phone;

    public ContactUpdateView(ContactUpdateModel model) {
        this.model = model;
    }

    public Contact doInputs() {

        Scanner scannerID = new Scanner(System.in);
        contact = new Contact();

        title = "Введите ID контакта: ";
        System.out.print(title);
        id = Validator.validateIdInput(scannerID);
        contact.setId(id);

        Scanner scannerPhone = new Scanner(System.in);
        title = "Введите новый телефон: ";
        System.out.print(title);
        phone = Validator.validatePhoneInput(scannerPhone);
        contact.setPhone(phone);

        return contact;
    }

    // Вывод уведомления
    public void getOutput(String output) {
        System.out.println(output);
    }
}
