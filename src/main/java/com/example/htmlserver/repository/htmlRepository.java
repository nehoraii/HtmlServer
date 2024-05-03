package com.example.htmlserver.repository;

import com.example.htmlserver.entity.HtmlEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
//ממשק האחריא לדבר עם ה-DB המתאים
public interface htmlRepository extends JpaRepository<HtmlEntity,Long> {
    /*
     מקבלת: שם הדף.
    מבצעת: מבקשת מהמסד נתונים את דף ה-HTML הספציפי על פי השם שלו.
    מחזירה: אובייקט Entity  של דף ה-.HTML
*/
    @Query("select e from HtmlEntity e where e.name=:name")
    HtmlEntity getByName(@Param("name")String name);
}
