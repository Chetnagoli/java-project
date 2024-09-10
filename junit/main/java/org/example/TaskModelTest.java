package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;

class TaskModelTest {

    @Test
    void testCreateTask() {
        Task task = new Task("Test Task", "Description", LocalDate.of(2024, 12, 31));
        assertNotNull(task);
        assertEquals("Test Task", task.getTitle());
        assertEquals("Description", task.getDescription());
        assertEquals(LocalDate.of(2024, 12, 31), task.getDueDate());
    }

    @Test
    void testUpdateTask() {
        Task task = new Task("Test Task", "Description", LocalDate.of(2024, 12, 31));
        task.setTitle("Updated Task");
        assertEquals("Updated Task", task.getTitle());
    }
}

class TaskManagerTest {

    @Test
    void testAddTask() {
        TaskManager manager = new TaskManager();
        Task task = new Task("New Task", "Description", LocalDate.of(2024, 12, 31));
        manager.addTask(task);
        assertTrue(manager.getTasks().contains(task));
    }

    @Test
    void testRemoveTask() {
        TaskManager manager = new TaskManager();
        Task task = new Task("Task to Remove", "Description", LocalDate.of(2024, 12, 31));
        manager.addTask(task);
        manager.removeTask(task);
        assertFalse(manager.getTasks().contains(task));
    }
}
