package com.board.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.board.repository.CardRepository;
import com.board.dto.CardDetailsDTO;
import com.board.model.Card;
import com.board.model.CardStatus;
import java.util.UUID;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CardService {

    @Autowired
    private CardRepository repository;

    public CardDetailsDTO create(CardDetailsDTO dto) {
        Card card = new Card(UUID.randomUUID(), dto.getTitle(), dto.getDescription(), CardStatus.TODO);
        repository.save(card);
        return dto;
    }

    public List<CardDetailsDTO> getAll() {
        return repository.findAll().stream()
            .map(card -> new CardDetailsDTO(card.getId(), card.getTitle(), card.getDescription(), card.getStatus().name()))
            .collect(Collectors.toList());
    }

    public CardDetailsDTO getById(UUID id) {
        Optional<Card> card = repository.findById(id);
        if (card.isPresent()) {
            Card c = card.get();
            return new CardDetailsDTO(c.getId(), c.getTitle(), c.getDescription(), c.getStatus().name());
        }
        return null; // ou lance uma exceção
    }

    public CardDetailsDTO update(UUID id, CardDetailsDTO dto) {
        Optional<Card> cardOpt = repository.findById(id);
        if (cardOpt.isPresent()) {
            Card card = cardOpt.get();
            card.setTitle(dto.getTitle());
            card.setDescription(dto.getDescription());
            card.setStatus(CardStatus.valueOf(dto.getStatus()));
            repository.save(card);
            return new CardDetailsDTO(card.getId(), card.getTitle(), card.getDescription(), card.getStatus().name());
        }
        return null; // ou lance uma exceção
    }

    public void delete(UUID id) {
        repository.deleteById(id);
    }
}