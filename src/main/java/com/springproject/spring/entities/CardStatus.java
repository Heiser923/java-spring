package com.springproject.spring.entities;

import com.springproject.spring.entities.bases.Base;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class CardStatus extends Base {

    private String status;

    @OneToMany (mappedBy = "cardStatus")
    private Set<Card> cards = new HashSet<>();
}
