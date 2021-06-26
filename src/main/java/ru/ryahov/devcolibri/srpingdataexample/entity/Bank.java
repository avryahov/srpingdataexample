package ru.ryahov.devcolibri.srpingdataexample.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "bank")
@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@ToString(of = {"name"})
public class Bank {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id", length = 6, nullable = false)
    private long id;

    @NonNull
    @Column(name = "name", nullable = false)
    private String name;
}
