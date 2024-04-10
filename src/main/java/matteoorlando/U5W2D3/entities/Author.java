package matteoorlando.U5W2D3.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@Table(name="Autore")
@Getter
@Setter
@AllArgsConstructor
@ToString
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String surname;
    private String email;
    private String dateOfBirth;
    private String avatar;

    @Column(name = "author_id")
    private int authorId;
}
