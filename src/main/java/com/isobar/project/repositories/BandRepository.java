package com.isobar.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.isobar.project.entities.*;

public interface BandRepository extends JpaRepository<Band, String> {

}