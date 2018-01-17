package Todo.list.Todo.list.entity;

import javax.persistence.*;

@Entity
@Table(name = "Tasks")
public class Task {
    @Id
    @Column (name = "Id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String title;
    private Boolean status;
    private String description;

    public Task(){

    }

    public Task(Integer id, String title, Boolean status, String description) {
        this.id = id;
        this.title = title;
        this.status = status;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
