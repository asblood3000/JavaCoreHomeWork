package Lesson1;

public class Team {

    private String name;
    private Sportsman[] sportsmans;

    public Team(String name, Sportsman[] sportsmans) {
        this.name = name;
        this.sportsmans = sportsmans;
    }

    public String getName() {
        return name;
    }

    public Sportsman[] getSportsmans() {
        return sportsmans;
    }
}
