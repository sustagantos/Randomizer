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

    public enum FileType {
        TXT,
        CSV
    }

    private int columns;
    private int rows;
    private int floor;
    private int ceiling;
    private final int minimumAge = (int) 18;
    private int maxAge;
    private float maxMoney;
    private final float minimumWage = (float) 1621.00;
    private FileType fileType;
    private final Random random;

    public RandomizerObj(int columns, int rows, int floor, int ceiling,
            int maxAge, float maxMoney, FileType fileType) {

        this.columns = columns;
        this.rows = rows;
        this.floor = floor;
        this.ceiling = ceiling;
        this.maxAge = maxAge;
        this.maxMoney = maxMoney;
        this.fileType = fileType;
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

    public FileType getFileType() {
        return fileType;
    }

    public void setFileType(FileType fileType) {
        this.fileType = fileType;
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

    public float getMinimumWage() {
        return minimumWage;
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
    public void printHeader(String separator) {
        System.out.printf("idade%ssalario (em R$)", separator);
        for (int i = 1; i < columns + 1; i++) {
            System.out.printf("%scoluna %d", separator, i);
        }
        System.out.printf("\n");
    }

    public void printRow(String separator) {
        int randomAge = random.nextInt(this.maxAge - this.minimumAge + 1) + this.minimumAge;
        float randomWage = random.nextFloat(this.maxMoney - this.minimumWage + 1) + this.minimumWage;

        System.out.printf("%d%s%.2f", randomAge, separator, randomWage);
        for (int i = 1; i <= columns; i++) {
            int randomNumber = random.nextInt(this.ceiling - this.floor + 1) + this.floor;
            System.out.printf("%s%d", separator, randomNumber);
        }
        System.out.printf("\n");
    }

    public void printEverything() {
        String separator = this.fileType.equals(FileType.CSV) ? "," : "\t";
        this.printHeader(separator);
        for (int i = 0; i < this.rows; i++) {
            this.printRow(separator);
        }
    }

    public String generateHeader(String separator) {
        StringBuilder sb = new StringBuilder();
        sb.append("idade").append(separator).append("salario");

        for (int i = 1; i <= columns; i++) {
            sb.append(separator).append("coluna").append(i);
        }

        return sb.toString();
    }

    public String generateRow(String separator) {
        StringBuilder sb = new StringBuilder();
        int randomAge = random.nextInt(maxAge - minimumAge + 1) + minimumAge;
        float randomWage = random.nextFloat(maxMoney - minimumWage) + minimumWage;

        sb.append(randomAge)
                .append(separator)
                .append(String.format("%.2f", randomWage));

        for (int i = 1; i <= columns; i++) {
            int randomNumber = random.nextInt(ceiling - floor + 1) + floor;
            sb.append(separator).append(randomNumber);
        }

        return sb.toString();
    }

    public String generateDataset() {
        String separator = (fileType == FileType.CSV) ? "," : "\t";
        StringBuilder sb = new StringBuilder();

        sb.append(generateHeader(separator)).append("\n");

        for (int i = 0; i < rows; i++) {
            sb.append(generateRow(separator)).append("\n");
        }

        return sb.toString();
    }
}
