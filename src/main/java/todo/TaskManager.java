package todo;

import todo.service.UserInterface;

public class TaskManager {

    private final TaskList taskList; // On définit une liste de tâches
    private final UserInterface userInterface; // On définit une interface utilisateur
    public TaskManager(UserInterface userInterface) { // On crée un constructeur
        taskList = new TaskList();
        this.userInterface = userInterface;
    }

    public void run() {
        //
        while(true){
            displayMenu();
            String command = userInterface.readLine();

            switch (command) {
                case "add" -> {
                    userInterface.printLine("Entrer la description de la tâche :");
                    String description = userInterface.readLine(); // On récupère la description de la tâche
                    userInterface.printLine("Entrer l'id de la tâche :");
                    Long id = Long.parseLong(userInterface.readLine()); // On récupère l'id de la tâche
                    taskList.addTask(id, description); // On ajoute une tâche
                }
                case "done" -> {
                    userInterface.printLine("Entrer l'ID de la tâche à marquer comme faite :");
                    long task_id = Long.parseLong(userInterface.readLine());
                    taskList.markAsDone(task_id);
                }
                case "remove" -> {
                    userInterface.printLine("Entrer l'ID de la tâche à supprimer :");
                    long task_id = Long.parseLong(userInterface.readLine());
                    taskList.removeTask(task_id);
                }
                case "list" -> {
                    userInterface.printLine("Liste des tâches :");
                    for (Task task : taskList.getTasks()) { // On parcourt la liste des tâches
                        userInterface.printLine(task.toString()); // On affiche la tâche
                    }
                }
                case "exit" -> {
                    return;
                }
                default -> userInterface.printLine("Commande inconnue");
            }

        }
    }
    /**
     * Méthode pour afficher le menu
     */
    void displayMenu() { // Méthode pour afficher le menu
        userInterface.printLine("Entrer une commande : add, done, remove, list, exit");
    }
}
