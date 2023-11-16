package CVDS.Dina.proyecto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import CVDS.Dina.proyecto.model.Factura;
import CVDS.Dina.proyecto.repository.FacturaRepository;

@Service
public class FacturaService {
    private FacturaRepository facturaRepository;

    @Autowired
    public FacturaService(FacturaRepository facturaRepository){
        this.facturaRepository = facturaRepository;
    }
    
    public Factura addFactura(Factura Factura) {
        return facturaRepository.save(Factura);
    }
    
    public void save(List<Factura> Factura) {
        facturaRepository.saveAll(Factura);
    }

    public Factura getFactura(Long Factura_id) {
        if(facturaRepository.findByid(Factura_id).size() != 0){
            return facturaRepository.findByid(Factura_id).get(0);
        }else{
            return null;
        }
    }

    public List<Factura> getAllFacturas() {
        return facturaRepository.findAll();
    }

    public Factura updateFactura(Factura Factura) {
        if (facturaRepository.findByid(Factura.getId()).size() == 0) {
            return facturaRepository.save(Factura);
        }

        return null;
    }

    public void deleteFactura(Long Factura_id) {
        facturaRepository.deleteById(Factura_id);
    }
    public List<Factura> getAll(){
        return facturaRepository.findAll();
    }
}
