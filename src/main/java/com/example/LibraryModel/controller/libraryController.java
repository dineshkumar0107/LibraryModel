package com.example.LibraryModel.controller;

import com.example.LibraryModel.model.libraryModel;
import com.example.LibraryModel.service.libraryService;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/v1/lib-app")
public class libraryController {

    private final libraryService libService;

    public libraryController(libraryService libService) {

        this.libService = libService;
    }

    @PostMapping("/add-lib")
    public void addLib(@RequestBody libraryModel library) {
        libService.addLib(library);
    }

    @GetMapping("find-all")
    public List<libraryModel> findAll() {
        return libService.findAll();

    }
}
