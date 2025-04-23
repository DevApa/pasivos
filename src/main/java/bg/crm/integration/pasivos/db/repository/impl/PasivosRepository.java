package bg.crm.integration.pasivos.db.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import bg.crm.integration.pasivos.controller.dto.PasivoDTO;
import bg.crm.integration.pasivos.db.repository.contract.IPasivosRepository;

@Repository
public class PasivosRepository implements IPasivosRepository {

    List<PasivoDTO> pasivos = new ArrayList<>();
    private List<PasivoDTO> pasivosList()
    {
        pasivos.add(new PasivoDTO(1L, "Pasivo 1", "Description 1"));
        pasivos.add(new PasivoDTO(2L, "Pasivo 2", "Description 2"));
        pasivos.add(new PasivoDTO(3L, "Pasivo 3", "Description 3"));
        return pasivos;
    }

    @Override
    public List<PasivoDTO> getAllPasivos() {
        // Implementation to fetch all Pasivos from the database
        return pasivosList();
    }

    @Override
    public PasivoDTO getPasivoById(Long id) {
        // Implementation to fetch a Pasivo by ID from the database
        return pasivosList().stream()
                .filter(pasivo -> pasivo.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

}
