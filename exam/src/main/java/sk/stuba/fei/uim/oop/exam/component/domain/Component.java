package sk.stuba.fei.uim.oop.exam.component.domain;

public abstract class Component {
    private static int cid;
    private int id;
    private String name;

    public Component(String name) {
        setName(name);
        this.id = ++cid;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Component{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("Wrong argument");
        }
        this.name = name;
    }
}
