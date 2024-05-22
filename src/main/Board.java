package main;

import java.awt.*;

public class Board {
    // Constants for board dimensions and square size
    final int MAX_COL = 8;
    final int MAX_ROW = 8;
    public static final int SQUARE_SIZE = 100;
    public static final int HALF_SQUARE_SIZE = SQUARE_SIZE / 2;

    // Method to draw the chess board
    public void draw(Graphics g2) {
        int colorCode = 0; // Variable to alternate square colors

        // Loop through each row and column of the board
        for (int row = 0; row < MAX_ROW; row++) {
            for (int col = 0; col < MAX_COL; col++) {
                // Set the color based on the color code
                if (colorCode == 0) {
                    g2.setColor(new Color(210, 165, 125)); // Light color
                    colorCode = 1; // Switch color code
                } else {
                    g2.setColor(new Color(175, 115, 70)); // Dark color
                    colorCode = 0; // Switch color code
                }

                // Draw a square at the current position
                // Parameters: x-coordinate, y-coordinate, width, height
                g2.fillRect(col * SQUARE_SIZE, row * SQUARE_SIZE, SQUARE_SIZE, SQUARE_SIZE);
            }

            // Switch color code at the end of each row
            if (colorCode == 0)
                colorCode = 1;
            else
                colorCode = 0;
        }
    }
}
