package mytrip.mytrip;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Airways {

    @GetMapping("/Airways")
    public String getData() {return "Please book your flight for air india at 25% discount"; }

}