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
        
        //initialize the graph with months so that any new data will go in the
        //desired order
        beeCount2017.getData().add(new XYChart.Data("January", 0));
        beeCount2017.getData().add(new XYChart.Data("February", 0));
        beeCount2017.getData().add(new XYChart.Data("March", 0));
        beeCount2017.getData().add(new XYChart.Data("April", 0));
        beeCount2017.getData().add(new XYChart.Data("May", 0));
        beeCount2017.getData().add(new XYChart.Data("June", 0));
        beeCount2017.getData().add(new XYChart.Data("July", 0));
        beeCount2017.getData().add(new XYChart.Data("August", 0));
        
        //add data to the graphs
        getDataForGraph();
        
        barChart.getData().addAll(beeCount2017);
        barChart.getData().addAll(beeCount2018);
    }    
    
    /**
     * This method will typically get data from a database or other data input
     * such as a JSON file
     */
    public void getDataForGraph()
    {
        beeCount2017.getData().add(new XYChart.Data("April", 1500));
        beeCount2017.getData().add(new XYChart.Data("August", 1650));
        beeCount2017.getData().add(new XYChart.Data("February", 1100));
        beeCount2017.getData().add(new XYChart.Data("January", 1000));
        beeCount2017.getData().add(new XYChart.Data("June", 1800));
        beeCount2017.getData().add(new XYChart.Data("July", 1800));
        beeCount2017.getData().add(new XYChart.Data("March", 1200));      
        beeCount2017.getData().add(new XYChart.Data("May", 1700));
       
        
        
        beeCount2018.getData().add(new XYChart.Data("January", 800));
        beeCount2018.getData().add(new XYChart.Data("February", 900));
        beeCount2018.getData().add(new XYChart.Data("March", 1000));
    }
    
}
