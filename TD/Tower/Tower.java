import java.util.ArrayList;
import javafx.event.EventHandler;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.Region;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Shape;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

public class Tower{
    
    //fields
    private int id = 0;
    private int cost = 0;
    private int dmg = 0;
    private int spd = 0;
    private int range = 0;
    private StackPane body = new StackPane();
    
    
    //constructor
    public Tower(){
        Rectangle rectangle = new Rectangle(30, 30);
        rectangle.setFill(Color.RED);
        rectangle.setStroke(Color.BLACK);
        rectangle.setStrokeWidth(1);
        Polygon triangle = new Polygon();
        triangle.getPoints().addAll(new Double[]{
            0.0, 0.0,
            10.0, 0.0,
            5.0, 8.66});
        triangle.setFill(Color.BLUE);
        body.getChildren().addAll(rectangle, triangle);
        
        cost = 100;
    }
    
    //getter setters
    public int getCost(){return cost;}
    public void setCost(int i){cost = i;}
    public int getDmg(){return dmg;}
    public void setDmg(int i){dmg = i;}
    public int getSpd(){return spd;}
    public void setSpd(int i){spd = i;}
    public void setRange(int i){range = i;}
    public int getRange(){return range;}
    public StackPane getBody(){return body;}
    
    //methods
    
}
