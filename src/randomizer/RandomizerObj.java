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
    private int minNumber;
    private int maxNumber;
    private final int minAge = (int) 18;
    private int maxAge;
    private final float minWage = (float) 1621.00;
    private float maxWage;
    private FileType fileType;
    private final Random random;

    public RandomizerObj(int columns, int rows, int minNumber, int maxNumber,
            int maxAge, float maxWage, FileType fileType) {

        this.columns = columns;
        this.rows = rows;
        this.minNumber = minNumber;
        this.maxNumber = maxNumber;
        this.maxAge = maxAge;
        this.maxWage = maxWage;
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

    public int getminNumber() {
        return minNumber;
    }

    public FileType getFileType() {
        return fileType;
    }

    public void setFileType(FileType fileType) {
        this.fileType = fileType;
    }

    public void setminNumber(int minNumber) {
        this.minNumber = minNumber;
    }

    public int getmaxNumber() {
        return maxNumber;
    }

    public void setmaxNumber(int maxNumber) {
        this.maxNumber = maxNumber;
    }

    public int getminAge() {
        return minAge;
    }

    public int getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(int maxAge) {
        this.maxAge = maxAge;
    }

    public float getmaxWage() {
        return maxWage;
    }

    public void setmaxWage(float maxWage) {
        this.maxWage = maxWage;
    }

    public float getminWage() {
        return minWage;
    }

    @Override
    public String toString() {
        return "RandomizerObj{" + "columns=" + columns + ", rows=" + rows + ", minNumber=" + minNumber + ", maxNumber=" + maxNumber + ", minAge=" + minAge + ", maxAge=" + maxAge + ", maxWage=" + maxWage + '}';
    }

    /*
    public void printRandomizer() {
        for (int i = 0; i < rows + 1; i++) {
            for (int j = 0; j < columns; j++) {
                if (i == 0) {
                    System.out.printf("a%d  ", j);
                } else {
                    int randomNumber = random.nextInt(this.maxNumber - this.minNumber + 1) + this.minNumber;
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
        int randomAge = random.nextInt(this.maxAge - this.minAge + 1) + this.minAge;
        float randomWage = random.nextFloat(this.maxWage - this.minWage + 1) + this.minWage;

        System.out.printf("%d%s%.2f", randomAge, separator, randomWage);
        for (int i = 1; i <= columns; i++) {
            int randomNumber = random.nextInt(this.maxNumber - this.minNumber + 1) + this.minNumber;
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
        int randomAge = random.nextInt(maxAge - minAge + 1) + minAge;
        float randomWage = random.nextFloat(maxWage - minWage) + minWage;

        sb.append(randomAge)
                .append(separator)
                .append(String.format("%.2f", randomWage));

        for (int i = 1; i <= columns; i++) {
            int randomNumber = random.nextInt(maxNumber - minNumber + 1) + minNumber;
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
