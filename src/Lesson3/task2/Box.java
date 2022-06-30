package Lesson3.task2;

import java.util.ArrayList;

public class Box<T>{
    boolean isFree = true;
    float maxWeight = 2.0f;
    float currentWeight = 0;
    ArrayList<T> arrayList = new ArrayList<T>();

    void addFruit(T fruit) {
        if (currentWeight + 1 <= maxWeight) {
            arrayList.add(fruit);
            currentWeight++;
            if (arrayList.size() < 1)
                isFree = false;
        } else
            System.out.println("Коробка полная");
    }

    float getWeight(Fruit f) {
        return arrayList.size() * f.getWeight();
    }

    boolean compare(Fruit f1, Fruit f2) {
        if (getWeight(f1) == getWeight(f2)) {
            return true;
        } else return false;
    }

    public boolean compare(Box box) {
        if (currentWeight == box.currentWeight)
            return true;
        return false;
    }
}
