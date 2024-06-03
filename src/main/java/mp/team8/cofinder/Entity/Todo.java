package mp.team8.cofinder.Entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "todos")
@Data
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "team_id", referencedColumnName = "id")
    private Team team;

    @Column(nullable = false)
    private String task;

    @Column(nullable = false)
    private Boolean isCompleted;

    @Column
    private LocalDate dueDate;
}
