package CVDS.Dina.proyecto.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import CVDS.Dina.proyecto.model.Pedido;
import CVDS.Dina.proyecto.repository.PedidoRepository;

@Service
public class PedidoService {
    private PedidoRepository pedidoRepository;

    @Autowired
    public PedidoService(PedidoRepository pedidoRepository){
        this.pedidoRepository = pedidoRepository;
    }
    
    public Pedido addPedido(Pedido Pedido) {
        return pedidoRepository.save(Pedido);
    }
    
    public void save(List<Pedido> Pedido) {
        pedidoRepository.saveAll(Pedido);
    }

    public Pedido getPedido(Long Pedido_id) {
        if(pedidoRepository.findByPedidoId(Pedido_id).size() != 0){
            return pedidoRepository.findByPedidoId(Pedido_id).get(0);
        }else{
            return null;
        }
    }

    public List<Pedido> getAllPedidos() {
        return pedidoRepository.findAll();
    }

    public Pedido updatePedido(Pedido Pedido) {
        if (pedidoRepository.findByPedidoId(Pedido.getpedidoId()).size() == 0) {
            return pedidoRepository.save(Pedido);
        }

        return null;
    }

    public void deletePedido(Long Pedido_id) {
        pedidoRepository.deleteById(Pedido_id);
    }
    public List<Pedido> getAll(){
        return pedidoRepository.findAll();
    }
}
