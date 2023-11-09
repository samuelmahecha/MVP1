package CVDS.Dina.proyecto.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import CVDS.Dina.proyecto.model.Alergia;
import CVDS.Dina.proyecto.repository.AlergiaRepository;

@Service
public class AlergiaService {

    private AlergiaRepository alergiaRepository;
    @Autowired
    public AlergiaService(AlergiaRepository alergiaRepository){
        this.alergiaRepository = alergiaRepository;
    }
    
    public Alergia addAlergia(Alergia Alergia) {
        return alergiaRepository.save(Alergia);
    }
    
    public void save(List<Alergia> Alergia) {
        alergiaRepository.saveAll(Alergia);
    }

    public Alergia getAlergia(Long Alergia_id) {
        if(alergiaRepository.findByAlergiasid(Alergia_id).size() != 0){
            return alergiaRepository.findByAlergiasid(Alergia_id).get(0);
        }else{
            return null;
        }
    }

    public List<Alergia> getAllAlergias() {
        return alergiaRepository.findAll();
    }

    public Alergia updateAlergia(Alergia Alergia) {
        if (alergiaRepository.findByAlergiasid(Alergia.getAlergiasid()).size() == 0) {
            return alergiaRepository.save(Alergia);
        }

        return null;
    }

    public void deleteAlergia(Long Alergia_id) {
        alergiaRepository.deleteById(Alergia_id);
    }
    public List<Alergia> getAll(){
        return alergiaRepository.findAll();
    }
    public List<Alergia> getAllById(ArrayList<Long> id){
        return alergiaRepository.findAllById(id);
    }

}
