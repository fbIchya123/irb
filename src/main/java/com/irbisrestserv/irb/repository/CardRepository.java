package com.irbisrestserv.irb.repository;

import com.irbisrestserv.irb.models.Card;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.solr.repository.Query;
import org.springframework.data.solr.repository.SolrCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends SolrCrudRepository<Card, Integer> {

    @Query("name:*?0*")
    Page<Card> findByCustomQuery(String searchTerm, Pageable pageable);


    void deleteByName(String name);
}
