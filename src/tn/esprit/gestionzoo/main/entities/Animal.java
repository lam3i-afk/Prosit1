package tn.esprit.gestionzoo.main.entities;

public class Animal {

    protected String family;
    protected String name;
    protected int age;
    protected boolean isMammal ;

public Animal(String family,String name,int age,boolean isMammal) {
    this.family=family;
    this.name=name;
    this.age=age;
    this.isMammal=isMammal;

}

    public Animal() {

    }

    public String getFamily() {
        return family;
    }

    public String getName() {
    return name;
}


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            return ;
        }
    this.age = age;
    }

    public String toString() {
        return "Aquatic [name=" + name + ", age=" + age + ", isMammal=" + isMammal + "]";
    }





}
