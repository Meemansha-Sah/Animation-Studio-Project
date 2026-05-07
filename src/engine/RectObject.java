package engine;
import java.awt.*;

class RectObject extends SceneObject{
    public RectObject(int x, int y, int width,int height,Color color){
        super(x,y,width,height,color);
    }
    public void draw(Graphics g){
        g.setColor(color);
        g.fillRect(x,y,width,height);
    }
    public void update(int canvasWidth){
        if(x>=(canvasWidth-width))x=0;
        x+=2;
    }
}