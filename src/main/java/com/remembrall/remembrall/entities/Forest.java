package com.remembrall.remembrall.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.UUID;

@Entity
@Table(name = "forest")
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Forest {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private UUID id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "roles", nullable = false)
    private ArrayList<String> roles;

}
