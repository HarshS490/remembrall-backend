package com.remembrall.remembrall.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;

@Entity
@Table(name="user", indexes = @Index(columnList = "username", name="username_index"))
@Getter @Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor @AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique=true, nullable = false, name = "username")
    private String username;

    @Column(nullable = false, name = "createdAt")
    private LocalDate createdAt;

    @Column(nullable = false, name = "updatedAt")
    private LocalDate updatedAt;

    @Column(nullable = false, name = "followers")
    @ManyToMany(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
    private ArrayList<User> followers;

    @Column(nullable = false, name="following")
    @ManyToMany(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
    private ArrayList<User> following;
}
