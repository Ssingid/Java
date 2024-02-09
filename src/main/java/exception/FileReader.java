package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader{
    public String readFile(String filePath) {
        String printFileData = "";
        try(Scanner sc = new Scanner(new File(filePath))) {
            while(sc.hasNextLine()) {
                String data = sc.nextLine();
                printFileData += data;
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException("File not found");
        }
        return printFileData;
    }
}
