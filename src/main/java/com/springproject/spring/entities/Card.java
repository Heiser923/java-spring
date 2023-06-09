package com.springproject.spring.entities;

import com.springproject.spring.entities.bases.Base;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.sql.Time;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class Card extends Base {

    private String cardName;
    private Time expireDate;

    @ManyToOne
    private Account account;

    @ManyToOne
    private CardStatus cardStatus;

    @OneToMany (mappedBy = "card")
    private Set<Transaction> transaction = new HashSet<>();
}
