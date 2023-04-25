import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
    MyFrame() {
        this.setTitle("Game"); //set title frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // stop program ketika di close
        this.setResizable(false); // ga bisa di resize
        this.setSize(600, 600); //set ukuran frame
        this.setVisible(true); // set visible = true, jadi frame nya muncul
        

        // ICON FRAME
        ImageIcon image = new ImageIcon("public/logo.png"); //buat imageicon logo
        this.setIconImage(image.getImage()); //ngerubah icon frame

        // BACKGROUND FRAME
        this.getContentPane().setBackground(new Color(255,255,255));
    }
}
