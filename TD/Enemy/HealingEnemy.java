public class HealingEnemy extends AbstractEnemy {
    
    ArrayList<AbstractEnemy> enemiesInRange;
    ArrayList<AbstractEnemy> allEnemies;
    double healRate;
    double range;
    double[] centerPoint;
    
    public HealingEnemy(double h, double s, ArrayList<AbstractEnemies> e) { //define health and speed later;
        super(h, s, new Pane(new Rectangle()));
        allEnemies = e;
    }
    
    public void setEnemiesInRange() {
        setCenterPoint();
        ArrayList<AbstractEnemy> out = new ArrayList<AbstractEnemy>();
        for(AbstractEnemy e : allEnemies) {
            if(centerPoint[0]+range
        }
    }
    
    public void heal() {
        for(AbstractEnemy e : enemiesInRange) {
            e.setHealth(e.getHealth()+healRate);
        }
    }
    
    private void setCenterPoint() {
    
        centerPoint = new double[2];
        
        centerPoint[0] = (getBody().getLayoutX() + getBody().getWidth())/2;
        centerPoint[1] = (getBody().getLayoutY() + getBody().getHeight())/2;
        
    }
}
