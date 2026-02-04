package ex3;

import java.util.List;

public class Zoo {

    private String nom;
    private List<Animal> animals;

    public Zoo(String nom) {
        this.nom = nom;
    }

    public void addAnimal(String nomAnimal, String typeAnimal, String comportement) {
        animals.add(new Animal(nomAnimal, typeAnimal, comportement));
    }

    /**
     * Afficher liste Animaux
     */
    public void afficherListeAnimaux() {
        for (Animal animal : animals) {
            System.out.println(animal.getName() + " " + animal.getType() + " " + animal.getComportement());
        }
    }

    /**
     *
     * @param animal
     * @return taille
     */
    public int taille(Animal animal) {
        return animal.getType().length();
    }

    /**
     * Getter for nom
     *
     * @param animal the animal to get name
     * @return the nom
     */
    public String getNom(Animal animal) {
        return animal.getName();
    }

    /**
     * Setter
     *
     * @param animal the animal to set name
     * @param nom the nom to set
     */
    public void setNom(Animal animal, String nom) {
        animal.setName(nom);
    }
}
