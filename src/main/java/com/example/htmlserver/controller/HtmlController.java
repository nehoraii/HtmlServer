package com.example.htmlserver.controller;

import com.example.htmlserver.server.HtmlServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Controller
@Validated
@RestController
@RequestMapping("World")
@CrossOrigin(origins = "*")
//קלאס שאחראי לנתב את הבקשות שבאות מהקליינטים ומפנה אותם לפי כתובת URL לםונקציה הנכונה
public class HtmlController {
    private String IPServersLogin="127.0.0.1"; //שדה המכיל את כתובת ה-IP של השרת LOGIN
    private String IPServersMusic="127.0.0.1"; //שדה המכיל את כתובת ה-IP של שרת המוזיקה
    @Autowired
    private HtmlServer server; //אובייקט הכלה של הקלאס HtmlServer
    /*מקבלת: כלום.
    מבצעת: מבקשת מ- HtmlServer את הדף הראשון ומחליפה לכתובות ה-IP הרצויות.
    מחזירה: את דף ה-HTML העדכני.
    */
    @GetMapping("/firstPage")
    public String getFirstPage(){
        String html=server.getPageByName("firstPage");
        html=html.replace("localhost",IPServersLogin);
        return html;
    }
    /*מקבלת: כלום.
    מבצעת: מבקשת מ- HtmlServer את דף החיבור ומחליפה לכתובות ה-IP הרצויות.
    מחזירה: את דף ה-HTML העדכני.
    */
    @GetMapping("/con")
    public String getConPage(){
        String html=server.getPageByName("conPage");
        html=html.replace("localhost",IPServersLogin);
        return html;
    }

    /*
    * מקבלת: כלום.
    מבצעת: מבקשת מ- HtmlServer את דף יצרת משתמש ומחליפה לכתובות ה-IP הרצויות.
    מחזירה: את דף ה-HTML העדכני.
    */
    @GetMapping("/cre")
    public String getCrePage(){
        String html=server.getPageByName("createPage");
        html=html.replace("localhost",IPServersLogin);
        return html;
    }

    /*
       מקבלת: כלום.
       מבצעת: מבקשת מ- HtmlServer את דף החיפוש ומחליפה לכתובות ה-IP הרצויות.
       מחזירה: את דף ה-HTML העדכני.
       **/
    @GetMapping("/getSearchPage")
    public String getSearchPage(){
        String html=server.getPageByName("searchPage");
        html=html.replace("localhost",IPServersLogin);
//        html=html.replace("?",Long.toString(userVo.getId()));
        return html;
    }
    /*מקבלת: כלום.
    מבצעת: מבקשת מ- HtmlServer את הדף שמציג את הפלייליסטים של המשתמש ומחליפה לכתובות ה-IP הרצויות.
    מחזירה: את דף ה-HTML העדכני.
    */

    @GetMapping("/getPlayListUser")
    public String getPlayListUser(){
        String html=server.getPageByName("showPlayList");
        html=html.replace("localhost",IPServersMusic);
//        html=html.replace("?",Long.toString(userVo.getId()));
        return html;
    }

    /*מקבלת: כלום.
     מבצעת: מבקשת מ- HtmlServer את דף הבית ומחליפה לכתובות ה-IP הרצויות.
     מחזירה: את דף ה-HTML העדכני.
    */
    @GetMapping("/HomePage")
    public String getHomePage(){
        String html=server.getPageByName("HomePage");
        html=html.replace("localhost",IPServersMusic);
        //html=html.replace("?",Long.toString(userVo.getId()));
        return html;
    }

    /*מקבלת: כלום.
    מבצעת: מבקשת מ- HtmlServer את דף הצגת שירים בפלייליסט ומחליפה לכתובות ה-IP הרצויות.
    מחזירה: את דף ה-HTML העדכני.
    */
    @GetMapping("/displaySongInPlayList")
    public String getDisplaySongInPlayListPage(){
        String html=server.getPageByName("displaySongInPlayList");
        html=html.replace("localhost",IPServersMusic);
        //html=html.replace("?",Long.toString(playListVO.getId()));
        //html=html.replace("@",Long.toString(playListVO.getUserId()));
        return html;
    }
    /*
    * מקבלת: כלום.
    מבצעת: מבקשת מ- HtmlServer את דף הוספת אלבום למערכת ומחליפה לכתובות ה-IP הרצויות.
    מחזירה: את דף ה-HTML העדכני.
    */

    @GetMapping("/addAlbum")
    public String getAddAlbumPage(){
        String html=server.getPageByName("addAlbum");
        html=html.replace("localhost",IPServersMusic);
        //html=html.replace("?",Long.toString(userVo.getId()));
        return html;
    }

    /*
    * מקבלת: כלום.
    מבצעת: מבקשת מ- HtmlServer את דף הצגת השירים של המשתמש ומחליפה לכתובות ה-IP הרצויות.
    מחזירה: את דף ה-HTML העדכני.
    */
    @GetMapping("/showUserSongs")
    public String getShowUserSongsPage(){
        String html=server.getPageByName("showUserSongs");
        //html=html.replace("?",Long.toString(userVo.getId()));
        html=html.replace("localhost",IPServersMusic);
        return html;
    }

    /*
    * מקבלת: כלום.
    מבצעת: מבקשת מ- HtmlServer את הדף הוספת פלייליסט ומחליפה לכתובות ה-IP הרצויות.
    מחזירה: את דף ה-HTML העדכני.
    */
    @GetMapping("/addPlayList")
    public String getAddPlayListPage(){
        String html=server.getPageByName("addPlayList");
        //html=html.replace("@",Long.toString(playListVO.getUserId()));
        html=html.replace("localhost",IPServersMusic);
        return html;
    }

    /*
    * מקבלת: כלום.
    מבצעת: מבקשת מ- HtmlServer את הדף הוספת שירים לפלייליסט ומחליפה לכתובות ה-IP הרצויות.
    מחזירה: את דף ה-HTML העדכני.
    */
    @GetMapping("/addSongsToPlayList")
    public String getAddSongsToPlayListPage(){
        String html=server.getPageByName("addSongToPlayList");
        //html=html.replace("?",Long.toString(playListVO.getId()));
        //html=html.replace("@",Long.toString(playListVO.getUserId()));
        html=html.replace("localhost",IPServersMusic);
        return html;
    }

    /*
    * מקבלת: כלום.
    מבצעת: מבקשת מ- HtmlServer את הדף ה- Authenticator ומחליפה לכתובות ה-IP הרצויות.
    מחזירה: את דף ה-HTML העדכני.
    */
    @GetMapping("/authenticator")
    public String getAuthenticatorPage(){
        String html=server.getPageByName("authenticator");
        //html=html.replace("?",Long.toString(loginVo.getId()));
        //html=html.replace("@",Long.toString(loginVo.getUserId()));
        html=html.replace("localhost",IPServersMusic);
        return html;
    }

    /*מקבלת: כלום.
    מבצעת: מבקשת מ- HtmlServer את הדף לניגון שיר ומחליפה לכתובות ה-IP הרצויות.
    מחזירה: את דף ה-HTML העדכני.
    */
    @GetMapping("/PlaySongPage")
    public String getPlaySongPage(){
        String html=server.getPageByName("playSong");
        //html=html.replace("?",Long.toString(songsVO.getId()));
        html=html.replace("localhost",IPServersMusic);
        return html;
    }

    /*
    * מקבלת: כלום.
    מבצעת: מבקשת מ- HtmlServer את הדף ניגון פלייליסט ומחליפה לכתובות ה-IP הרצויות.
    מחזירה: את דף ה-HTML העדכני.
    */
    @GetMapping("/PlayPlayList")
    public String getPlayPlayListPage(){
        String html=server.getPageByName("playPlayList");
        //html=html.replace("?",Long.toString(playListVO.getId()));
        html=html.replace("localhost",IPServersMusic);
        return html;
    }
    /*
    * מקבלת: כלום.
    מבצעת: מבקשת מ- HtmlServer את הדף ניגון אלבום ומחליפה לכתובות ה-IP הרצויות.
    מחזירה: את דף ה-HTML העדכני.
    */

    @GetMapping("/PlayAlbum")
    public String getPlayAlbumPage(){
        String html=server.getPageByName("playAlbum");
        //html=html.replace("?",Long.toString(albumsVO.getId()));
        html=html.replace("localhost",IPServersMusic);
        return html;
    }

    /*מקבלת: כלום.
    מבצעת: מבקשת מ- HtmlServer את הדף הצגת שירים באלבום ומחליפה לכתובות ה-IP הרצויות.
    מחזירה: את דף ה-HTML העדכני.
    */
    @GetMapping("/displaySongInAlbum")
    public String getDisplaySongInAlbumPage(){
        String html=server.getPageByName("displaySongInAlbum");
        //html=html.replace("?",Long.toString(albumsVO.getId()));
        html=html.replace("localhost",IPServersMusic);
        return html;
    }
}
