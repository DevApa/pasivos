package bg.crm.integration.pasivos.controller.contract;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import bg.crm.integration.pasivos.controller.dto.PasivoDTO;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

public interface IPasivosController {
    @GetMapping(value = "api/v1/pasivos/list", produces = "application/json")
	@Operation(description = "Listado de Materia de Conocimiento disponibles")
	@ApiResponses(value = {
            @ApiResponse(responseCode =  "200", description =  "OK", content = @Content(array = @ArraySchema(schema = @Schema(implementation = PasivoDTO.class)))),
            @ApiResponse(responseCode =  "204", description =  "No Hay Contenido"),
            @ApiResponse(responseCode =  "500", description =  "Error Interno", content = @Content(array = @ArraySchema(schema = @Schema(implementation = String.class)))),
    })
    @Parameters(value = {
            @Parameter(name =  "sim parametros" )
    })
    ResponseEntity<?> getList();
}
