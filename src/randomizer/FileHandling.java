/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package randomizer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import randomizer.RandomizerObj.FileType;

/**
 *
 * @author messi
 */
public class FileHandling {

    private String name;
    private RandomizerObj randomizerObj;

    public FileHandling(String name, RandomizerObj randomizerObj) {
        this.name = name;
        this.randomizerObj = randomizerObj;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void saveToFile() {
        String fileName = name + "." + this.randomizerObj.getFileType().toString().toLowerCase();
        System.out.println(fileName);
        
        String content = this.randomizerObj.generateDataset();
        
        Path path = Path.of(fileName);
        try {
            Files.writeString(path, content);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
