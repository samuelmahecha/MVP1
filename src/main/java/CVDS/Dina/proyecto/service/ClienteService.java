package CVDS.Dina.proyecto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import CVDS.Dina.proyecto.model.Cliente;
import CVDS.Dina.proyecto.repository.ClienteRepository;

@Service
public class ClienteService {
    private ClienteRepository clienteRepository;

    @Autowired
    public ClienteService(ClienteRepository clienteRepository){
        this.clienteRepository = clienteRepository;
    }
    
    public Cliente addCliente(Cliente Cliente) {
        return clienteRepository.save(Cliente);
    }
    
    public void save(List<Cliente> Cliente) {
        clienteRepository.saveAll(Cliente);
    }

    public Cliente getCliente(Long Cliente_id) {
        if(clienteRepository.findByClienteid(Cliente_id).size() != 0){
            return clienteRepository.findByClienteid(Cliente_id).get(0);
        }else{
            return null;
        }
    }

    public List<Cliente> getAllClientes() {
        return clienteRepository.findAll();
    }

    public Cliente updateCliente(Cliente cliente) {
        if (clienteRepository.findByClienteid(cliente.getClienteid()).size() == 0) {
            return clienteRepository.save(cliente);
        }

        return null;
    }

    public void deleteCliente(Long Cliente_id) {
        clienteRepository.deleteById(Cliente_id);
    }
    public List<Cliente> getAll(){
        return clienteRepository.findAll();
    }
}
