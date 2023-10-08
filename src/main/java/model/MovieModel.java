package model;

public class MovieModel {
    private int id;
    private String name;
    private boolean available;

    public MovieModel(int id, String name) {
        this.id = id;
        this.name = name;
        this.available = true; // Por defecto, una película se crea como disponible
    }
    // Getters y setters para los atributos
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
