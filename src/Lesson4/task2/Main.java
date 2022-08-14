package Lesson4.task2;

public class Main {
    public static void main(String[] args){
        Phonebook phonebook = new Phonebook();
        System.out.println("Добавляем записи в справочник:");
        phonebook.add("Иванов", "123321");
        phonebook.add("Иванов", "321123");
        phonebook.add("Петров", "111111");
        phonebook.add("Сидоров", "222222");
        phonebook.add("Иванов", "333333");
        System.out.println();
        System.out.println("Получаем номера из справочника:");
        System.out.println("Иванов " + phonebook.get("Иванов"));
        System.out.println("Петров " + phonebook.get("Петров"));
        System.out.println("Сидоров " + phonebook.get("Сидоров"));
        System.out.println();
        System.out.println("Такой записи в справочнике нет:");
        System.out.println("Евсюков " + phonebook.get("Евсюков"));
        System.out.println();
        System.out.println("Пробуем записать уже существующий номер:");
        phonebook.add("Иванов", "123321");
        System.out.println("Иванов " + phonebook.get("Иванов"));
    }
}