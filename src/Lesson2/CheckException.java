package Lesson2;

public class CheckException {
    int size = 4;
    int arrSum = 0;

    public int getArrSum() {
        return arrSum;
    }

    public void arrayChecking(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != size) throw new MyArraySizeException();

        int i = 0;
        int j = 0;
        try {

            for (i = 0; array.length > i; i++) {
                for (j = 0; array.length > j; j++) {
                    arrSum = arrSum + Integer.parseInt(array[i][j]);
                }
            }
            System.out.println("Сумма значений массива: " + arrSum);
        } catch (NumberFormatException ex) {
            throw new MyArrayDataException("Ошибка преобразования по координатам: " + ("x = " + i) + ", " + ("y = " + j));

        }
    }
}
