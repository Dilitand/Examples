package ru.litvinov.jpa.jpa.service;

import ru.litvinov.jpa.jpa.models.Auto;

import java.util.List;

public interface AutoService {
    Auto createAuto(Auto auto);
    Auto getAuto(Long id);
    Auto editAuto(Auto auto);
    void deleteAuto(Auto auto);
    void deleteAuto(Long id);
    List getAllAutos(int pageNumber, int pageSize);
    List getAllAutos();
    long countAutos();
}
