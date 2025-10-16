package tn.esprit.gestionzoo.main.entities;

public class Penguin extends Aquatic{
    private float swimmingDepth;
    /*public Penguin(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth) {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }*/
    public Penguin() {
        super();
    }

    public Penguin(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth) {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }
    @Override
    public String toString() {
        return "Penguin [name=" + name + ", age=" + age + ", isMammal=" + isMammal +
                ", habitat=" + habitat + ", swimmingDepth=" + swimmingDepth + "]";
    }
}
