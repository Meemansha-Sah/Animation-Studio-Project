package engine;
/*Adds Canvas or the drawing platform to the JFrame */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class AnimationCanvas extends JPanel{
    CircleObject circle = new CircleObject(100, 300, 60, Color.RED);
    public AnimationCanvas(){
        refreshRect.start();
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(new Color(200, 250, 250));
        g.fillRect(0, 0, getWidth(), getHeight());
        circle.draw(g);

    }
    ActionListener move=new ActionListener(){
        public void actionPerformed(ActionEvent ae){
            if(circle.x==(getWidth()-100))circle.x=0;
            circle.x+=2;
            repaint();
        }
    };
    Timer refreshRect = new Timer(16, move);

}