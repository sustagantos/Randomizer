/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package randomizer;

/**
 *
 * @author messi
 */
public class Randomizer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RandomizerObj randomizerObj = new RandomizerObj(3, 3, 1, 10, 55,
                (float) 10000.00, RandomizerObj.FileType.CSV);
        
        System.out.println(randomizerObj.toString());
        //randomizerObj.printEverything();
        
        String test = randomizerObj.generateDataset();
        
        System.out.println(test);
    }

}
