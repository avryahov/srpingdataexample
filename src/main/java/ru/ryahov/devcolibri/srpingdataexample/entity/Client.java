package ru.ryahov.devcolibri.srpingdataexample.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "client")
@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@ToString
public class Client {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id", length = 6, nullable = false)
    @ToString.Exclude
    private long id;

    @NonNull
    @ToString.Include
    @Column(name = "first_name")
    private String firstName;

    @NonNull
    @ToString.Include
    @Column(name = "last_name")
    private String lastName;

    @NonNull
    @ToString.Exclude
    @Column(name = "phone_number")
    private String phoneNumber;

    @NonNull
    @ToString.Exclude
    @Column(name = "address")
    private String address;

    @NonNull
    @ToString.Include
    @Column(name = "email")
    private String email;

    @NonNull
    @ToString.Exclude
    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "bank_id", nullable = false)
    private Bank bank;
}
