package dio.nandoamori.labpadroesprojetospring.service;

import dio.nandoamori.labpadroesprojetospring.model.Cliente;


public interface ClienteService {
    Iterable<Cliente> getAll();
    Cliente findById(Long id);
    void create(Cliente cliente);
    void update(Long id, Cliente cliente);
    void delete(Long id);
}
