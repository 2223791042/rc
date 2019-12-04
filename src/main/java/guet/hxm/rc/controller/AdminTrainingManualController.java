package guet.hxm.rc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminTrainingManualController {
    @GetMapping("/trainingManual")
    public String trainingManual(){
        return "trainingManual";
    }
}
