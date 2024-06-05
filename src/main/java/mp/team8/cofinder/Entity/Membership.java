package mp.team8.cofinder.Entity;

import lombok.Data;

import jakarta.persistence.*;

@Entity
@Table(name = "memberships")
@Data
public class Membership {
    @Id
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @Id
    @ManyToOne
    @JoinColumn(name = "team_id", referencedColumnName = "id")
    private Team team;

    @Enumerated(EnumType.STRING)
    private Status status;

    public enum Status {
        PENDING, ACTIVE, REJECTED
    }
}
