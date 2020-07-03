package pt.tiago.demo.api.service;

import pt.tiago.demo.api.model.Task;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.NotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

@ApplicationScoped
public class TaskServiceImpl implements TaskService {
    private final Collection<Task> tasks = new ArrayList<>();

    public Task getTask(int id) throws NotFoundException {
        return tasks.stream().filter(t -> t.getId() == id).findFirst().orElseThrow(() -> new NotFoundException());
    }

    public Collection<Task> getAllTasks() {
        return tasks;
    }

    @Override
    public Task addTask(String taskName)  {
        Random r = new Random(1);
        Task t = new Task(r.nextInt(), taskName);
        tasks.add(t);
        return t;
    }
}
