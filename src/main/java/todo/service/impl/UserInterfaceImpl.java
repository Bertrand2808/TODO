package todo.service.impl;
import todo.TaskList;

import java.util.Scanner;
public class UserInterfaceImpl implements todo.service.UserInterface{
    private final Scanner scanner;

    public UserInterfaceImpl(Scanner scanner) {
        this.scanner = scanner;
    }

    /**
     * Méthode pour lire l'entrée de l'utilisateur
     * @return l'entrée de l'utilisateur
     */
    @Override
    public String readLine() {
        return scanner.nextLine();
    }
    /**
     * Méthode pour afficher un message
     * @param message le message à afficher
     */
    @Override
    public void printLine(String message) { // Méthode pour afficher un message
        System.out.println(message); // On affiche le message
    }

    /*
    @Override
    public void afficherMenu(TaskList taskList) { // Méthode pour afficher le menu
        while (true) { // On crée une boucle infinie
            String choix; // On définit une variable pour le choix de l'utilisateur
            do {
                System.out.println("\nBienvenue dans votre gestionnaire de tâches !");
                System.out.println("1. Lister les tâches");
                System.out.println("2. Ajouter une tâche");
                System.out.println("3. Supprimer une tâche");
                System.out.println("4. Marquer une tâche comme faite");
                System.out.println("5. Quitter");
                System.out.println("Que souhaitez-vous faire ?");
                choix = scanner.nextLine(); // On récupère le choix de l'utilisateur
                try {
                    Integer.parseInt(choix); // On vérifie que le choix est bien un nombre
                } catch (NumberFormatException e) {
                    System.out.println("Veuillez entrer un nombre");
                    choix = scanner.nextLine();
                }
                switch (choix) { // On définit les différents cas
                    case "1":
                        taskList.getTasks(); // On récupère la liste des tâches
                    case "2":
                        System.out.println("Entrer la description de la tâche :");
                        String description = scanner.nextLine(); // On récupère la description de la tâche
                        taskList.addTask(description); // On ajoute une tâche
                    case "3":
                        System.out.println("Entrer l'ID de la tâche à supprimer :");
                        // Vérifie que l'entrée est bien un nombre
                        while (!scanner.hasNextLong()) {
                            System.out.println("Veuillez entrer un nombre");
                            scanner.next();
                        }
                        Long idToRemove = scanner.nextLong(); // On récupère l'ID de la tâche
                        taskList.removeTask(idToRemove); // On supprime une tâche
                    case "4":
                        System.out.println("Entrer l'ID de la tâche à marquer comme terminée :");
                        while (!scanner.hasNextLong()) {
                            System.out.println("Veuillez entrer un nombre");
                            scanner.next();
                        }
                        Long idToMarkDone = scanner.nextLong(); // On récupère l'ID de la tâche
                        taskList.markAsDone(idToMarkDone); // On marque une tâche comme terminée
                    case "5":
                        System.out.println("Au revoir !");
                        break;
                    default:
                        System.out.println("Choix invalide");

                }
            } while (Integer.parseInt(choix) < 1 || Integer.parseInt(choix) > 5); // On vérifie que le choix est bien compris entre 1 et 5
        }
    }

     */
}
