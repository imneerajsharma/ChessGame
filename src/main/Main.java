package main;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        JFrame window =new JFrame("Simple Chess Game");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);

        // Add GamePanel to the window
        GamePanel gp = new GamePanel();
        window.add(gp);
        window.pack();

        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}