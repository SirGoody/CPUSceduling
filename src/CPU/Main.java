package CPU;

//Spencer Kolbus and Chase Goodman created on Nov 3rd, 2016


import javafx.application.Application;
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

        StackPane layout = new StackPane();

        Scene scene = new Scene(layout, 500, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
