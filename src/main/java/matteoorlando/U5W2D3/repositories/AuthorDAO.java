package matteoorlando.U5W2D3.repositories;

import matteoorlando.U5W2D3.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface AuthorDAO extends JpaRepository <Author, UUID> {

    boolean existsByEmail (String email);

    static Optional<Author> findByEmail(String email) {
        return Optional.empty();
    }
}
