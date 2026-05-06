import javax.swing.JFrame;
public class Main {
    public static void main(String[] args) {
        JFrame jf=new JFrame();
        jf.setTitle("Animation Studio");
        jf.setSize(800,600);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(new AnimationCanvas());
        jf.setVisible(true);
    }
}