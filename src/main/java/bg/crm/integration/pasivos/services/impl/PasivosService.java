package bg.crm.integration.pasivos.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bg.crm.integration.pasivos.controller.dto.PasivoDTO;
import bg.crm.integration.pasivos.db.repository.contract.IPasivosRepository;
import bg.crm.integration.pasivos.services.contract.IPasivosService;

@Service
public class PasivosService implements IPasivosService {
    @Autowired
    private IPasivosRepository pasivosRepository; 

    @Override
    public List<PasivoDTO> getAllPasivos() {
        // Implementation logic to retrieve all Pasivo records
        return pasivosRepository.getAllPasivos();
    }

    @Override
    public PasivoDTO getPasivoById(Long id) {
        // Implementation logic to retrieve a Pasivo record by ID
        return pasivosRepository.getPasivoById(id);
    }

}
