package mp.team8.cofinder.Controller;

import mp.team8.cofinder.Entity.Todo;
import mp.team8.cofinder.Service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todos")
public class TodoController {
    @Autowired
    private TodoService todoService;

    @PostMapping
    public ResponseEntity<Todo> createTodo(@RequestBody Todo todo) {
        Todo newTodo = todoService.createTodo(todo);
        return ResponseEntity.ok(newTodo);
    }

    @GetMapping("/{teamId}")
    public ResponseEntity<List<Todo>> getTodosByTeam(@PathVariable Long teamId) {
        List<Todo> todos = todoService.getTodosByTeam(teamId);
        return ResponseEntity.ok(todos);
    }
}
