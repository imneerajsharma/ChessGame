package main;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!"); // Print "Hello world!" to console

        // Create a new JFrame window with the title "Simple Chess Game"
        JFrame window = new JFrame("Simple Chess Game");

        // Set the default close operation to exit the application when the window is closed
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Disable window resizing
        window.setResizable(false);

        // Create a new instance of the GamePanel class
        GamePanel gp = new GamePanel();

        // Add the GamePanel to the JFrame window
        window.add(gp);

        // Pack the components within the window to their preferred sizes
        window.pack();

        // Center the window on the screen
        window.setLocationRelativeTo(null);

        // Make the window visible
        window.setVisible(true);

        // Start the game loop by calling the launchGame method of the GamePanel instance
        gp.launchGame();
    }
}
