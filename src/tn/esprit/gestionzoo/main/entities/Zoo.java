package tn.esprit.gestionzoo.main.entities; // Déclare le package en haut du fichier

public class Zoo {
    Animal[] animals = new Animal[2];
    String name;
    String city;
    int nbrCages;
    int nbAnimals;

    public Zoo() {
    }

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;


    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("L'âge d'un animal ne peut pas être négatif");
        }
        this.name = name;
    }

    public void displayZoo() {
        System.out.println("Zoo [ name : " + name + " city " + city + " nbrCages : " + nbrCages + "]");
    }

    public String toString() {
        return "Zoo [name : " + name + " city " + " city : ]";
    }

    public boolean addAnimal(Animal animal) {
        if (isZooFull()) return false;
        if (searchAnimal(animal) != -1) return false;

        animals[nbAnimals++] = animal;
        return true;
    }


    public void affiche() {
        for (int i = 0; i < animals.length; i++) {

            System.out.println("tableaux :" + animals[i]);

        }
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null && animal.getName().equals(animals[i].getName())) { //getName instruction 18
                return i;
            }
            ;
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal) {
        int indice = searchAnimal(animal);
        if (indice == -1)
            return false;
        if (indice == animals.length) {
            animals[indice] = null;
            nbAnimals--;
            return true;
        }
        for (int i = indice; i < animals.length - 1; i++) {
            animals[i] = animals[i + 1];
        }
        nbAnimals--;
        return true;
    }
    public boolean isZooFull(){
        if (nbAnimals == animals.length) return true;
        return false;
    }
    public static Zoo comparerZoo(Zoo z1, Zoo z2){
        if (z1.nbAnimals > z2.nbAnimals){
            return z1;
        }
        return z2;
    }

}