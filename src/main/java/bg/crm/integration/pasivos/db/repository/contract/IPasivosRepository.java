package bg.crm.integration.pasivos.db.repository.contract;

import java.util.List;


import bg.crm.integration.pasivos.controller.dto.PasivoDTO;


public interface IPasivosRepository {
    List<PasivoDTO> getAllPasivos();
    PasivoDTO getPasivoById(Long id);
}
