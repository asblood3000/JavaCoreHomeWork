package Lesson1;

public class Main {
    public static void main(String[] args) {
        Sportsman[] sportsmans = new Sportsman[2];
        sportsmans[0] = new Sportsman("Иван", 100);
        sportsmans[1] = new Sportsman("Пётр", 200);
        Team team = new Team("Команда 1", sportsmans);

        Course course = new Course(150);
        String result = course.start(team);
        System.out.println(result);
    }
}
