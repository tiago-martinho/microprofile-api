package pt.tiago.demo.api.service;


import pt.tiago.demo.api.model.Task;

import javax.ws.rs.NotFoundException;
import java.util.Collection;

public interface TaskService {

    Task getTask(int id) throws NotFoundException;

    Collection<Task> getAllTasks();

    Task addTask(String taskName);


}
