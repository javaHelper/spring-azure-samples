package com.oreilly.integration;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Todo {
	@Id
    private Long id;

    private String description;

    private String details;

    private boolean done;
}
