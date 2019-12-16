package app;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Run extends Application {


    @Override
    public void start(Stage primaryStage){
        //Creates a Button Object
        Button button1 = new Button("Submit");
        button1.setAlignment(Pos.CENTER);
        button1.setStyle("-fx-background-color: LightBlue");

        button1.setOnAction(event -> {
            System.out.println("Submit Clicked!!");
        });

        button1.setOnAction(event -> {
            System.out.println("Submit Clicked!!");
        });

        //Makes the Button a Child
        StackPane stackPane = new StackPane();
        stackPane.getChildren().add(button1);

        Scene scene= new Scene(stackPane, 200, 250);

        //Creates the Scene
        primaryStage.setScene(scene);

        //Creates the Stage
        primaryStage.setTitle("Example 1");
        primaryStage.show();
//----------------------------------------------------------------------------------------------------
        Stage stage = new Stage();
        stage.setTitle("Example 2");

        Button button2 = new Button("Submit");
        Label label1 = new Label("this is a label");
        button2.setStyle("-fx-background-color: rgb(157, 138, 176)");

        FlowPane flowPane = new FlowPane();
        flowPane.getChildren().add(button2);
        flowPane.getChildren().add(label1);

        Scene scene2 = new Scene(flowPane, 200, 250);
        stage.setScene(scene2);

        button2.setOnAction(event -> {
            System.out.println("Submit Clicked!!");
        });

        stage.show();

//------------------------------------------------------------------------------
        Stage stage1 = new Stage();
        stage1.setTitle("Example 3");

        Button button3 = new Button("Submit");
        BorderPane.setAlignment(button3, Pos.BOTTOM_CENTER);
        Label label2 = new Label("HELLO!");
        BorderPane.setAlignment(label2, Pos.CENTER);

        BorderPane borderPane = new BorderPane();
        borderPane.setBottom(button3);
        borderPane.setCenter(label2);

        Scene scene3 = new Scene(borderPane, 200, 250);
        stage1.setScene(scene3);

        button3.setOnAction(event -> {
            System.out.println("Submit Clicked!!");
        });

        stage1.show();
    }

    public static void main(String[] args) {
        //This makes the window display
        launch(args);
    }

}


