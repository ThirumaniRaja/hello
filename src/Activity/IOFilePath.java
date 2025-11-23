package Activity;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedList;

public class IOFilePath {
    public static void main(String[] args) throws java.io.IOException {
        Path f = java.nio.file.Path.of("data","todo.txt");
        String contentFiles = Files.readString(f);
//        System.out.println(contentFiles);
        LinkedList<String> output = new LinkedList<>();

//        for(String content : contentFiles.split("\\r")){
        String[] lines = contentFiles.split("\\R");
        for(String content : lines){

            String str = content.trim();
                    if(!str.isEmpty() && !output.contains(str)){
                        output.add(str);
                    }
        }

        String updatedFileCOntent = String.join(" ",output);
        Files.writeString(f,updatedFileCOntent);

        System.out.println(updatedFileCOntent);
    }

//    how to implement we need to check
    public static String normalize(String fileContent) throws IOException {
        Path f = java.nio.file.Path.of("data","todo.txt");

        LinkedList<String> output = new LinkedList<>();
        String contentFiles = Files.readString(f);

//        for(String content : contentFiles.split("\\r")){
        String[] lines = contentFiles.split("\\R");
        for(String content : lines){

            String str = content.trim();
            if(!str.isEmpty() && !output.contains(str)){
                output.add(str);
            }
        }

        String updatedFileCOntent = String.join(" ",output);
        Files.writeString(f,updatedFileCOntent);

        return String.join(System.lineSeparator(),output);
    }
}
