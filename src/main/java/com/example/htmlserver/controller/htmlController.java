package com.example.htmlserver.controller;

import com.example.htmlserver.server.htmlServer;
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
        html=html.replace("localhost",IPServersMusic);
        html=html.replace("?",Long.toString(userVo.getId()));
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
    @PostMapping("/addPlayList")
    public String addPlayList(@RequestBody PlayListVO playListVO){
        String html=server.getPageByName("addPlayList");
        html=html.replace("@",Long.toString(playListVO.getUserId()));
        html=html.replace("localhost",IPServersMusic);
        return html;
    }
    @PostMapping("/addSongsToPlayList")
    public String addSongsToPlayList(@RequestBody PlayListVO playListVO){
        String html=server.getPageByName("addSongToPlayList");
        html=html.replace("?",Long.toString(playListVO.getId()));
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
    @PostMapping("/authenticator")
    public String getAuthenticator(@RequestBody LoginVo loginVo){
        String html=server.getPageByName("authenticator");
        html=html.replace("?",Long.toString(loginVo.getId()));
        html=html.replace("@",Long.toString(loginVo.getUserId()));
        html=html.replace("localhost",IPServersMusic);
        return html;
    }
    @PostMapping("/PlaySongPage")
    public String getPlaySongPage(@RequestBody SongsVO songsVO){
        String html=server.getPageByName("playSong");
        html=html.replace("?",Long.toString(songsVO.getId()));
        html=html.replace("localhost",IPServersMusic);
        return html;
    }
    @PostMapping("/PlayPlayList")
    public String getPlayPlayListPage(@RequestBody PlayListVO playListVO){
        String html=server.getPageByName("playPlayList");
        html=html.replace("?",Long.toString(playListVO.getId()));
        html=html.replace("localhost",IPServersMusic);
        return html;
    }
    @PostMapping("/PlayAlbum")
    public String PlayAlbum(@RequestBody AlbumsVO albumsVO){
        String html=server.getPageByName("playAlbum");
        html=html.replace("?",Long.toString(albumsVO.getId()));
        html=html.replace("localhost",IPServersMusic);
        return html;
    }
    @PostMapping("/displaySongInAlbum")
    public String displaySongInAlbum(@RequestBody AlbumsVO albumsVO){
        String html=server.getPageByName("displaySongInAlbum");
        html=html.replace("?",Long.toString(albumsVO.getId()));
        html=html.replace("localhost",IPServersMusic);
        return html;
    }
}
