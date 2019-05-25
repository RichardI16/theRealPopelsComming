package ro.esolutions.vinePapaAPp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ConectorExtern {

    @GetMapping("/churches")

    public String getAllChurches(){
        return "Bisericele mele sunt: ";
    }
}
