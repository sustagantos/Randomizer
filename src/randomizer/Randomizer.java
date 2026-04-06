/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package randomizer;

import randomizer.RandomizerObj.FileType;
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
        
        /*
        //********testing buildLine function********
        RandomizerObj obj = new RandomizerObj(
                5, // columns
                10, // rows
                1, // minNumber
                100, // maxNumber
                65, // maxAge
                5000.0f, // maxWage
                FileType.TXT // fileType
        );
        System.out.println(obj.generateDataset());
        
        String exampleHeader = obj.generateHeader(",");
        System.out.println(exampleHeader);
        
        
        ********testing utils class********
        System.out.println("testing utils class:    ");
        System.out.println("random ip: "+Utils.generateRandomIp());
        System.out.println("random number: "+Utils.generateRandomNumber(10,1));
        System.out.println("random wage: "+Utils.generateRandomWage(10000,1500));
        System.out.println("random age: "+Utils.generateRandomAge(60,15));
        System.out.println("random date: "+Utils.generateRandomDate(365));
        System.out.println("random time: "+Utils.generateRandomTime());
         */
    }

}
