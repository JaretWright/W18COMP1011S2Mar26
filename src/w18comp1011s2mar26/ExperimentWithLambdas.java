package w18comp1011s2mar26;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author JWright
 */
public class ExperimentWithLambdas extends Application
{
    
    @Override
    public void start(Stage primaryStage)
    {
        VBox vbox = new VBox();
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        
        Button btn2 = new Button("Henrique's Button");
        
        vbox.getChildren().add(btn);
        vbox.getChildren().add(btn2);
        
        //Using our custom EventHandler class
        SayHelloButtonHandler btnHandler = new SayHelloButtonHandler();
        btn2.setOnAction(btnHandler);
        
//        btn.setOnAction(new EventHandler<ActionEvent>()
//        {
//            
//            @Override
//            public void handle(ActionEvent event)
//            {
//                System.out.println("Hello World! Button 1!");
//            }
//        });

        btn.setOnAction((event)->System.out.println("Button 1 pushed"));
        


        
        StackPane root = new StackPane();
        root.getChildren().add(vbox);
//        root.getChildren().add(btn);
//        root.getChildren().add(btn2);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        launch(args);
    }
    
}
