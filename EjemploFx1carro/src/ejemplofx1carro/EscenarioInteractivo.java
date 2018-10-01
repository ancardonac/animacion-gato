/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplofx1carro;

/**
 *
 * @author Estudiante
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
public class EscenarioInteractivo extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        Pane layout = new Pane();
        Canvas canvas = new Canvas(300,300);
        layout.getChildren().add(canvas);
        Scene escena = new Scene(layout, 300, 300, Color.AQUA);
        primaryStage.setScene(escena);
        primaryStage.steTitle("Ejemplo");
        primaryStage.show();
        
        
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
  
    
    
    
    
}
