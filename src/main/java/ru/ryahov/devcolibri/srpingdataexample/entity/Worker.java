package ru.ryahov.devcolibri.srpingdataexample.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import ru.ryahov.devcolibri.srpingdataexample.entity.enums.WorkerStatus;

import javax.persistence.*;

@Entity
@Table(name = "worker")
@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@ToString
public class Worker {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id", length = 6, nullable = false)
    @ToString.Exclude
    private long id;

    @NonNull
    @Column(name = "first_name")
    private String firstName;

    @NonNull
    @Column(name = "last_name")
    private String lastName;

    @NonNull
    @ToString.Exclude
    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private WorkerStatus status;

    @NonNull
    @ToString.Exclude
    @Column(name = "phone_number")
    private String phoneNumber;

    @NonNull
    @ToString.Exclude
    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "bank_id", nullable = false)
    private Bank bank;

}
