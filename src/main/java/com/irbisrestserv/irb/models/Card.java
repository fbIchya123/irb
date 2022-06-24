package com.irbisrestserv.irb.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.Indexed;
import org.springframework.data.solr.core.mapping.SolrDocument;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SolrDocument(solrCoreName = "Cards")
public class Card {

    @Indexed(name = "name", type = "string")
    private String name;

    @Id
    @Indexed(name = "inn", type = "string")
    private String inn;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }
}
