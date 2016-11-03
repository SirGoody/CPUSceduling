package CPU;

/* Spencer Kolbus and Chase Goodman created on Nov 3rd, 2016 */


import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.event.*;

public class Main extends Application{

    public static void main(String[] args){
    launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("CS 376 CPU Scheduling");

        BorderPane layout = new BorderPane();

        Button done = new Button();
        TextField jobID = new TextField();
        TextField burstTime = new TextField();
        ChoiceBox<String> choiceBox = new ChoiceBox<>();

        //getItems returns the ObservableList object which you can add items to
        choiceBox.getItems().addAll("Round Robin", "First Come First Serve", "Shortest Job First");

        //Set a default value
        choiceBox.setValue("Round Robin");

        layout.setLeft(jobID);
        layout.setCenter(burstTime);
        layout.setBottom(done);
        layout.setTop(choiceBox);

        Scene scene = new Scene(layout, 500, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
