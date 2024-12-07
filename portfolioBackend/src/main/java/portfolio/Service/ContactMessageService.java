package portfolio.Service;


import org.springframework.stereotype.Service;
import portfolio.Model.ContactMessage;
import portfolio.Repository.ContactMessageRepository;

import java.util.List;

@Service
public class ContactMessageService {

    private final ContactMessageRepository repository;

    public ContactMessageService(ContactMessageRepository repository) {
        this.repository = repository;
    }

    public ContactMessage saveMessage(ContactMessage message) {
        return repository.save(message);
    }

    public List<ContactMessage> getAllMessages() {
        return repository.findAll(); // Méthode standard de Spring Data JPA
    }

}
