package Todo.list.Todo.list.service;

import Todo.list.Todo.list.entity.Task;
import Todo.list.Todo.list.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public List<Task> getAllTasks() throws SQLException {
        return taskRepository.findAll();
    }

    public Task getTask(Integer id) throws NoSuchElementException {

        if(taskRepository.findOne(id) == null){
            throw new NoSuchElementException("Task not Found");
        }else{
            return taskRepository.findOne(id);
        }
    }

    public Task addTask(Task task) throws SQLException{
        taskRepository.save(task);
        return task;
    }

    public void updateTask(Task task) throws SQLException{
        taskRepository.save(task);
    }

    public void deleteTask(Integer id) throws SQLException{
        taskRepository.delete((id));
    }


}
