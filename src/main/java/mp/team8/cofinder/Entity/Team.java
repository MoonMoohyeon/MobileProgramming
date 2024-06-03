package mp.team8.cofinder.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "teams")
@Data
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Type type;

    @Column(nullable = false)
    private String subject;

    @Column(nullable = false)
    private Integer maxMembers;

    @ManyToOne
    @JoinColumn(name = "leader_id", referencedColumnName = "id")
    private User leader;

    public enum Type {
        STUDY, PROJECT
    }
}
