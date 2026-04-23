package com.remembrall.remembrall.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "\"user\"", indexes = @Index(columnList = "username", name = "username_index"))
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private UUID id;

    @Column(unique = true, nullable = false, name = "username")
    private String username;

    @Column(nullable = false, name = "createdAt")
    private LocalDate createdAt;

    @Column(nullable = false, name = "updatedAt")
    private LocalDate updatedAt;

    public User(String username, LocalDate createdAt, LocalDate updatedAt) {
        this.username = username;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}
