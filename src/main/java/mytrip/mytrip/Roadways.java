package mytrip.mytrip;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Roadways {

    @GetMapping("/Roadways")
    public String getData() {return "Please book bus from jammu travels at 25% discount"; }

}