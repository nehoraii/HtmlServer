package com.example.htmlserver.controller;

import com.example.htmlserver.server.htmlServer;
import com.example.htmlserver.vo.PlayListVO;
import com.example.htmlserver.vo.SongsVO;
import com.example.htmlserver.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Controller
@Validated
@RestController
@RequestMapping("World")
@CrossOrigin(origins = "*")
public class htmlController {
    private String IPServersLogin="127.0.0.1";
    private String IPServersMusic="127.0.0.1";
    @Autowired
    private htmlServer server;
    @GetMapping("/firstPage")
    public String getFirstPage(){
        String html=server.getPageByName("firstPage");
        return html;
    }
    @GetMapping("/con")
    public String getConPage(){
        String html=server.getPageByName("conPage");
        html=html.replace("localhost",IPServersLogin);
        return html;
    }
    @GetMapping("/getSearchPage")
    public String getSearchPage(){
        String html=server.getPageByName("searchPage");
        html=html.replace("localhost",IPServersLogin);
        return html;
    }
    @GetMapping("/cre")
    public String getConPage1(){
        String html=server.getPageByName("createPage");
        html=html.replace("localhost",IPServersLogin);
        return html;
    }
    @PostMapping("/getPlayListUser")
    public String getPlayListUser(@RequestBody UserVo userVo){
        String html=server.getPageByName("showPlayList");
        html=html.replace("localhost",IPServersMusic);
        html=html.replace("?",Long.toString(userVo.getId()));
        return html;
    }
    @PostMapping("/HomePage")
    public String getHomePage(@RequestBody UserVo userVo){
        String html=server.getPageByName("HomePage");
        html=html.replace("?",Long.toString(userVo.getId()));
        html=html.replace("localhost",IPServersMusic);
        return html;
    }
    @PostMapping("/displaySongInPlayList")
    public String displaySongInPlayList(@RequestBody PlayListVO playListVO){
        String html=server.getPageByName("displaySongInPlayList");
        html=html.replace("localhost",IPServersMusic);
        html=html.replace("?",Long.toString(playListVO.getId()));
        return html;
    }
    @PostMapping("/addAlbum")
    public String addAlbum(@RequestBody UserVo userVo){
        String html=server.getPageByName("addAlbum");
        html=html.replace("localhost",IPServersMusic);
        html=html.replace("?",Long.toString(userVo.getId()));
        return html;
    }
    @PostMapping("/showUserSongs")
    public String showUserSongs(@RequestBody UserVo userVo){
        String html=server.getPageByName("showUserSongs");
        html=html.replace("?",Long.toString(userVo.getId()));
        html=html.replace("localhost",IPServersMusic);
        return html;
    }
    @PostMapping("/getCopyrightPage")
    public String getCopyrightPage(@RequestBody SongsVO songsVO){
        String html=server.getPageByName("copyrightPage");
        html=html.replace("?",Long.toString(songsVO.getId()));
        html=html.replace("localhost",IPServersMusic);
        return html;
    }
}
