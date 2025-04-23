package bg.crm.integration.pasivos.utils;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {
    @GetMapping({"/", ""})
    public String index() {
        return "swagger-ui/index.html";
    }
}
