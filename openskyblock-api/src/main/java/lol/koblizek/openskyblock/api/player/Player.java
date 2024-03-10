package lol.koblizek.openskyblock.api.player;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "players")
@Getter
public class Player {
    @Id
    @Column(name = "id", nullable = false)
    private UUID id;

    @OneToMany
    private List<Profile> profiles;
}
