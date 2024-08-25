package com.yokesh.demo.runClass;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class runRepo {
    private List<Run> runs = new ArrayList<>();

    List<Run> findAll() {
        return runs;
    }

    Optional<Run> findId(Integer id) {
        return runs.stream().filter(run -> run.id() == id).findFirst();
    }

    void create(Run run) {
        runs.add(run);
    }

    @PostConstruct
    private void init() {
        runs.add(new Run(1, "Monday", LocalDateTime.now(), LocalDateTime.now().plus(1, ChronoUnit.HOURS), 7));
        runs.add(new Run(2, "Tuesday", LocalDateTime.now(), LocalDateTime.now().plus(1, ChronoUnit.HOURS), 8));
    }
}
