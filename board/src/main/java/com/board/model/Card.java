package com.board.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;
import java.util.UUID;

@Entity
public class Card {
    @Id
    private UUID id;
    private String title;
    private String description;

    @Enumerated(EnumType.STRING)
    private CardStatus status;

    // Getters e Setters (recomendado para JPA)
    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public CardStatus getStatus() { return status; }
    public void setStatus(CardStatus status) { this.status = status; }

    // Construtor vazio para JPA
    public Card() {}

    // Construtor completo
    public Card(UUID id, String title, String description, CardStatus status) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.status = status;
    }
}