package mp.team8.cofinder.Controller;

import mp.team8.cofinder.Entity.Team;
import mp.team8.cofinder.Service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/teams")
public class TeamController {
    @Autowired
    private TeamService teamService;

    @PostMapping
    public ResponseEntity<Team> createTeam(@RequestBody Team team) {
        Team newTeam = teamService.createTeam(team);
        return ResponseEntity.ok(newTeam);
    }

    @GetMapping("/{teamId}")
    public ResponseEntity<Team> getTeamById(@PathVariable Long teamId) {
        Team team = teamService.getTeamById(teamId);
        return team != null ? ResponseEntity.ok(team) : ResponseEntity.notFound().build();
    }

    @GetMapping
    public ResponseEntity<List<Team>> getAllTeams() {
        List<Team> teams = teamService.getAllTeams();
        return ResponseEntity.ok(teams);
    }

    @GetMapping("/search")
    public ResponseEntity<List<Team>> findTeamsByTypeAndSubject(@RequestParam Team.Type type, @RequestParam String subject) {
        List<Team> teams = teamService.findTeamsByTypeAndSubject(type, subject);
        return ResponseEntity.ok(teams);
    }
}
