package com.vala.controladores_rest.Repositories;

import com.vala.controladores_rest.Entities.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public abstract interface LaptopRepository extends JpaRepository<Laptop, Long> {


}
