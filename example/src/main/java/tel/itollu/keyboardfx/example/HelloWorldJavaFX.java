package tel.itollu.keyboardfx.example;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloWorldJavaFX extends Application{
    public static void main(String[] args){
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage){
        primaryStage.setTitle("Hello World!");
        Button helloButton = new Button();
        helloButton.setText("Say 'Hello World'");
        helloButton.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent t) {
                System.out.println("Hello World!");
            }
        });
        
        StackPane helloStackPane = new StackPane();
        helloStackPane.getChildren().add(helloButton);
        primaryStage.setScene(new Scene(helloStackPane, 300, 250));
        primaryStage.show();
    }
}
