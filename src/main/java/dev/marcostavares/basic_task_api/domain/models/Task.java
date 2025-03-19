package dev.marcostavares.basic_task_api.domain.models;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import dev.marcostavares.basic_task_api.domain.enums.TaskPriorityEnum;
import dev.marcostavares.basic_task_api.domain.enums.TaskStatusEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class Task {

    @Getter
    private UUID id;

    @Getter
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

    @Getter
    @CreationTimestamp
    private LocalDateTime creationDate;

    @Getter
    private LocalDate dueDate;

}
