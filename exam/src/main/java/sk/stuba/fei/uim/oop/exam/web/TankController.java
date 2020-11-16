package sk.stuba.fei.uim.oop.exam.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import sk.stuba.fei.uim.oop.exam.battletank.service.TankService;
import sk.stuba.fei.uim.oop.exam.component.service.ComponentService;


@RequestMapping("/tank")
@Controller
public class TankController {
    private final ComponentService componentService;
    private final TankService tankService;

    @Autowired
    public TankController(TankService tankService, ComponentService componentService){
        this.tankService = tankService;
        this.componentService = componentService;
    }

    @GetMapping("/all")
    public String all(Model model){
        model.addAttribute("tanks",tankService.getTankList());
        return "tank/all";
    }

    @GetMapping("/{id}")
    public String one(Model model, @PathVariable int id){
        model.addAttribute("tank",tankService.findTankById(id));

        return "tank/one";



    }



}
