
package main;

import java.util.ArrayList;
import java.util.List;

import classes.Customer;
import classes.Depot;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Run  extends Application{
    public static int m = 0; // Maximum number of vehicles available in each depot
    public static int n = 0; // Total number of customers
    public static int t = 0; // Number of depots

    public static List<Depot> depots = new ArrayList<>();
    public static List<Customer> customers = new ArrayList<>();

    // Start med random plassering i populasjonen

    public static void main(String[] args) {
        Data.ReadData("./src/Data Files/p01");

        System.out.println("Maximum number of vehicles available:\t" + m);
        System.out.println("Total number of customers:\t\t" + n);
        System.out.println("Number of depots:\t\t\t" + t);


        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/view/MainScreen.fxml"));
        primaryStage.setTitle("MDVRP");
        primaryStage.setScene(new Scene(root, 800, 500));
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}