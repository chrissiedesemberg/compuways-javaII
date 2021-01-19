package sample;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import sample.datamodel.Contact;
import sample.datamodel.ContactData;

import java.io.IOException;
import java.util.Optional;

public class Controller {

    @FXML
    private BorderPane mainPanel;

    @FXML
    private TableView<Contact> contactsTable;

    private ContactData data;

    @FXML
    private ContextMenu listContextMenu;

    @FXML
    private TextField qaFirstnameField;
    @FXML
    private TextField qaLastnameField;
    @FXML
    private TextField qaPhoneNumberField;
    @FXML
    private TextField qaNotesField;
    @FXML
    private Button quickAdd;
    @FXML
    private Button clear;
    @FXML
    private Button delete;

    public void initialize() {
        data = new ContactData();
        data.loadContacts();
        contactsTable.setItems(data.getContacts());

        listContextMenu = new ContextMenu();
        MenuItem deleteMenuItem = new MenuItem("Delete");
        deleteMenuItem.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                handleDelete(actionEvent);
            }
        });
        listContextMenu.getItems().addAll(deleteMenuItem);
    }

    @FXML
    public void showAddContactDialog(ActionEvent actionEvent) {
        Dialog<ButtonType> dialog = new Dialog<ButtonType>();
        dialog.initOwner(mainPanel.getScene().getWindow());
        dialog.setTitle("Add New Contact");
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("contactdialog.fxml"));
        try {
            dialog.getDialogPane().setContent(fxmlLoader.load());
        } catch (IOException ioe) {
            System.out.println("Could not load the dialog");
            ioe.printStackTrace();
            return;
        }

        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);

        Optional<ButtonType> result = dialog.showAndWait();
        if(result.isPresent() && result.get() == ButtonType.OK) {
            ContactController contactController = fxmlLoader.getController();
            Contact newContact = contactController.getNewContact();
            data.addContact(newContact);
            data.saveContacts();
        }
    }

    public void showEditContactDialog(ActionEvent actionEvent) {
        Contact selectedContact = contactsTable.getSelectionModel().getSelectedItem();
        Dialog<ButtonType> dialog = new Dialog<ButtonType>();
        dialog.initOwner(mainPanel.getScene().getWindow());
        dialog.setTitle("Edit Selected Contact");
        FXMLLoader fxmlLoader = new FXMLLoader();
//        fxmlLoader.setLocation(getClass().getResource("contactdialog.fxml"));
//
//        try {
//            dialog.getDialogPane().setContent(fxmlLoader.load());
//
//        } catch (IOException ioe) {
//            System.out.println("Could not load the dialog");
//            ioe.printStackTrace();
//            return;
//        }
//
//        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);
//        dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);
//
//        Optional<ButtonType> result = dialog.showAndWait();
//        if(result.isPresent() && result.get() == ButtonType.OK) {
//            ContactController contactController = fxmlLoader.getController();
//            Contact newContact = contactController.getNewContact();
//            data.addContact(newContact);
//            data.saveContacts();
//        }

    }

    public void handleDelete(ActionEvent actionEvent) {
        Contact selectedContact = contactsTable.getSelectionModel().getSelectedItem();
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Delete Contact");
        alert.setHeaderText("Delete item: " + selectedContact.getFirstName() + " " + selectedContact.getLastName() );
        alert.setContentText("Are you sure you want to delete this contact?");
        Optional<ButtonType> result = alert.showAndWait();

        if(result.isPresent() && (result.get() == ButtonType.OK)) {
            data.deleteContact(selectedContact);
            data.saveContacts();
        }
        }

    public void handleExit(ActionEvent actionEvent) {
        Platform.exit();
    }


    public void quickContactHandler(ActionEvent actionEvent) {

        quickAdd.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                String firstName = qaFirstnameField.getText();
                String lastName = qaLastnameField.getText();
                String phoneNumber = qaPhoneNumberField.getText();
                String note = qaNotesField.getText();

                Contact newContact = new Contact(firstName, lastName, phoneNumber, note);
                data.addContact(newContact);
                data.saveContacts();

                qaFirstnameField.clear();
                qaLastnameField.clear();
                qaPhoneNumberField.clear();
                qaNotesField.clear();
            }
        });

        clear.setOnAction(event -> {
                qaFirstnameField.clear();
                qaLastnameField.clear();
                qaPhoneNumberField.clear();
                qaNotesField.clear();
        });

    }
}