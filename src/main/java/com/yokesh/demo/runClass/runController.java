package com.yokesh.demo.runClass;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/run")
public class runController {
    private final runRepo runRepositary;

    public runController(runRepo runRepositary) {
        this.runRepositary = runRepositary;
    }

    @GetMapping("/Hello")
    String home() {
        return "Hello";
    }

    @GetMapping("")
    List<Run> find() {
        return runRepositary.findAll();
    }

    @GetMapping("/{id}")
    Run findId(@PathVariable Integer id) {
        Optional<Run> run = runRepositary.findId(id);
        if (run.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return run.get();
    }

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    void create(@RequestBody Run run) {
        runRepositary.create(run);
    }
}
