package tn.esprit.gestionzoo.main.entities;

public class Aquatic extends Animal {
    protected String habitat;

    public Aquatic() {
        super();
    }

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }
    @Override
    public String toString() {
        return "Aquatic [name=" + name + ", age=" + age + ", isMammal=" + isMammal + ", habitat=" + habitat + "]";
    }
    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }


}
