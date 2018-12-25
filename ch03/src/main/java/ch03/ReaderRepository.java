package ch03;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface ReaderRepository extends JpaRepository<Reader, String>{

	UserDetails findByUsername(String username);

}
