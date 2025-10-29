// Définition d'une classe Personne
public class Personne {

    // --- Attributs ---
    private String nom;
    private int age;

    // --- Constructeur ---
    public Personne(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    // --- Méthodes ---
    public void sePresenter() {
        System.out.println("Bonjour, je m'appelle " + nom + " et j'ai " + age + " ans.");
    }

    // --- Getters et Setters ---
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
