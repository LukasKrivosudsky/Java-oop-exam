package sk.stuba.fei.uim.oop.exam.component.service;

import org.springframework.stereotype.Service;
import sk.stuba.fei.uim.oop.exam.battletank.domain.vehicle.Tank;
import sk.stuba.fei.uim.oop.exam.component.domain.Component;

import java.util.ArrayList;

@Service
public class ComponentService {
    private ArrayList<Component> components = new ArrayList<>();

    public ArrayList<Component> getComponents(){ return components;}

    public void addComponent(Component component){
        components.add(component);
    }

    public Component findById(int id){

        for(Component component: components){
            if (component.getId() == id){
                return component;
            }
        }
        throw new IllegalArgumentException("Id does not exist");

    }

}
