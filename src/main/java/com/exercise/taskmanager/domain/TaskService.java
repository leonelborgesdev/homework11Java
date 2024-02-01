package com.exercise.taskmanager.domain;

import java.util.List;

public interface TaskService {
    Task getTaskById(long id);
    List<Task> getAllTasks();
    void addTask(Task task);
}
