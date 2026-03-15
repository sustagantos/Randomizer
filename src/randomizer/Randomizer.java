/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package randomizer;

import ui.MainWindow;

/**
 *
 * @author messi
 */
public class Randomizer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        java.awt.EventQueue.invokeLater(() -> {
            new MainWindow().setVisible(true);
        });

    }

}
