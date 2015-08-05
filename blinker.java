package blinker;
 
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
 
public class blinker extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Blinker v0.0.0");
        Button playBtn = new Button();
        playBtn.setText("Play");
        playBtn.setOnAction(new EventHandler<ActionEvent>() {
 
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Error: Not implemented!");
            }
        });
        Button helpBtn = new Button();
        helpBtn.setText("Controls");
        helpBtn.setOnAction(new EventHandler<ActionEvent>() {
 
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Error: Not implemented!");
            }
        });
        StackPane root = new StackPane();
        root.getChildren().add(playBtn);
        root.getChildren().add(helpBtn);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }
}
