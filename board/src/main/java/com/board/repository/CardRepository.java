package com.board.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.board.model.Card;
import java.util.UUID;

@Repository
public interface CardRepository extends JpaRepository<Card, UUID> {}