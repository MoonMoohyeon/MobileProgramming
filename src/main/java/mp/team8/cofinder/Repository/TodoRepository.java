package mp.team8.cofinder.Repository;

import mp.team8.cofinder.Entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TodoRepository extends JpaRepository<Todo, Long> {
    List<Todo> findByTeamId(Long teamId);
}
