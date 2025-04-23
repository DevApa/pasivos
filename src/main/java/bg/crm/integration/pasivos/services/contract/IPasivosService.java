package bg.crm.integration.pasivos.services.contract;

import java.util.List;

import bg.crm.integration.pasivos.controller.dto.PasivoDTO;


public interface IPasivosService {    
    List<PasivoDTO> getAllPasivos();
    PasivoDTO getPasivoById(Long id);
}
