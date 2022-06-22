package Lesson2;

public class Main {
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        String[][] myArray1 = {{"1", "2", "3", "4"}, {"7", "6", "7", "8"}, {"9", "ш", "7", "8"}, {"5", "6", "7", "8"}};
        String[][] myArray2 = {{"1", "2", "3", "4"}, {"7", "6", "7", "8"}, {"9", "5", "7", "8"}};
        String[][] myArray3 = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "6", "7", "8"}, {"5", "6", "7", "8"}};

        CheckException arrays = new CheckException();
        arrays.arrayChecking(myArray3);

        try {
            arrays.arrayChecking(myArray2);
        } catch (MyArraySizeException ex) {
            System.out.println(ex.getMessage() + " " + myArray2.length);
        }

        try {
            arrays.arrayChecking(myArray1);
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }
}

