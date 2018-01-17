package Todo.list.Todo.list.repository;

import Todo.list.Todo.list.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface  TaskRepository extends JpaRepository<Task,Integer> {}
