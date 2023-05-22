package todo;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import todo.service.UserInterface;

import static org.mockito.Mockito.*;

public class TaskManagerTest {
    private TaskList taskList;
    private TaskManager taskManager;
    private UserInterface userInterfaceMock;

    /*
    * @BeforeEach est une annotation JUnit 5 qui permet d'exécuter une méthode avant chaque test.
    */
    @BeforeEach
    public void setUp() {
        taskList = new TaskList(); // On crée une liste de tâches
        userInterfaceMock = Mockito.mock(UserInterface.class); // On crée un mock de l'interface utilisateur
        taskManager = new TaskManager(userInterfaceMock); // On crée un gestionnaire de tâches
    }
    /*
    * Teste si la méthode displayMenu affiche le bon message
    */
    @Test
    public void testDisplayMenu() {
        taskManager.displayMenu();
        verify(userInterfaceMock, times(1)).printLine("Entrer une commande : add, done, remove, list, exit");
    }
    /*
    * Teste si la méthode run affiche les bons messages pour les commandes add, done, remove, list et exit
    */
    @Test
    public void testTaskManager_exit() { // Test du menu
        when(userInterfaceMock.readLine())
                .thenReturn("exit");
        TaskManager taskManager = new TaskManager(userInterfaceMock);
        taskManager.run();

        verify(userInterfaceMock, times(1)).printLine("Entrer une commande : add, done, remove, list, exit");
        verify(userInterfaceMock);
    }
    /*
    * Teste si la méthode add ajoute une tâche à la liste de tâches avec la description donnée "Test task"
    */
    @Test
    public void testRun_addTask() {
        when(userInterfaceMock.readLine())
                .thenReturn("add")
                .thenReturn("Test task")
                .thenReturn("1")
                .thenReturn("exit");

        taskManager.run();

        // Vérifiez si la bonne tâche a été ajoutée à la liste de tâches
        verify(userInterfaceMock, times(2)).printLine("Entrer une commande : add, done, remove, list, exit");
    }
    /*
    * Teste si la méthode markAsDone marque une tâche comme terminée selon l'ID donné
    */
    @Test
    public void testRun_markAsDone() {
        // Ajout de quelques tâches pour nos tests
        when(userInterfaceMock.readLine())
                .thenReturn("add")
                .thenReturn("Test task")
                .thenReturn("1")
                .thenReturn("done")
                .thenReturn("1") // L'ID de la première tâche est 1
                .thenReturn("exit");
        taskManager.run();
        verify(userInterfaceMock, times(3)).printLine("Entrer une commande : add, done, remove, list, exit");

    }
    /*
    * Teste si la méthode removeTask supprime une tâche selon l'ID donné
    */
    @Test
    public void testRun_removeTask() {
        // Ajout de quelques tâches pour nos tests
        when(userInterfaceMock.readLine())
                .thenReturn("add")
                .thenReturn("Test task")
                .thenReturn("1")
                .thenReturn("remove")
                .thenReturn("1") // L'ID de la première tâche est 1
                .thenReturn("exit");
        taskManager.run();
        verify(userInterfaceMock, times(3)).printLine("Entrer une commande : add, done, remove, list, exit");
    }
    /*
    * Teste si la méthode removeTask supprime une tâche selon l'ID donné
    */
    @Test
    public void testRun_displayTask() {
        // Ajout de quelques tâches pour nos tests
        when(userInterfaceMock.readLine())
                .thenReturn("add")
                .thenReturn("Test task")
                .thenReturn("1")
                .thenReturn("add")
                .thenReturn("Test task 2")
                .thenReturn("2")
                .thenReturn("list")
                .thenReturn("exit");
        taskManager.run();
        verify(userInterfaceMock, times(4)).printLine("Entrer une commande : add, done, remove, list, exit");
    }


    @Test
    public void testAddTaskWithExistingId() {
        TaskList taskList = new TaskList();
        taskList.addTask(Long.valueOf("1"),"Première tâche");
        taskList.addTask(Long.valueOf("2"),"Deuxième tâche");

        assertEquals(2, taskList.getTasks().size());

        taskList.addTask(Long.valueOf("2"),"Tâche avec ID existant");
        assertEquals(2, taskList.getTasks().size()); // La taille de la liste des tâches n'a pas changé car l'ajout a été refusé
    }


}