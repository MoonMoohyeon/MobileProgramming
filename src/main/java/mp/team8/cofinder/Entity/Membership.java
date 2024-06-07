package mp.team8.cofinder.Entity;

import lombok.Data;

import jakarta.persistence.*;

@Entity
@Table(name = "memberships")
public class Membership {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "team_id", referencedColumnName = "id")
    private Team team;

    @Enumerated(EnumType.STRING)
    private Membership.Status status;

    // Getters and Setters

    public enum Status {
        PENDING, ACTIVE, REJECTED
    }
}
