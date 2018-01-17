package Todo.list.Todo.list.controller;

import Todo.list.Todo.list.entity.Task;
import Todo.list.Todo.list.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping("/tasks")
    public List<Task> getAllTasks() throws SQLException {
        return taskService.getAllTasks();
    }
    @GetMapping("/tasks/{id}")
    public Task getTask(@PathVariable("id") Integer id) throws NoSuchElementException {
        return taskService.getTask(id);
    }
    @PostMapping("/tasks")
    public void addTask(@RequestBody Task task) throws SQLException {
        taskService.addTask(task);
    }
    @PutMapping("/tasks/{id}")
    public void updateTask(@RequestBody Task task) throws SQLException{
        taskService.updateTask(task);
    }
    @DeleteMapping("/tasks/{id}")
    public void deleteTask(@PathVariable("id") Integer id) throws SQLException{
        taskService.deleteTask(id);
    }



}
