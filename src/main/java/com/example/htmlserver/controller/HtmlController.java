package com.example.htmlserver.controller;

import com.example.htmlserver.server.HtmlServer;
import com.example.htmlserver.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Controller
@Validated
@RestController
@RequestMapping("World")
@CrossOrigin(origins = "*")
public class HtmlController {
    private String IPServersLogin="127.0.0.1";
    private String IPServersMusic="127.0.0.1";
    @Autowired
    private HtmlServer server;
    @GetMapping("/firstPage")
    public String getFirstPage(){
        String html=server.getPageByName("firstPage");
        html=html.replace("localhost",IPServersLogin);
        return html;
    }
    @GetMapping("/con")
    public String getConPage(){
        String html=server.getPageByName("conPage");
        html=html.replace("localhost",IPServersLogin);
        return html;
    }
    @GetMapping("/cre")
    public String getCrePage(){
        String html=server.getPageByName("createPage");
        html=html.replace("localhost",IPServersLogin);
        return html;
    }
    @GetMapping("/getSearchPage")
    public String getSearchPage(){
        String html=server.getPageByName("searchPage");
        html=html.replace("localhost",IPServersLogin);
//        html=html.replace("?",Long.toString(userVo.getId()));
        return html;
    }
    @GetMapping("/getPlayListUser")
    public String getPlayListUser(){
        String html=server.getPageByName("showPlayList");
        html=html.replace("localhost",IPServersMusic);
//        html=html.replace("?",Long.toString(userVo.getId()));
        return html;
    }
    @GetMapping("/HomePage")
    public String getHomePage(){
        String html=server.getPageByName("HomePage");
        html=html.replace("localhost",IPServersMusic);
        //html=html.replace("?",Long.toString(userVo.getId()));
        return html;
    }
    @GetMapping("/displaySongInPlayList")
    public String getDisplaySongInPlayListPage(){
        String html=server.getPageByName("displaySongInPlayList");
        html=html.replace("localhost",IPServersMusic);
        //html=html.replace("?",Long.toString(playListVO.getId()));
        //html=html.replace("@",Long.toString(playListVO.getUserId()));
        return html;
    }
    @GetMapping("/addAlbum")
    public String getAddAlbumPage(){
        String html=server.getPageByName("addAlbum");
        html=html.replace("localhost",IPServersMusic);
        //html=html.replace("?",Long.toString(userVo.getId()));
        return html;
    }
    @GetMapping("/showUserSongs")
    public String getShowUserSongsPage(){
        String html=server.getPageByName("showUserSongs");
        //html=html.replace("?",Long.toString(userVo.getId()));
        html=html.replace("localhost",IPServersMusic);
        return html;
    }
    @GetMapping("/addPlayList")
    public String getAddPlayListPage(){
        String html=server.getPageByName("addPlayList");
        //html=html.replace("@",Long.toString(playListVO.getUserId()));
        html=html.replace("localhost",IPServersMusic);
        return html;
    }
    @GetMapping("/addSongsToPlayList")
    public String getAddSongsToPlayListPage(){
        String html=server.getPageByName("addSongToPlayList");
        //html=html.replace("?",Long.toString(playListVO.getId()));
        //html=html.replace("@",Long.toString(playListVO.getUserId()));
        html=html.replace("localhost",IPServersMusic);
        return html;
    }
    @GetMapping("/authenticator")
    public String getAuthenticatorPage(){
        String html=server.getPageByName("authenticator");
        //html=html.replace("?",Long.toString(loginVo.getId()));
        //html=html.replace("@",Long.toString(loginVo.getUserId()));
        html=html.replace("localhost",IPServersMusic);
        return html;
    }
    @GetMapping("/PlaySongPage")
    public String getPlaySongPage(){
        String html=server.getPageByName("playSong");
        //html=html.replace("?",Long.toString(songsVO.getId()));
        html=html.replace("localhost",IPServersMusic);
        return html;
    }
    @GetMapping("/PlayPlayList")
    public String getPlayPlayListPage(){
        String html=server.getPageByName("playPlayList");
        //html=html.replace("?",Long.toString(playListVO.getId()));
        html=html.replace("localhost",IPServersMusic);
        return html;
    }
    @GetMapping("/PlayAlbum")
    public String getPlayAlbumPage(){
        String html=server.getPageByName("playAlbum");
        //html=html.replace("?",Long.toString(albumsVO.getId()));
        html=html.replace("localhost",IPServersMusic);
        return html;
    }
    @GetMapping("/displaySongInAlbum")
    public String getDisplaySongInAlbumPage(){
        String html=server.getPageByName("displaySongInAlbum");
        //html=html.replace("?",Long.toString(albumsVO.getId()));
        html=html.replace("localhost",IPServersMusic);
        return html;
    }
}
