/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package randomizer;

/**
 *
 * @author messi
 */
public class FileHandling {
    private String name;
    private String content;
    private RandomizerObj randomizer;
    
    public FileHandling(String name, String content, RandomizerObj randomizer) {
        this.name = name;
        this.content = content;
        this.randomizer = randomizer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    
    public void saveToFile(){
        if (this.randomizer.getFileType().equals(RandomizerObj.FileType.CSV)){
            //savetocsv
            return;
        } 
        //savetotxt
    }
}
