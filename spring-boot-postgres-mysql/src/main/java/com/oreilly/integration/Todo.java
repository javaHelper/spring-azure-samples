package com.oreilly.integration;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
public class Todo {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String description;

    private String details;

    private boolean done;
}
