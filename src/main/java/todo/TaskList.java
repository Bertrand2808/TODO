package todo;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private List <Task> tasks; // On definit une liste de taches
    public TaskList() { // On cree un constructeur
        tasks = new ArrayList<>();
    }
    /**
     * Methode pour ajouter une tache
     * @param description la description de la tache
     */
    public void addTask(Long id, String description) { // Methode pour ajouter une tache
        /*
        * On parcourt la liste des taches
        * Si l'ID de la tache correspond à l'ID alors on affiche un message d'erreur et on sort de la boucle
        */
        for (Task task : tasks) {
            if (task.getId().equals(id)) {
                System.out.println("L'identifiant de la tâche est déjà utilisé.");
                return;
            }
        }
        Task task = new Task(id, description); // On cree une nouvelle tache avec l'ID et la description
        tasks.add(task); // On ajoute la tache à la liste
        System.out.println("Tache ajoutee avec succes : " + task.getDescription() + " (ID : " + task.getId() + ")");
    }
    /**
     * Methode pour supprimer une tache
     * @param id l'ID de la tache
     */
    public void removeTask(Long id) { // Methode pour supprimer une tache
        Task task = getTask(id); // On recupere la tache avec l'ID
        if (task.getId().equals(id)) { // Si l'ID de la tache correspond à l'ID de la tache recherchee
            tasks.remove(task); // On supprime la tache
            System.out.println("Tache supprimee avec succes");
        }
        else {
            System.out.println("Aucune tache existante");
        }
    }
    /**
     * Methode pour recuperer la liste des taches
     * @return la liste des taches
     */
    public List<Task> getTasks() { // Methode pour recuperer la liste des taches
        return tasks;
    }
    /** Methode pour recuperer une tache avec l'ID
     * @param id l'ID de la tache
     * @return la tache avec l'ID
     */
    public Task getTask(Long id) { // Methode pour recuperer une tache avec l'ID
        for (Task task : tasks) {
            if (task.getId().equals(id)) {
                return task;
            }
        }
        return null;
    }
    /**
     * Methode pour definir la liste des taches
     * @param tasks la liste des taches
     */
    public void setTasks(List<Task> tasks) { // Methode pour definir la liste des taches
        this.tasks = tasks;
    }
    /**
     * Methode pour marquer une tache comme terminee
     * @param id l'ID de la tache
     */
    public void markAsDone(Long id) { // Methode pour marquer une tache comme terminee
        Task task = getTask(id); // On recupere la tache avec l'ID
        if (task.getId().equals(id)) { // Si l'ID de la tache correspond à l'ID de la tache recherchee
            task.setDone(true); // On definit le statut de la tache comme terminee
            System.out.println("Tache marquee comme terminee");
        }
        else {
            System.out.println("Aucune tache existante");
        }
    }
    @Override
    public String toString() { // Methode toString pour afficher les informations de la liste de taches
        return "TaskList{" +
                "tasks=" + tasks +
                '}';
    }
}
