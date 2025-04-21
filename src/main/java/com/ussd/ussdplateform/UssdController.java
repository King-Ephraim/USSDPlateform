package com.ussd.ussdplateform;

import com.ussd.ussdplateform.DAO.UtilisateurDAO;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;

import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static java.lang.System.exit;

public class UssdController implements Initializable {
    @FXML
    private Button zero;

    @FXML
    private Button one;

    @FXML
    private Button two;

    @FXML
    private Button three;

    @FXML
    private Button four;

    @FXML
    private Button five;

    @FXML
    private Button six;

    @FXML
    private Button seven;

    @FXML
    private Button eight;

    @FXML
    private Button nine;

    @FXML
    private Button asterisk;

    @FXML
    private Button hashtag;

    @FXML
    private StackPane call;

    @FXML
    private TextField display;

    @FXML
    private Label errorLabel;

    private Parent root ;

    private Scene scene;

    private Stage stage;

    @FXML
    private TextField menuInput;

    @FXML
    private Label errorMenuLabel;




    //private UtilisateurDAO util = new UtilisateurDAO() ;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println("initializing ...");
    }

    @FXML
    void astericClick(MouseEvent event) {
        getButtonValue(asterisk);
    }

    @FXML
    public void callClick(MouseEvent event) {
        if (display.getText().equals("*145#")) {
            System.out.println("code valide");
            errorLabel.setText("... chargement ...");

            // Exécuter la tâche dans un thread séparé
            new Thread(() -> {
                try {
                    // Simuler un délai
                    Thread.sleep(2000);

                    // Charger la nouvelle scène sur le thread JavaFX
                    Platform.runLater(() -> {
                        try {
                            root = FXMLLoader.load(getClass().getResource("menu.fxml"));
                            stage = (Stage) call.getScene().getWindow();
                            scene = new Scene(root);
                            stage.setScene(scene);
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    });
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }).start();
        } else {
            display.setText("");
            errorLabel.setText("Veuillez entrer un code valide");
        }
    }


    @FXML
    void eightClick(MouseEvent event) {
        getButtonValue(eight);
    }

    @FXML
    void fiveClick(MouseEvent event) {
        getButtonValue(five);
    }

    @FXML
    void fourClick(MouseEvent event) {
        getButtonValue(four);
    }

    @FXML
    void hashClick(MouseEvent event) {
        getButtonValue(hashtag);
    }

    @FXML
    void nineClick(MouseEvent event) {
        getButtonValue(nine);
    }

    @FXML
    void oneClick(MouseEvent event) {
        getButtonValue(one);
    }

    @FXML
    void sevenClick(MouseEvent event) {
        getButtonValue(seven);
    }

    @FXML
    void sixClick(MouseEvent event) {
        getButtonValue(six);
    }

    @FXML
    void threeClick(MouseEvent event) {
        getButtonValue(three);
    }

    @FXML
    void twoClick(MouseEvent event) {
        getButtonValue(two);
    }

    @FXML
    void zeroClick(MouseEvent event) {
        getButtonValue(zero);
    }

    @FXML
    void delete(MouseEvent event) {
        String value = display.getText();
        if (value.length() > 0) {
            String newValue = value.substring(0, value.length() - 1);
            display.setText(newValue);
        }
    }


    public void getButtonValue(Button button){
       String value = button.getText();
       String valueInField = display.getText() + value ;
       display.setText(valueInField) ;
    }

    // ecouter les clics sur les boutons envoyer et annuler
    @FXML
    void cancel(MouseEvent event) {
        // vider tous les champs
        menuInput.clear();
    }

    @FXML
    void send(MouseEvent event) {
        String menuValue = menuInput.getText();

        switch (menuValue){
            case "1" ->{
                System.out.println("Creer un compte");
            }
            case "2" ->{
                System.out.println("Effectuer un achat");
            }
            case "3" ->{
                System.out.println("Effectuer un retrait");
            }
            case "4" ->{
                System.out.println("Effectuer un depot");
            }
            case "5" ->{
                System.out.println("Consulter mon compte");
            }
            case "6" ->{
                System.out.println("Consulter mon historique");
            }
            case "7" ->{
                exit(0) ;
            }

            default -> {
                errorMenuLabel.setText("Nous vous prions de bien vouloir choisir une option valide");
            }
        }

        viderChamps() ;

    }

    private  void viderChamps() {
        // Vider les champs de texte
        menuInput.clear();
    }
}