package dev.marcostavares.basic_task_api.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import dev.marcostavares.basic_task_api.enums.TaskPriorityEnum;
import dev.marcostavares.basic_task_api.enums.TaskStatusEnum;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "tb_tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Getter
    private UUID id;

    @Getter
    @Setter
    private UUID userId;

    @Getter
    @Setter
    private String title;

    @Getter
    @Setter
    private String description;

    @Getter
    @Setter
    private TaskPriorityEnum priority;

    @Getter
    @Setter
    private TaskStatusEnum status;

    @CreationTimestamp
    private LocalDateTime creationDate;

    @Getter
    private LocalDate dueDate;

}
