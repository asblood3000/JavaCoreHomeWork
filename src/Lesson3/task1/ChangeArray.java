package Lesson3.task1;

import java.util.Arrays;

public class ChangeArray {
    public static void change (Object[] arr, int n1, int n2){
        System.out.println("Исходное состояние массива: "+Arrays.toString(arr));
        Object sw = arr[n1];
        arr[n1]=arr[n2];
        arr[n2]=sw;
        System.out.println("Результат замены элемента массива " + n1 + " на элемент " + n2 + ": " + Arrays.toString(arr));
    }
}
