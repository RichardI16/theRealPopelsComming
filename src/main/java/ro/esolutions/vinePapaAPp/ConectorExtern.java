package ro.esolutions.vinePapaAPp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ConectorExtern {

    @GetMapping("/churches")

    public String getAllChurches(){

        Biserica sfIosif =new Biserica();
        sfIosif.nume="Ioan";
        return "Bisericile mele sunt " + sfIosif.nume;


    }
}
