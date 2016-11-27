/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokedexpoo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.Group;
import  javafx.scene.control.*;

/**
 *
 * @author lu_u_
 */
public class PokeDexPOO extends Application
{
    

    public void start(Stage primaryStage)
    {
        Group group = new Group(); 
        Scene scene = new Scene(group, 690, 510); 
        Label label = new Label("NOME");
        group.getChildren().addAll(label); 
        primaryStage.setScene(scene);
            
        primaryStage.setTitle("POKEDEX");
        
        primaryStage.show();
    }
    public static void main(String[] args) 
    {
        launch(args);
    }
    
}
