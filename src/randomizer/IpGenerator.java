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
public class IpGenerator {
    private static final Random random = new Random();
    
    public static String generateIp(){
        return random.nextInt(256) + "." +
               random.nextInt(256) + "." +
               random.nextInt(256) + "." +
               random.nextInt(256);
    }
}
