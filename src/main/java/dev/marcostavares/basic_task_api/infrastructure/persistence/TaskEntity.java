package dev.marcostavares.basic_task_api.infrastructure.persistence;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import dev.marcostavares.basic_task_api.domain.enums.TaskPriorityEnum;
import dev.marcostavares.basic_task_api.domain.enums.TaskStatusEnum;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "tb_tasks")
public class TaskEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Getter
    private UUID id;

    @Getter
    private UUID userId;

    @Getter
    @Setter
    @Column(nullable = false, unique = true)
    private String title;

    @Getter
    @Setter
    private String description;

    @Getter
    @Setter
    @Column(nullable = false)
    private TaskPriorityEnum priority;

    @Getter
    @Setter
    private TaskStatusEnum status;

    @Getter
    @CreationTimestamp
    private LocalDateTime creationDate;

    @Getter
    @Column(nullable = false)
    private LocalDate dueDate;

}
