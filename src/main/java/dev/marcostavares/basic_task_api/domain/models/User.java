package dev.marcostavares.basic_task_api.domain.models;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Getter
    private UUID id;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private List<Task> tasks;

    @Getter
    @Setter
    private String password;

    @Getter
    @CreationTimestamp
    private LocalDateTime userCreationDate;
}
