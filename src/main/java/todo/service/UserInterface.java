package todo.service;

import todo.TaskList;

public interface UserInterface { // Interface pour l'interface utilisateur
    String readLine(); // Méthode pour lire l'entrée de l'utilisateur
    void printLine(String message); // Méthode pour afficher un message
}
