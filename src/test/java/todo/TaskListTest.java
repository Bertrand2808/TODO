package todo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskListTest {
    @Test
    void testAddTask() { // Test de l'ajout d'une tâche
        TaskList taskList = new TaskList();
        Long id_1 = Long.parseLong("1");
        Long id_2 = Long.parseLong("2");
        String description = "description";
        String description2 = "description2";
        taskList.addTask(id_1, description);
        taskList.addTask(id_2, description2);
        assertEquals(2, taskList.getTasks().size());
        assertNotNull(taskList.getTasks().get(0));
        assertNotNull(taskList.getTasks().get(1));
        assertEquals(description, taskList.getTasks().get(0).getDescription());
        assertEquals(description2, taskList.getTasks().get(1).getDescription());
        assertNotNull(taskList.getTasks().get(0).getId());
        assertNotNull(taskList.getTasks().get(1).getId());
        assertNotEquals(taskList.getTasks().get(0).getId(), taskList.getTasks().get(1).getId());
        assertEquals(false, taskList.getTasks().get(0).isDone());
        assertEquals(false, taskList.getTasks().get(1).isDone());
    }
    @Test
    void testRemoveTask() { // Test de la suppression d'une tâche
        TaskList taskList = new TaskList();
        Long id_1 = Long.parseLong("1");
        Long id_2 = Long.parseLong("2");
        String description = "description";
        String description2 = "description2";
        taskList.addTask(id_1, description);
        taskList.addTask(id_2, description2);
        assertEquals(2, taskList.getTasks().size());
        taskList.removeTask(1L);
        assertEquals(1, taskList.getTasks().size());
        assertNotNull(taskList.getTasks().get(0));
        assertNotNull(taskList.getTasks());
    }
    @Test
    void testGetTasks() { // Test de la récupération des tâches
        TaskList taskList = new TaskList();
        Long id_1 = Long.parseLong("1");
        Long id_2 = Long.parseLong("2");
        String description = "description";
        String description2 = "description2";
        taskList.addTask(id_1, description);
        taskList.addTask(id_2, description2);
        assertNotNull(taskList.getTasks());
        assertNotNull(taskList.getTasks().get(0));
        assertEquals(description, taskList.getTasks().get(0).getDescription());
        assertNotNull(taskList.getTasks().get(1));
        assertEquals(description2, taskList.getTasks().get(1).getDescription());
        // Test de la récupération d'une seule tâche par son ID
        assertNotNull(taskList.getTask(1L));
        assertEquals(description, taskList.getTask(1L).getDescription());
        assertNotNull(taskList.getTask(2L));
        assertEquals(description2, taskList.getTask(2L).getDescription());
    }
    @Test
    void testMarkAsDone() { // Test du passage d'une tâche à l'état "done"
        TaskList taskList = new TaskList();
        Long id_1 = Long.parseLong("1");
        Long id_2 = Long.parseLong("2");
        String description = "description";
        String description2 = "description2";
        taskList.addTask(id_1, description);
        taskList.addTask(id_2, description2);
        assertNotNull(taskList.getTasks());
        assertNotNull(taskList.getTasks().get(0));
        assertEquals(description, taskList.getTasks().get(0).getDescription());
        assertNotNull(taskList.getTasks().get(1));
        assertEquals(description2, taskList.getTasks().get(1).getDescription());
        assertEquals(false, taskList.getTasks().get(0).isDone());
        assertEquals(false, taskList.getTasks().get(1).isDone());
        taskList.markAsDone(1L);
        assertEquals(true, taskList.getTasks().get(0).isDone());
        assertEquals(false, taskList.getTasks().get(1).isDone());
        taskList.markAsDone(2L);
        assertEquals(true, taskList.getTasks().get(0).isDone());
        assertEquals(true, taskList.getTasks().get(1).isDone());
    }
    @Test
    void testToString() { // Test de la méthode toString
        TaskList taskList = new TaskList();
        Long id_1 = Long.parseLong("1");
        Long id_2 = Long.parseLong("2");
        String description = "description";
        String description2 = "description2";
        taskList.addTask(id_1, description);
        taskList.addTask(id_2, description2);
        assertNotNull(taskList.getTasks());
        assertNotNull(taskList.getTasks().get(0));
        assertEquals(description, taskList.getTasks().get(0).getDescription());
        assertNotNull(taskList.getTasks().get(1));
        assertEquals(description2, taskList.getTasks().get(1).getDescription());
        assertEquals("TaskList{tasks=[Task{id=1, description='description', isDone=false}, Task{id=2, description='description2', isDone=false}]}", taskList.toString());
    }
}