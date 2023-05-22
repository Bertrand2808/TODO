package todo;

public class Task {
    public Long id; // ID de la tâche
    public String description; // Description de la tâche
    public boolean isDone; // Statut de la tâche (true = terminée, false = non terminée)

    // Constructeurs
    public Task() { // Constructeur vide
    }
    /**
     * Constructeur avec l'ID
     * @param id ID de la tâche
     */
    public Task(Long id) { // Constructeur avec l'ID
        this.id = id; // Définition de l'ID
    }
    /**
     * Constructeur avec l'ID et la description
     * @param id ID de la tâche
     * @param description Description de la tâche
     */
    public Task(Long id, String description) { // Constructeur avec l'ID et la description
        this(id); // Appel du constructeur avec l'ID
        this.description = description; // Définition de la description
    }
    /**
     * Constructeur avec l'ID, la description et le statut
     * @param id ID de la tâche
     * @param description Description de la tâche
     * @param isDone Statut de la tâche
     */
    public Task(Long id, String description, boolean isDone) { // Constructeur avec l'ID, la description et le statut
        this(id, description); // Appel du constructeur avec l'ID et la description
        this.isDone = isDone; // Définition du statut
    }
    // Getter et Setter
    /**
     * Getter de l'ID
     * @return ID de la tâche
     */
    public Long getId() {
        return id;
    }
    /**
     * Setter de l'ID
     * @param id ID de la tâche
     */
    public void setId(Long id) {
        this.id = id;
    }
    /**
     * Getter de la description
     * @return Description de la tâche
     */
    public String getDescription() {
        return description;
    }
    /**
     * Setter de la description
     * @param description Description de la tâche
     */
    public void setDescription(String description) {
        this.description = description;
    }
    /**
     * Getter du statut
     * @return Statut de la tâche
     */
    public boolean isDone() {
        return isDone;
    }
    /**
     * Setter du statut
     * @param done Statut de la tâche
     */
    public void setDone(boolean done) {
        isDone = done;
    }
    @Override
    public String toString() { // Méthode toString pour afficher les informations de la tâche
        return "Task{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", isDone=" + isDone +
                '}';
    }
}
