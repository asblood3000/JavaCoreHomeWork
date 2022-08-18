package Lesson5;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class CreateFileClass {
    public static ArrayList<FIleObject> fIleObjectArrayList = new ArrayList<>();
    public static final String pathToFile = "demo.csv";
    public static final String title = "value1" + ";" + "value2"
            + ";" + "value3" + ";" + System.getProperty("line.separator");

    public static void main(String[] args) throws IOException {
        createFileObjects();
        writer();
        read();
        read2();
    }

    public static void createFileObjects() {
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            fIleObjectArrayList.add(new FIleObject(random.nextInt(100), random.nextInt(100), random.nextInt(100)));
        }
    }

    public static void writer() throws IOException {
        try (FileWriter writer = new FileWriter(pathToFile)) {
            writer.write(title);
            for (FIleObject fIleObject : fIleObjectArrayList) {
                writer.write(fIleObject.getValue1() + ";" + fIleObject.getValue2()
                        + ";" + fIleObject.getValue3() + ";" + System.getProperty("line.separator"));
            }
        }
    }

    public static void read() throws IOException {
        AppData appData = new AppData();
        ArrayList<int[]> rows = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(pathToFile))) {
            String line = br.readLine();
            String[] headers = line.split(";");
            appData.setHeader(headers);
            while ((line = br.readLine()) != null) {
                String[] numbersRow = line.split(";");
                int[] ints = convertToIntArray(numbersRow);
                rows.add(ints);
            }
        }
        int[][] objects = new int[rows.size()][rows.get(0).length];
        for (int i = 0; i < rows.size(); i++)  {
            objects[i] = rows.get(i);
        }
        appData.setData(objects);
        System.out.println(appData);
    }

    public static void read2() throws IOException {
        AppData2 appData = new AppData2();
        List<List<String>> rows = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(pathToFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                rows.add(Arrays.asList(line.split(";")));
            }
        }
        appData.setData(rows);
        System.out.println(appData);
    }

    private static int[] convertToIntArray(String[] numbersRow) {
        int[] result = new int[numbersRow.length];
        for (int i = 0; i < numbersRow.length; i++) {
            result[i] = Integer.parseInt(numbersRow[i]);
        }
        return result;
    }

}
