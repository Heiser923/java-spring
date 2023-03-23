package com.springproject.spring.entities;

import com.springproject.spring.entities.bases.Base;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Transaction extends Base {

    @ManyToOne
    private Card card;

    @ManyToOne
    private TransactionType transactionType;

}
