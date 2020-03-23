import javafx.scene.layout.Pane;

public abstract class AbstractEnemy {

    private static currentId = 0;
    private int id;
    private double health;
    private double speed;
    private Pane body;
    
    public AbstractEnemy(double h, double s, Pane b) {
    
        health = h;
        body = b;
        id = currentId;
        currentId++;
        
    }
    
    public int getId() return id;
    public double getHealth() return health;
    public double getSpeed() return speed;
    public Pane getBody() return body;
    
    public void setSpeed(double s) speed = s;
    public void setHealth(double h) health = h;
    
    public void hit(Shot s) {
        if(intersects(s))
            health -= s.getDamage();
    }
    
    public void move() {
    
    }
    
    private boolean intersects(Shot s) {
        Pane sBody = s.getBody();
        return body.getBoundsInParent().intersects(sBody.getBoundsInParent());
    }
    
}
