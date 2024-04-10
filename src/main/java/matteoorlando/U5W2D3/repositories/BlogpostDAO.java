package matteoorlando.U5W2D3.repositories;

import matteoorlando.U5W2D3.entities.Blogpost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogpostDAO extends JpaRepository<Blogpost, Integer> {

}
