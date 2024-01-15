import Entity.Task;
import Service.TaskServiceImpl;
import Service.service;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        Task task1=new Task("Gym","work out for 1 hr");
        Task task2=new Task("Study","study on java 8");
        Task task3=new Task("Music","calm down");

        service service=new TaskServiceImpl();
        service.addProduct(task1);
        service.addProduct(task2);
        service.addProduct(task3);
        service.getTask();
    }
}