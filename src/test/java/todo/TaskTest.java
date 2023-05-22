package todo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    @Test
    void testGetterSetter() { // Test des getters et setters
        Long id = 1L;
        Long id2 = 2L;
        String description = "description";
        String description2 = "description2";
        boolean state = false;
        boolean state2 = true;
        // Appel des constructeurs vides, avec l'ID, avec l'ID et la description, avec l'ID, la description et le statut
        Task task = new Task();
        Task taskById = new Task(id);
        Task taskById2 = new Task(id2);
        Task taskByIdAndDescription = new Task(id, description);
        Task taskByIdAndDescription2 = new Task(id2, description2);
        Task taskByIdAndDescriptionAndState = new Task(id, description, state);
        Task taskByIdAndDescriptionAndState2 = new Task(id2, description2, state2);
        // Test des getters taskById
        assertEquals(id, taskById.getId());
        assertNotNull(taskById.getId());
        assertEquals(id2, taskById2.getId());
        assertNotNull(taskById2.getId());
        assertNotEquals(taskById.getId(), taskById2.getId());
        // Test des getters taskByIdAndDescription
        assertEquals(id, taskByIdAndDescription.getId());
        assertNotNull(taskByIdAndDescription.getId());
        assertEquals(description, taskByIdAndDescription.getDescription());
        assertNotNull(taskByIdAndDescription.getDescription());
        assertEquals(id2, taskByIdAndDescription2.getId());
        assertNotNull(taskByIdAndDescription2.getId());
        assertEquals(description2, taskByIdAndDescription2.getDescription());
        assertNotNull(taskByIdAndDescription2.getDescription());
        assertNotEquals(taskByIdAndDescription.getId(), taskByIdAndDescription2.getId());
        assertNotEquals(taskByIdAndDescription.getDescription(), taskByIdAndDescription2.getDescription());
        // Test des getters taskByIdAndDescriptionAndState
        assertEquals(id, taskByIdAndDescriptionAndState.getId());
        assertNotNull(taskByIdAndDescriptionAndState.getId());
        assertEquals(description, taskByIdAndDescriptionAndState.getDescription());
        assertNotNull(taskByIdAndDescriptionAndState.getDescription());
        assertEquals(state, taskByIdAndDescriptionAndState.isDone());
        assertNotNull(taskByIdAndDescriptionAndState.isDone());
        assertEquals(id2, taskByIdAndDescriptionAndState2.getId());
        assertNotNull(taskByIdAndDescriptionAndState2.getId());
        assertEquals(description2, taskByIdAndDescriptionAndState2.getDescription());
        assertNotNull(taskByIdAndDescriptionAndState2.getDescription());
        assertEquals(state2, taskByIdAndDescriptionAndState2.isDone());
        assertNotNull(taskByIdAndDescriptionAndState2.isDone());
        assertNotEquals(taskByIdAndDescriptionAndState.getId(), taskByIdAndDescriptionAndState2.getId());
        assertNotEquals(taskByIdAndDescriptionAndState.getDescription(), taskByIdAndDescriptionAndState2.getDescription());
        assertNotEquals(taskByIdAndDescriptionAndState.isDone(), taskByIdAndDescriptionAndState2.isDone());
        // Test des setters task
        task.setId(id);
        task.setDescription(description);
        task.setDone(state);
        assertEquals(id, task.getId());
        assertNotNull(task.getId());
        assertEquals(description, task.getDescription());
        assertNotNull(task.getDescription());
        assertEquals(state, task.isDone());
        assertNotNull(task.isDone());
    }

    @Test
    void testToString() { // Test de la méthode toString
        Long id = 1L;
        String description = "description";
        boolean state = false;
        Task task = new Task(id, description, state);
        assertEquals("Task{id=1, description='description', isDone=false}", task.toString());
    }
}