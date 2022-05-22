package com.irbisrestserv.irb.repo;

import com.irbisrestserv.irb.models.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card, Long> {
}
