package ex5;

import java.util.ArrayList;
import java.util.List;

public class Caisse {

    private String nom;
    private List<Item> items;
    private int poidsMin;
    private int poidsMax;

    /**
     * Constructeur
     *
     * @param nom
     */
    public Caisse(String nom, int poidsMin, int poidsMax) {
        super();
        this.nom = nom;
        this.poidsMax = poidsMax;
        this.items = new ArrayList<>();
    }

    /**
     * Getter pour l'attribut nom
     *
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter pour l'attribut nom
     *
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Getter pour l'attribut items
     *
     * @return the items
     */
    public List<Item> getItems() {
        return items;
    }

    /**
     * Setter pour l'attribut items
     *
     * @param items the items to set
     */
    public void setItems(List<Item> items) {
        this.items = items;
    }

    public boolean canTake(Item item) {
        return item.getPoids() <= poidsMax && item.getPoids() >= poidsMin ;
    }

    public int getTaille() {
        return this.getItems().size();
    }
}
