package models;

import database.DBCheck;
import database.DBConn;
import database.entities.Contact;
import utils.Constants;
import utils.idChecker;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ContactDeleteModel {

    public String deleteContact(Contact contact) {
        if (DBCheck.isDBExists()) {
            return deleteData(contact);
        } else {
            return Constants.DATA_ABSENT_MSG;
        }
    }

    private String deleteData(Contact contact) {
        if (idChecker.isIdExists(contact)) {

            String sql = "DELETE FROM " + Constants.TABLE_NAME + " WHERE id = ?";

            try (PreparedStatement stmt = DBConn.connect().prepareStatement(sql)) {
                stmt.setInt(1, contact.getId());
                stmt.executeUpdate();

                return Constants.DATA_DELETE_MSG;
            } catch (SQLException e) {
                return e.getMessage();
            }
        } else {
            return Constants.ID_NO_EXISTS_MSG;
        }
    }
}
