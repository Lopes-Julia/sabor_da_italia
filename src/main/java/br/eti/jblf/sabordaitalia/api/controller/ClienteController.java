package br.eti.jblf.sabordaitalia.api.controller;
import br.eti.jblf.sabordaitalia.domain.model.Cliente;
import br.eti.jblf.sabordaitalia.domain.repository.ClienteRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {
    
    @Autowired
    private ClienteRepository clienteRepository;
    
    @GetMapping("/cliente")
    public List<Cliente> showAllCliente() {
        return clienteRepository.findAll();
    }
    
    @GetMapping("/cliente/{clienteId}")
    public ResponseEntity<Cliente> showCliente(@PathVariable Long clienteId) {
        Optional<Cliente> cliente = clienteRepository.findById(clienteId);
        if (cliente.isPresent()) {
            return ResponseEntity.ok(cliente.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
    @PostMapping("/cliente")
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente addCliente(@RequestBody Cliente cliente) {
        return clienteRepository.save(cliente);
    }
}
