package application;
 
 
  import javafx.application.Application;
  import javafx.event.ActionEvent;
  import javafx.event.EventHandler;
  import javafx.scene.Scene;
  import javafx.scene.control.Button;
  import javafx.scene.control.Label;
  import javafx.stage.Stage;
  import javafx.scene.Group;
 
  
  public class Main extends Application {
 	
 
 
 
 	public static void main(String[] args) {
         launch(args);
     }
         
     
     @Override
     public void start(Stage primaryStage) {
 	 
      Button btn = new Button();
       final Label brave = new Label();
     
      primaryStage.setTitle("Using a Button");
 
      brave.setLayoutX(175);
      brave.setLayoutY(150);
 
      btn.setLayoutX(175);
      btn.setLayoutY(250);
      btn.setText("Press me if you dare!");
      
      btn.setOnAction(new EventHandler<ActionEvent>() {
 
          @Override
          public void handle(ActionEvent event) {
            brave.setText("You are a brave one!");
     }
     
      });
      
      Group root1 = new Group();
 
      root1.getChildren().add(btn);
      root1.getChildren().add(brave);
      primaryStage.setScene(new Scene(root1, 500, 500));
      primaryStage.show();
    }
 
 }
