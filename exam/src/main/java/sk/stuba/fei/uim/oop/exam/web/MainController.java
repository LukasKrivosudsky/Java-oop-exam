package sk.stuba.fei.uim.oop.exam.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import sk.stuba.fei.uim.oop.exam.battletank.service.TankService;
import sk.stuba.fei.uim.oop.exam.component.service.ComponentService;

@RequestMapping("")
@Controller
public class MainController {

    public String show(){
        return "index";
    }
}
