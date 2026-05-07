package engine;
import java.awt.*;

class CircleObject extends SceneObject{
    public  CircleObject(int x, int y, int width,Color color){
        super(x,y,width,width,color);
    }
    public void draw(Graphics g){
        g.setColor(color);
        g.fillOval(x,y,width,width);
    }
}