package Lesson1;

public class Sportsman {

    private String name;
    private int maxDistance;

    public Sportsman(String name, int maxDistance) {
        this.name = name;
        this.maxDistance = maxDistance;
    }

    public String getName() {
        return name;
    }

    public int getMaxDistance() {
        return maxDistance;
    }
}
