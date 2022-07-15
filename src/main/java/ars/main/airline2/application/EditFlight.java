package ars.main.airline2.application;

import javafx.geometry.Insets;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import java.util.Optional;

public class EditFlight {

    private String result;

    public String getResult() {
        return this.result;
    }

    public EditFlight() {
        Dialog<String> dialog = new Dialog<>();
        dialog.setTitle("Edit Details");
        dialog.setHeaderText("Edit Details");

        ButtonType confirm = new ButtonType("Edit");
        dialog.getDialogPane().getButtonTypes().add(confirm);

        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(20,150,10,10));

        TextField author = new TextField();
        author.setPromptText("Passenger Id");

        TextField title = new TextField();
        title.setPromptText("From");

        TextField isbn = new TextField();
        isbn.setPromptText("To");

        TextField category = new TextField();
        category.setPromptText("Class");

        grid.add(new Label("Passenger Id:"), 0, 0);
        grid.add(author, 1, 0);

        grid.add(new Label("From:"), 0, 1);
        grid.add(title, 1, 1);

        grid.add(new Label("To:"), 0, 2);
        grid.add(isbn, 1, 2);

        grid.add(new Label("Class:"), 0, 3);
        grid.add(category, 1, 3);

        dialog.getDialogPane().setContent(grid);

        dialog.setResultConverter(dialogButton -> {
            if (dialogButton == confirm) {
                return author.getText() + ";" + title.getText() + ";" + isbn.getText() + ";" + category.getText();
            }
            return null;
        });

        Optional<String> rslt = dialog.showAndWait();
        if (rslt.isPresent() ) {
            this.result = rslt.get();
        }
        else this.result = null;
    }
}