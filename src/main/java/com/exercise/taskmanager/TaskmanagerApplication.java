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


	}

}
