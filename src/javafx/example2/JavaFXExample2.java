/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx.example2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Luis
 */
public class JavaFXExample2 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
       primaryStage.setTitle("JavaFX Welcome");
       primaryStage.show();
       
       //GridPane with Gap and Padding Properties
        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setHgap(10);
        root.setVgap(10);
        root.setPadding(new Insets(25,25,25,25));
        
        
        Scene scene = new Scene(root, 400, 350);
        primaryStage.setScene(scene);
        
        //Inizializamos la variable stylesheet para añadirle el documento CSS
        scene.getStylesheets().add(JavaFXExample2.class.getResource("/resources/css/Login.css").toExternalForm());
         
        
        //Add Text, Labels, and Text Fields
        Text sceneTitle = new Text("Welcome");
        
        
        //sceneTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        //creamos un id para identificarlos en el css
        sceneTitle.setId("welcome-text");
        
        //añadimos la el titulo de la escena
        root.add(sceneTitle, 0,0,2,1);
        
        //añadimos el objeto tipo Text que aparece al presionar el boton 
        final Text actiontarget = new Text();
        root.add(actiontarget, 1, 6);
        //creamos un id para el action target
        actiontarget.setId("actiontarget");
        
        //añadimos el label de username
        Label userName = new Label("User Name: ");
        root.add(userName, 0, 1);
        
        TextField userTextField = new TextField();
        root.add(userTextField,1,1);
        
        
        //añadimos el label de password
        Label pw = new Label("Password: ");
        root.add(pw, 0, 2);
        
        PasswordField pwBox = new PasswordField();
        root.add(pwBox, 1, 2);
        
        
        //Add botton and text
        Button btn2 = new Button("Sign in");
        HBox hbBtn = new HBox(10);
        
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn2);
        root.add(hbBtn, 1, 4);
        
        //añadimos el codigo del evento
        btn2.setOnAction(new EventHandler<ActionEvent>(){
            
            public void handle(ActionEvent e){
                //actiontarget.setFill(Color.FIREBRICK);
                actiontarget.setText("Sign in button pressed");
            }
        });
        
        
        primaryStage.setTitle("Form with javaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
       
       
       
        }
        
            
       
    

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        launch(args);
    }
    
}
