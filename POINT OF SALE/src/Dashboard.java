
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Dashboard extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        try{
            Parent parentroot = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
            Scene scene = new Scene(parentroot,400,400);
            scene.getStylesheets().add(getClass().getResource("Style.css").toExternalForm());
            primaryStage.setTitle("Welcome to Binis Computer Shop");
            primaryStage.setScene(scene);
            primaryStage.show();
            
        
        }catch(Exception ex){
            System.err.println(ex.getMessage());
            System.exit(0);
        
        }
    }
    public static void main(String[]args){
        launch(args);
    }
    
}
