
package engine;
import java.awt.*;
/*Class for making objects to add to the Canvas*/
abstract class SceneObject{
    int x;
    int y;
    int width;
    int height;
    Color color;
    public SceneObject(int x, int y, int width, int height,Color color){
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
        this.color=color;
    }
    public abstract void draw(Graphics g);
}