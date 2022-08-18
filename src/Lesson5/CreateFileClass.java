package Lesson5;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class CreateFileClass {
    public static ArrayList<FIleObject> fIleObjectArrayList = new ArrayList<>();
    public static final String pathToFile = "C://new/demo.csv";
    public static final String title = "value1"+ ";" + "value2"
            + ";" + "value3" + ";"+ System.getProperty("line.separator");

    public static void main(String[] args) throws IOException {
        createFileObjects();
        writer();
        read();
    }

    public static void createFileObjects(){
        Random random = new Random();
        for(int i=0;i<20;i++){
            fIleObjectArrayList.add( new FIleObject(random.nextInt(100), random.nextInt(100), random.nextInt(100)));
        }
    }

    public static void writer() throws IOException {
        try (FileWriter writer = new FileWriter(pathToFile)){
            writer.write(title);
            for(FIleObject fIleObject : fIleObjectArrayList) {
                writer.write(fIleObject.getValue1() + ";" + fIleObject.getValue2()
                        + ";" + fIleObject.getValue3() + ";"+ System.getProperty("line.separator"));
            }
        }
    }

    public static void read() throws IOException {
        try (FileReader reader = new FileReader(pathToFile)) {
            int a =
            reader.read();
        }
    }
}
