package com.example.htmlserver.repository;

import com.example.htmlserver.entity.HtmlEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface htmlRepository extends JpaRepository<HtmlEntity,Long> {
    @Query("select e from HtmlEntity e where e.name=:name")
    HtmlEntity getByName(@Param("name")String name);
}
