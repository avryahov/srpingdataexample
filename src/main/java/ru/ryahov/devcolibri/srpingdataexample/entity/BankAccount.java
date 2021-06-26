package ru.ryahov.devcolibri.srpingdataexample.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "bank_account")
@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@ToString
public class BankAccount {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id", length = 6, nullable = false)
    private long id;

    @NonNull
    @Column(name = "currency", nullable = false)
    private double currency;

    @NonNull
    @Column(name = "amount", nullable = false)
    private double amount;

    @NonNull
    @Column(name = "amount_of_credit", nullable = false)
    private double amountOfCredit;

    @NonNull
    @ToString.Exclude
    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;
}
