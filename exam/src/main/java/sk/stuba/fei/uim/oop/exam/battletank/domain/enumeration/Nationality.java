package sk.stuba.fei.uim.oop.exam.battletank.domain.enumeration;

import lombok.Getter;

@Getter
public enum Nationality {
    USA("USA", 1),
    ZSSR("ZSSR",2),
    Germany("Germany",3),
    GreatBritain("Great Britain",4);

    private String name;
    private int id;

    Nationality(String name, int id){
        this.name = name;
        this.id = id;
    }

}
