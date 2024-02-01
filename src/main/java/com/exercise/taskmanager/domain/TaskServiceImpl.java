package com.exercise.taskmanager.domain;

import java.util.Collections;
import java.util.List;

public class TaskServiceImpl implements TaskService {
    private Task task;

    public void setTask(Task task) {
        this.task = task;
    }

    @Override
    public Task getTaskById(long id) {
        // En una implementación real, buscaríamos la tarea por su ID de una fuente de datos, una lista o una BD
        // Para este ejemplo, devolveremos el bean de task inyectado
        return task;
    }

    @Override
    public List<Task> getAllTasks() {
        return Collections.singletonList(task);
    }

    @Override
    public void addTask(Task task) {
        this.task = task;
    }
}
