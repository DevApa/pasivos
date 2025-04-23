package bg.crm.integration.pasivos.db.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Pasivo {
    private String id;
    private String name;
    private String description;
    private String status;
}
