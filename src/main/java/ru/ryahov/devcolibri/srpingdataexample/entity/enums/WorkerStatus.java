package ru.ryahov.devcolibri.srpingdataexample.entity.enums;


import lombok.EqualsAndHashCode;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@ToString
public enum WorkerStatus {
    MANAGER("менеджер"),
    NONE("");

    @NonNull
    final String name;

    public static WorkerStatus getStatus(String name) {
        for (WorkerStatus status : WorkerStatus.values()) {
            if (status.toString().equals(name)) {
                return status;
            }
        }
        return NONE;
    }
}
