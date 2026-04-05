/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package randomizer;

import java.util.Random;

/**
 *
 * @author messi
 */
public class Utils {
    private static final Random random = new Random();
    
    public static String generateIp(){
        return random.nextInt(256) + "." +
               random.nextInt(256) + "." +
               random.nextInt(256) + "." +
               random.nextInt(256);
    }
    
    public static int generateRandomNumber(int maxNumber, int minNumber){
        int randomNumber = random.nextInt(maxNumber - minNumber + 1) + minNumber;
        return randomNumber;
    }
    
    public static float generateRandomWage(float maxWage, float minWage){
        float randomWage = random.nextFloat(maxWage - minWage) + minWage;
        return randomWage;
    }
    
    public static int generateRandomAge(int maxAge, int minAge){
        int randomAge = random.nextInt(maxAge - minAge + 1) + minAge;
        return randomAge;
    }
}
