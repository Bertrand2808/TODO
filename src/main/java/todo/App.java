package todo;

import todo.service.UserInterface;
import todo.service.impl.UserInterfaceImpl;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // On crée un scanner
        UserInterface userInterface = new UserInterfaceImpl(scanner); // On crée une interface utilisateur
        TaskManager taskManager = new TaskManager(userInterface);
        taskManager.run(); // On affiche le menu
    }
}
