package hellofx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;



public class HelloFX extends Application {

    @Override
    public void start(Stage stage) {
    	
		
        String javaVersion = System.getProperty("java.version");
        String javafxVersion = System.getProperty("javafx.version");
        Label helloLabel = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
        Scene scene = new Scene(new StackPane(helloLabel), 640, 480);
        stage.setScene(scene);
        stage.show();
        threadTest test=new threadTest();   
	     test.start();      }

    public static void main(String[] args) {
        launch();

    }

    
   
       
    
    
}