package ex3;

public class Animal {

    private String name;
    private String type;
    private String comportement;


    /**
     * Constructeur Animal
     * @param name
     * @param type
     * @param comportement
     */
    public Animal(String name, String type, String comportement) {
        this.name = name;
        this.type = type;
        this.comportement = comportement;
    }

    /**
     * Getter name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter type
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * Setter type
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Getter name
     * @return comportement
     */
    public String getComportement() {
        return comportement;
    }

    /**
     * Setter name
     * @param comportement
     */
    public void setComportement(String comportement) {
        this.comportement = comportement;
    }
}
