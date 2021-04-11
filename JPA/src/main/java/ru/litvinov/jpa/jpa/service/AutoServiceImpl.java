package ru.litvinov.jpa.jpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import ru.litvinov.jpa.jpa.models.Auto;
import ru.litvinov.jpa.jpa.repositoryt.AutoRepo;

import java.util.List;

@Service
public class AutoServiceImpl implements AutoService {

    @Autowired
    AutoRepo repo;

    @Override
    public Auto createAuto(Auto auto) {
        return repo.save(auto);
    }

    @Override
    public Auto getAuto(Long id) {
        return repo.getOne(id);
    }

    @Override
    public Auto editAuto(Auto auto) {
        return repo.save(auto);
    }

    @Override
    public void deleteAuto(Auto auto) {
        repo.delete(auto);
    }

    @Override
    public void deleteAuto(Long id) {
        repo.deleteById(id);
    }

    @Override
    public List getAllAutos(int pageNumber, int pageSize) {
        return null;//repo.findAll(new PageRequest(pageNumber, pageSize)).getContent();
    }

    @Override
    public List getAllAutos() {
        return repo.findAll();
    }

    @Override
    public long countAutos() {
        return repo.count();
    }
}
