package Service;

import Entity.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskServiceImpl implements  service{

    private List<Task> Task=new ArrayList<>();
    @Override
    public void addProduct(Task task) {
        Task.add(task);
        System.out.println("Your Task is Successfully Added");
    }

    @Override
    public void getTask() {
        for(int i=0;i<Task.size();i++){
            System.out.println("Your "+ Task.get(i));
        }

       // return Task;
    }
}
