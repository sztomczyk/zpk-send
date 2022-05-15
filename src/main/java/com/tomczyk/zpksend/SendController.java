package com.tomczyk.zpksend;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class SendController {

    @FXML
    private TableView<Measurement> dataTable = new TableView<Measurement>();

    private final ObservableList<Measurement> data = FXCollections.observableArrayList(
            new Measurement(2, 3.5, 5, 23.5)
    );

    @FXML
    private TextField c1ValueInput;
    @FXML
    private TextField c2ValueInput;
    @FXML
    private TextField c3ValueInput;
    @FXML
    private TextField c4ValueInput;

    @FXML
    protected void onEnterDataButtonClick() {
        // Wartosci maja byc typu double
        // Dodac wartosci do tabeli
        // Wyczyscic inputy
        this.dataTable.setItems(this.data);
    }
}