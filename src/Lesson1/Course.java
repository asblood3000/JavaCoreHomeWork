package Lesson1;

public class Course {

    String result;
    private int distance;

    Course(int distance) {
        this.distance = distance;
    }

    public String start(Team team){
        result = "Команда: " + team.getName() + '\n';
        for(Sportsman sportsman: team.getSportsmans()){
            result += "Имя спортсмена: " + sportsman.getName() + ", может пробежать максимум " + sportsman.getMaxDistance() + ", нужно пробежать " + distance +'\n';
            int value = sportsman.getMaxDistance();
            canRun(value);
        }
        return result;
    }

    private void canRun(int value){
        if(value >= distance) result += "Спортсмен может пробежать эту дистанцию" + '\n';
        else {
            result += "Спортсмен не бегает такие расстояния" + '\n';
        }
    }

}
