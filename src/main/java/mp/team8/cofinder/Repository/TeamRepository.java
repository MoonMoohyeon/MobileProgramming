package mp.team8.cofinder.Repository;

import mp.team8.cofinder.Entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TeamRepository extends JpaRepository<Team, Long> {
    List<Team> findByTypeAndSubject(Team.Type type, String subject);
}
