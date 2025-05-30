package com.ussd.ussdplateform;

import com.ussd.ussdplateform.entities.Utilisateur;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main extends Application {

    public static void main(String[] args) {
        // Tester la connexion avant de lancer l'application JavaFX
        if (testDatabaseConnection() && testHibernateConnection()) {
           launch() ;

        } else {
            System.out.println("Échec de la connexion à la base de données.");
        }
    }
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("ussd.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("USSD PLATEFORME");
        stage.setScene(scene);
        stage.show();
    }


    private static boolean testDatabaseConnection() {
        String url = "jdbc:mysql://localhost:3306/USSDPlateform?useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC";
        String username = "root";
        String password = "artemis_2005";

        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            System.out.println("Connexion réussie !");
            return true; // Connexion réussie
        } catch (SQLException e) {
            e.printStackTrace();
            return false; // Échec de la connexion
        }
    }

    // Test de la connexion via Hibernate
    private static boolean testHibernateConnection() {
        try {
            // Créer un EntityManagerFactory pour tester la connexion à la base de données via Hibernate
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
            if (emf != null) {
                System.out.println("Connexion Hibernate réussie !");
                emf.close();
                return true;
            } else {
                System.out.println("Échec de la connexion Hibernate.");
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}