package tn.esprit.gestionzoo.main.entities; // Déclare le package en haut du fichier

public class Animal {

    private String family;
    private String name;
    private int age;
    private boolean isMammal ;

public Animal(String family,String name,int age,boolean isMammal) {
    this.family=family;
    this.name=name;
    this.age=age;
    this.isMammal=isMammal;

}
public String getName() {
    return name;
}

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("L'âge d'un animal ne peut pas être négatif");
        }
    this.age = age;
    }

    public String toString() {
    return  "family=" + family + ", name=" + name + ", age=" + age  + ", isMammal=" + isMammal;
}




}
