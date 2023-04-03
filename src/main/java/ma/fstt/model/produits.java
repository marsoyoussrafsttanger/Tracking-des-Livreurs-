package ma.fstt.model;

public class produits {
    private int id;
    private String name;
    private int price;
    private int quantite;

    // Constructor
    public produits(int id, String name, int price, int quantite) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantite = quantite;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getprice() {
        return price;
    }

    public void setprice(int price) {
        this.price = price;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
}