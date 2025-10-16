package tn.esprit.gestionzoo.main.entities;

public class Dolphin extends Aquatic{
    private float swimmingSpeed;

    public Dolphin() {
        super();
    }

    public Dolphin(String family, String name, int age, boolean isMammal, String habitat, float swimmingSpeed) {
        super(family, name, age, isMammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }
    @Override
    public String toString() {
        return "Dolphin [name=" + name + ", age=" + age + ", isMammal=" + isMammal +
                ", habitat=" + habitat + ", swimmingSpeed=" + swimmingSpeed + "]";
    }
    public void swim() {
        System.out.println("This dolphin is swimming.");
    }
}
