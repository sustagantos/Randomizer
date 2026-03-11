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
public class RandomizerObj {

    private int columns;
    private int rows;
    private int floor;
    private int ceiling;
    private int minimumAge;
    private int maxAge;
    private float maxMoney;
    private final float minimumWage = (float) 1621.00;
    private Random random;

    public RandomizerObj(int columns, int rows, int floor, int ceiling, int minimumAge, int maxAge, float maxMoney) {
        this.columns = columns;
        this.rows = rows;
        this.floor = floor;
        this.ceiling = ceiling;
        this.minimumAge = minimumAge;
        this.maxAge = maxAge;
        this.maxMoney = maxMoney;
        this.random = new Random();
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getCeiling() {
        return ceiling;
    }

    public void setCeiling(int ceiling) {
        this.ceiling = ceiling;
    }

    public int getMinimumAge() {
        return minimumAge;
    }

    public void setMinimumAge(int minimumAge) {
        this.minimumAge = minimumAge;
    }

    public int getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(int maxAge) {
        this.maxAge = maxAge;
    }

    public float getMaxMoney() {
        return maxMoney;
    }

    public void setMaxMoney(float maxMoney) {
        this.maxMoney = maxMoney;
    }

    @Override
    public String toString() {
        return "RandomizerObj{" + "columns=" + columns + ", rows=" + rows + ", floor=" + floor + ", ceiling=" + ceiling + ", minimumAge=" + minimumAge + ", maxAge=" + maxAge + ", maxMoney=" + maxMoney + '}';
    }

    /*
    public void printRandomizer() {
        for (int i = 0; i < rows + 1; i++) {
            for (int j = 0; j < columns; j++) {
                if (i == 0) {
                    System.out.printf("a%d  ", j);
                } else {
                    int randomNumber = random.nextInt(this.ceiling - this.floor + 1) + this.floor;
                    System.out.printf("%d  ", randomNumber);
                }
            }
            System.out.printf("\n");
        }
    }
    */
    
    public void printHeader(){
        System.out.printf("idade\tsalario");
        for(int i=1; i < columns+1; i++){
            System.out.printf("\tc%d",i);
        }
        System.out.printf("\n");
    }
    
    public void printRow(){
        int randomAge = random.nextInt(this.maxAge - this.minimumAge + 1) + this.minimumAge;
        float randomWage = random.nextFloat(this.maxMoney - this.minimumWage + 1) + this.minimumWage;
        
        System.out.printf("%d\t%f", randomAge, randomWage);
        for(int i=1; i < columns+1; i++){
            int randomNumber = random.nextInt(this.ceiling - this.floor + 1) + this.floor;
            System.out.printf("\t%d", randomNumber);
        }
        System.out.printf("\n");
    }
}
