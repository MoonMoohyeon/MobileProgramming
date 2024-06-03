package mp.team8.cofinder.Controller;

import mp.team8.cofinder.Entity.Membership;
import mp.team8.cofinder.Service.MembershipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/memberships")
public class MembershipController {
    @Autowired
    private MembershipService membershipService;

    @PostMapping
    public ResponseEntity<Membership> addMembership(@RequestBody Membership membership) {
        Membership newMembership = membershipService.addMembership(membership);
        return ResponseEntity.ok(newMembership);
    }

    @GetMapping("/{teamId}")
    public ResponseEntity<List<Membership>> getMembershipsByTeam(@PathVariable Long teamId) {
        List<Membership> memberships = membershipService.getMembershipsByTeam(teamId);
        return ResponseEntity.ok(memberships);
    }
}
