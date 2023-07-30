package com.example.htmlserver.repository;

import com.example.htmlserver.entity.htmlEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface htmlRepository extends JpaRepository<htmlEntity,Long> {
    @Query("select e from htmlEntity e where e.name=:name")
    htmlEntity getByName(@Param("name")String name);
}
