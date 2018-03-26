package w18comp1011s2mar26;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author JWright
 */
public class LaunchBeeGraph extends Application
{

    public static void main(String[] args)
    {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("SuperAwesomeChartView.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("Bee Counts");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
}
