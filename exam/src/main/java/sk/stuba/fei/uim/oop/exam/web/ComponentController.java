package sk.stuba.fei.uim.oop.exam.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import sk.stuba.fei.uim.oop.exam.battletank.service.TankService;
import sk.stuba.fei.uim.oop.exam.component.service.ComponentService;

import javax.jws.WebParam;

@RequestMapping("/component")
@Controller
public class ComponentController {
    private final ComponentService componentService;
    private final TankService tankService;

    @Autowired
    public ComponentController(TankService tankService, ComponentService componentService){
        this.tankService = tankService;
        this.componentService = componentService;
    }

    @GetMapping("/all")
    public String all(Model model){
        model.addAttribute("component",componentService.getComponents());
        return "component/all";
    }


    @GetMapping("/{id}")
    public String one(Model model, @PathVariable int id){
        model.addAttribute("component",componentService.findById(id));
        return "component/one";
    }

}
