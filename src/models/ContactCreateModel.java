package models;

import java.util.HashMap;

public class ContactCreateModel {

    // Имитация записи в БД.
    public String createContacts() {

        HashMap<String, String> hm = new HashMap<>();

        hm.put("Максим", "+80990000001");
        hm.put("Дмитрий", "+80990000002");
        hm.put("Станислав", "+80990000003");
        hm.put("Оксана", "+80990000004");
        hm.put("Ольга", "+80990000005");
        hm.put("Александр", "+80990000006");
        hm.put("Марина", "+80990000007");

        return "Создано записей: " + hm.size();
    }
}
