package com.system.backend.client.Controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.system.backend.client.Model.ClientModel;
import com.system.backend.client.Repository.ClientRepository;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;

    @GetMapping
    public List<ClientModel> listAll() {
        return clientRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public ClientModel registerUser(@RequestBody ClientModel clientModel) {
        return clientRepository.save(clientModel);
    }

    @GetMapping("/{id}")
    public ClientModel getUser(@PathVariable Long id) {
        return clientRepository.findById(id).get();
    }

    @PutMapping("/{id}")
    public ClientModel updateUser(@RequestBody ClientModel clientModel) {
        return clientRepository.save(clientModel);
    }


    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        clientRepository.deleteById(id);
    }
}