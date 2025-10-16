package tn.esprit.gestionzoo.main.main;
import tn.esprit.gestionzoo.main.entities.Animal;
import tn.esprit.gestionzoo.main.entities.Zoo;
import tn.esprit.gestionzoo.main.entities.Aquatic;
import tn.esprit.gestionzoo.main.entities.Terrestrial;
import tn.esprit.gestionzoo.main.entities.Dolphin;
import tn.esprit.gestionzoo.main.entities.Penguin;


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



        Aquatic aquatic = new Aquatic();
        Terrestrial terrestrial = new Terrestrial();
        Dolphin dolphin = new Dolphin();
        Penguin penguin = new Penguin();



        Aquatic aquatic2 = new Aquatic("Fish", "Shark", 8, false, "Ocean");
        Terrestrial terrestrial2 = new Terrestrial("Mammal", "Lion", 5, true, 4);
        Dolphin dolphin2 = new Dolphin("Mammal", "Dolphin", 6, true, "Sea", 25.4f);
        Penguin penguin2 = new Penguin("Bird", "Penguin", 3, false, "Antarctica", 15.2f);

        System.out.println(aquatic2);
        System.out.println(terrestrial2);
        System.out.println(dolphin2);
        System.out.println(penguin2);

        aquatic2.swim();
        dolphin2.swim();
        penguin2.swim();

    }
    }
