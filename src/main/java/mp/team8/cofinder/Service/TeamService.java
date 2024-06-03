package mp.team8.cofinder.Service;

import mp.team8.cofinder.Entity.Team;
import mp.team8.cofinder.Repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TeamService {
    private final TeamRepository teamRepository;

    @Autowired
    public TeamService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    public Team createTeam(Team team) {
        return teamRepository.save(team);
    }

    public List<Team> getAllTeams() {
        return teamRepository.findAll();
    }

    public Team getTeamById(Long id) {
        return teamRepository.findById(id).orElse(null);
    }

    public List<Team> findTeamsByTypeAndSubject(Team.Type type, String subject) {
        return teamRepository.findByTypeAndSubject(type, subject);
    }
}
