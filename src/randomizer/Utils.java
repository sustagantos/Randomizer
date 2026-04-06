/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package randomizer;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

/**
 *
 * @author messi
 */
public class Utils {
    private static final Random random = new Random();
    
    public static String generateRandomIp(){
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
    
    public static LocalDate generateRandomDate(int maxNumberOfDays){
        LocalDate now = LocalDate.now();
        LocalDate startDate = now.minusDays(maxNumberOfDays);
        
        long startEpochDay = startDate.toEpochDay();
        long endEpochDay = now.toEpochDay();
        
        long randomDay = ThreadLocalRandom.current()
                .nextLong(startEpochDay, endEpochDay + 1);
        
        return LocalDate.ofEpochDay(randomDay);
    }
    
    public static LocalTime generateRandomTime(){
        int hour = ThreadLocalRandom.current().nextInt(0, 24);
        int minute = ThreadLocalRandom.current().nextInt(0, 60);
        int second = ThreadLocalRandom.current().nextInt(0, 60);

        return LocalTime.of(hour, minute, second);
    }
    
    public static String buildLine(List<?> values, String separator) {
        return values.stream()
            .map(String::valueOf)
            .collect(Collectors.joining(separator));
}
}
