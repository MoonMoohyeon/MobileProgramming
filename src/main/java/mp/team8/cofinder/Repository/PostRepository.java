package mp.team8.cofinder.Repository;

import mp.team8.cofinder.Entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findByTeamId(Long teamId);
}
