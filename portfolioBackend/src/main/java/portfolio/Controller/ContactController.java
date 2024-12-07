package portfolio.Controller;


import org.aspectj.bridge.Message;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import portfolio.Model.ContactMessage;
import portfolio.Service.ContactMessageService;

import java.util.List;

@RestController
@RequestMapping("/api/contact")
@CrossOrigin(origins = "*")
public class ContactController {

    private final ContactMessageService service;
    public ContactController(ContactMessageService service) {
        this.service = service;
    }

    @PostMapping("/test")
    public ResponseEntity<ContactMessage> sendMessage(@RequestBody ContactMessage message) {
        ContactMessage savedMessage = service.saveMessage(message);
        return new ResponseEntity<>(savedMessage, HttpStatus.CREATED);
    }

    @GetMapping("/get")
    public ResponseEntity<List<ContactMessage>> getAllMessages() {
        List<ContactMessage> messages = service.getAllMessages(); // Appelle une méthode du service
        return new ResponseEntity<>(messages, HttpStatus.OK);
    }
}
