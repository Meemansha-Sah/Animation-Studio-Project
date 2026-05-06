import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class AnimationCanvas extends JPanel{
    int x = 0,y=300;
    public AnimationCanvas(){
        refreshRect.start();
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(new Color(200, 250, 250));
        g.fillRect(0, 0, getWidth(), getHeight());

        g.setColor(new Color(250, 200, 200));
        g.fillRect(x, y, 100, 30);

    }
    ActionListener move=new ActionListener(){
        public void actionPerformed(ActionEvent ae){
            if(x==(getWidth()-100))x=0;
            x+=2;
            repaint();
        }
    };
    Timer refreshRect = new Timer(16, move);

}