package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.main.entities.Animal;
import tn.esprit.gestionzoo.main.entities.Zoo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");


        Animal lion =new Animal("ff","cc",5,true);
        Animal cat =new Animal("cat","pika",5,false);
        Zoo myZoo =new Zoo("belvédere","tunis",20);
        Zoo myZoo2 =new Zoo("frigya","hergla",30);
        Zoo zoo = new Zoo();
        myZoo.displayZoo();
        System.out.println(lion);
        System.out.println(myZoo);
        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(cat));


        System.out.println(myZoo2.addAnimal(lion));


        myZoo.affiche();
        System.out.println(myZoo.searchAnimal(cat));
        System.out.println(myZoo.removeAnimal(lion));
        System.out.println(myZoo.isZooFull());
        System.out.println(Zoo.comparerZoo(myZoo,myZoo2));
    }
    }
