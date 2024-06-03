package mp.team8.cofinder.Repository;

import mp.team8.cofinder.Entity.Membership;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface MembershipRepository extends JpaRepository<Membership, Long> {
    List<Membership> findByTeamId(Long teamId);
    List<Membership> findByUserIdAndStatus(Long userId, Membership.Status status);
}
