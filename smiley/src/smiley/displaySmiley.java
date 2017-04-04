package smiley;
import javax.swing.JFrame;

public class displaySmiley {

    public static void main(String[] args){

        drawSmiley panel  = new drawSmiley();
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(230,  250); 
        application.setVisible(true);

    }


}