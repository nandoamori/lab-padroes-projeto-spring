package dio.nandoamori.labpadroesprojetospring.controller;

import dio.nandoamori.labpadroesprojetospring.model.Cliente;
import dio.nandoamori.labpadroesprojetospring.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clientes")
public class ClienteRestController {
    @Autowired
    private ClienteService clienteService;
    @GetMapping
    public ResponseEntity<Iterable<Cliente>> getAll(){
        return ResponseEntity.ok(clienteService.getAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Cliente> findById(@PathVariable Long id){
        return ResponseEntity.ok(clienteService.findById(id));
    }
    @PostMapping
    public ResponseEntity<Cliente> create(@RequestBody Cliente cliente){
        clienteService.create(cliente);
        return ResponseEntity.ok(cliente);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Cliente> update(@PathVariable Long id, @RequestBody Cliente cliente){
        clienteService.update(id, cliente);
        return ResponseEntity.ok(cliente);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        clienteService.delete(id);
        return ResponseEntity.ok().build();
    }

}
