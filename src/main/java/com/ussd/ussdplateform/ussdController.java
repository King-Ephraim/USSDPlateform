package com.ussd.ussdplateform;

import com.ussd.ussdplateform.DAO.UtilisateurDAO;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class ussdController implements Initializable {
    @FXML
    private Label zero;

    @FXML
    private Label one;

    @FXML
    private Label two;

    @FXML
    private Label three;

    @FXML
    private Label four;

    @FXML
    private Label five;

    @FXML
    private Label six;

    @FXML
    private Label seven;

    @FXML
    private Label eight;

    @FXML
    private Label nine;

    @FXML
    private Label asterisk;

    @FXML
    private Label hashtag;

    private UtilisateurDAO util = new UtilisateurDAO() ;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }


}