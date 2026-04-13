/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package randomizer;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
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
    private final int maxDate = (int) 365;
    private FileType fileType;
    private static final Random random = new Random();
    //static means every instance of RandomizerObj shares same Random obj
    //final means we can't reassign the value

    public RandomizerObj(int columns, int rows, int minNumber, int maxNumber,
            int maxAge, float maxWage, FileType fileType) {

        this.columns = columns;
        this.rows = rows;
        this.minNumber = minNumber;
        this.maxNumber = maxNumber;
        this.maxAge = maxAge;
        this.maxWage = maxWage;
        this.fileType = fileType;
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

    public String generateHeader(String separator) {
        List<Object> values = new ArrayList<>(List.of(
                "data", "hora", "ip", "idade", "salario"
        ));

        for (int i = 1; i <= columns; i++) {
            values.add("coluna " + i);
        }

        return Utils.buildLine(values, separator);
    }

    public String generateRow(String separator) {
        LocalDate randomDate = Utils.generateRandomDate(this.maxDate);
        LocalTime randomTime = Utils.generateRandomTime();
        String ip = Utils.generateRandomIp();
        int randomAge = Utils.generateRandomAge(this.maxAge, this.minAge);
        float randomWage = Utils.generateRandomWage(this.maxWage, this.minWage);

        List<Object> values = new ArrayList<>(List.of(
                randomDate,
                randomTime,
                ip,
                randomAge,
                String.format(Locale.US, "%.2f", randomWage)
        ));

        for (int i = 1; i <= columns; i++) {
            values.add(Utils.generateRandomNumber(this.maxNumber, this.minNumber));
        }

        return Utils.buildLine(values, separator);
    }

    public String generateDataset() {
        String separator = (this.fileType == FileType.CSV) ? "," : "\t";
        StringBuilder sb = new StringBuilder();

        sb.append(generateHeader(separator)).append("\n");

        for (int i = 0; i < rows; i++) {
            sb.append(generateRow(separator)).append("\n");
        }

        return sb.toString();
    }
}
