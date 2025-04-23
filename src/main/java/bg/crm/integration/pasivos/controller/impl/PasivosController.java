package bg.crm.integration.pasivos.controller.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import bg.crm.integration.pasivos.controller.contract.IPasivosController;
import bg.crm.integration.pasivos.controller.dto.PasivoDTO;
import bg.crm.integration.pasivos.services.contract.IPasivosService;
import bg.crm.integration.pasivos.utils.exceptions.ErrorsConfig;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "Pasivos")
public class PasivosController implements IPasivosController {

    private static final Logger LOG = LoggerFactory.getLogger(PasivosController.class);
    @Autowired
    private IPasivosService _service; // Assuming you have a service interface for business logic

    @Override
    public ResponseEntity<?> getList() {
        try {
        	LOG.info("Incio de consulta de materia");
            List<PasivoDTO> pasivos = _service.getAllPasivos();
            if (pasivos.isEmpty()) {
            	LOG.info("No hay registros que mostrar");
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);    
            }
            LOG.info("Fin la consulta devolvió " + pasivos.size() + " de registros");
            return new ResponseEntity<>(pasivos, HttpStatus.OK);
        } catch (Exception e) {
        	LOG.info("La consulta falló");
            return new ResponseEntity<String>(ErrorsConfig.ERROR_INTERN, HttpStatus.INTERNAL_SERVER_ERROR);  
        }
    }


}
