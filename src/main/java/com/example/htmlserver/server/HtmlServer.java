package com.example.htmlserver.server;

import com.example.htmlserver.repository.htmlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.htmlserver.entity.HtmlEntity;

@Service
//מחלקה האחראית לחיבור בין ה-CONTROLLET ובין הריפוסיטורי שמדבר עם ה-DB פה נעשה הלוגיקה
public class HtmlServer {
    @Autowired
    private htmlRepository repository; //אובייקט מוכל של- htmlRepository שמחבר אותנו אליו.

    /*
    מקבלת: שם הדף.
    מבצעת: מבקשת מה- Repository את דף ה-HTML הספציפי על פי השם שלו.
    מחזירה: את דף ה-HTML.
    */
    public String getPageByName(String name){
        HtmlEntity entity= repository.getByName(name);
        String html=entity.getTheHtml();
        return html;
    }
}
