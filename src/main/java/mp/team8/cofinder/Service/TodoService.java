package mp.team8.cofinder.Service;

import mp.team8.cofinder.Entity.Todo;
import mp.team8.cofinder.Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TodoService {
    private final TodoRepository todoRepository;

    @Autowired
    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public Todo createTodo(Todo todo) {
        return todoRepository.save(todo);
    }

    public List<Todo> getTodosByTeam(Long teamId) {
        return todoRepository.findByTeamId(teamId);
    }
}
