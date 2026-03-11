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
        RandomizerObj randomizerObj = new RandomizerObj(3, 10, 1, 10, 18, 55, (float) 10000.00);
        System.out.println(randomizerObj.toString());
        
        //randomizerObj.printRandomizer();
        randomizerObj.printHeader();
        
        for(int i = 0; i<10 ; i++){
            randomizerObj.printRow();
        }
    }
    
}
