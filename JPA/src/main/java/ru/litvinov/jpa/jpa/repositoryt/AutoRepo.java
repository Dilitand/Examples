package ru.litvinov.jpa.jpa.repositoryt;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.litvinov.jpa.jpa.models.Auto;

@Repository
public interface AutoRepo extends JpaRepository<Auto,Long> {

}
