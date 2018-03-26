/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w18comp1011s2mar26;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

/**
 * FXML Controller class
 *
 * @author JWright
 */
public class SuperAwesomeChartViewController implements Initializable
{
    @FXML   private BarChart barChart;
    @FXML   private CategoryAxis months;
    @FXML   private NumberAxis bumblebees;
            private XYChart.Series beeCount2017;
            private XYChart.Series beeCount2018;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        //initialize the chart series
        beeCount2017 = new XYChart.Series<>();
        beeCount2018 = new XYChart.Series<>();
        
        //add labels to the chart
        months.setLabel("Months");
        bumblebees.setLabel("BumbleBee Population");
        
        //give names to the data series (it will show in the legend)
        beeCount2017.setName("2017");
        beeCount2018.setName("2018");
        
        
    }    
    
}
