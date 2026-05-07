package engine;
/*Adds Canvas or the drawing platform to the JFrame */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.List;
import java.util.ArrayList;

public class AnimationCanvas extends JPanel{
    List<SceneObject> objects=new ArrayList<>(List.of(
            new CircleObject(100, 200, 60, Color.RED),
            new RectObject(100,400,60,30, Color.MAGENTA)
    ));
    public AnimationCanvas(){
        refreshCanvas.start();
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(new Color(200, 250, 250));
        g.fillRect(0, 0, getWidth(), getHeight());
        for(SceneObject o:objects)
            o.draw(g);
    }
    ActionListener move=new ActionListener(){
        public void actionPerformed(ActionEvent ae){
            for(SceneObject o:objects)
                o.update(getWidth());
            repaint();
        }
    };
    Timer refreshCanvas = new Timer(16, move);

}