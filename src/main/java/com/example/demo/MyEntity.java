package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
public class MyEntity {
    @Id
    UUID id;
    String value;
}
