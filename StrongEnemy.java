public class StrongEnemy extends AbstractEnemy {
    
    public StrongEnemy(double h, double s) { 
//define health and speed later; health>normal enemy and speed<normal enemy
        super(h, s, new Pane(new Rectangle()));
    }
    
}
