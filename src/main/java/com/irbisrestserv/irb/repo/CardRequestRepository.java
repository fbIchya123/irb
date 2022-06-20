package com.irbisrestserv.irb.repo;

import com.irbisrestserv.irb.models.Card;
import com.irbisrestserv.irb.models.CardRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRequestRepository extends JpaRepository<Card, Long> {
}
