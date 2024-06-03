package mp.team8.cofinder.Service;

import mp.team8.cofinder.Entity.Membership;
import mp.team8.cofinder.Repository.MembershipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MembershipService {
    private final MembershipRepository membershipRepository;

    @Autowired
    public MembershipService(MembershipRepository membershipRepository) {
        this.membershipRepository = membershipRepository;
    }

    public Membership addMembership(Membership membership) {
        return membershipRepository.save(membership);
    }

    public List<Membership> getMembershipsByTeam(Long teamId) {
        return membershipRepository.findByTeamId(teamId);
    }
}
