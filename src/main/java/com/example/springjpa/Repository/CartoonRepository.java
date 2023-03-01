package com.example.springjpa.Repository;

import com.example.springjpa.model.Cartoons;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartoonRepository extends JpaRepository<Cartoons,String> {

}
