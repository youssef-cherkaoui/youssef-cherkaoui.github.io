package portfolio.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import portfolio.Model.ContactMessage;

public interface ContactMessageRepository extends JpaRepository<ContactMessage, Long> {

}
