package com.informatorio.myblog.repository;

import com.informatorio.myblog.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.util.List;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    //Aca van las consultas(Querys)

    //Obtener todos los usuarios de la ciudad de Resistencia
    @Query("FROM User WHERE ciudad LIKE 'Resistencia'")
    List <User> findUsersByCity();

    //Obtener todos los usuarios que fueron creados luego de una fecha dada
    @Query("FROM User WHERE FechaCreacion > ?1")
    List <User> findCreationDateAfter(LocalDate date);
}
