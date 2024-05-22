package main;

import java.awt.*;
import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable {
    // Constants for panel dimensions and frames per second
    public static final int WIDTH = 1100;
    public static final int HEIGHT = 800;
    final int FPS = 60;

    // Thread for the game loop
    Thread gameThread;

    // Instance of the game board
    Board board = new Board();

    // Constructor
    public GamePanel() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT)); // Set panel dimensions
        setBackground(Color.black); // Set background color
    }

    // Method to start the game loop
    public void launchGame() {
        gameThread = new Thread(this); // Create a new thread with 'this' Runnable instance
        gameThread.start(); // Start the thread
    }

    // Game loop logic
    @Override
    public void run() {
        // Game Loop
        double drawInterval = 1000000000.0 / FPS; // Calculate draw interval based on FPS
        double delta = 0; // Initialize delta time accumulator
        long lastTime = System.nanoTime(); // Get the current system time in nanoseconds
        long currentTime; // Variable to hold current time during each iteration

        while (gameThread != null) { // Main game loop
            currentTime = System.nanoTime(); // Get current time
            delta += (currentTime - lastTime) / drawInterval; // Accumulate delta time
            lastTime = currentTime; // Update lastTime for next iteration

            if (delta >= 1) { // If enough time has passed for a frame to be drawn
                update(); // Update game state
                repaint(); // Repaint the panel
                delta--; // Decrement delta to keep track of the next frame
            }
        }
    }

    // Method to update game state
    private void update() {
        // Add game logic here
    }

    // Method to paint the component
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g); // Call superclass method to paint the panel

        Graphics2D g2 = (Graphics2D) g; // Cast Graphics object to Graphics2D
        board.draw(g2); // Draw the game board
    }
}
