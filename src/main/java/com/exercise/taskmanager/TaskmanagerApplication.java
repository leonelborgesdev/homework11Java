package com.exercise.taskmanager;

import com.exercise.taskmanager.domain.Task;
import com.exercise.taskmanager.domain.TaskService;
import com.exercise.taskmanager.domain.TaskServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class TaskmanagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskmanagerApplication.class, args);

	TaskService taskService = new TaskServiceImpl();

	// Ejemplo 1: Obtener una tarea por su ID
	Task task = taskService.getTaskById(1);
		System.out.println("Tarea obtenida por ID:");
		System.out.println(task);

	// Ejemplo 2: Agregar una nueva tarea
	Task newTask = new Task();
		newTask.setId(2);
		newTask.setTitle("Implement Data Persistence");
		newTask.setDescription("Store tasks in a database.");
	//newTask.setDueDate(LocalDate.of(2023, 9, 15));
		taskService.addTask(newTask);
		System.out.println("Nueva tarea agregada:");

	// Ejemplo 3: Obtener todas las tareas
	List<Task> allTasks = taskService.getAllTasks();
		System.out.println("Todas las tareas:");
		for (Task t : allTasks) {
		System.out.println(t);
	}
	}

}
