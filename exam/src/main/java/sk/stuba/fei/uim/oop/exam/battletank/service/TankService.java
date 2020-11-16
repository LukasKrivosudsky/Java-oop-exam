package sk.stuba.fei.uim.oop.exam.battletank.service;

import org.springframework.stereotype.Service;
import sk.stuba.fei.uim.oop.exam.battletank.domain.vehicle.Tank;

import java.util.ArrayList;


@Service
public class TankService {
    private ArrayList<Tank> tankList = new ArrayList<>();

    public void addTank(Tank tank){
        tankList.add(tank);
    }

    public Tank findTankById(int id){
        for(Tank tank: tankList){
            if (tank.getTankId() == id){
                return tank;
            }
        }
        throw new IllegalArgumentException("Id does not exist");
    }

    public ArrayList<Tank> getTankList(){return tankList;}


}
