package com.example.htmlserver.vo;

import lombok.Data;

import java.util.Date;

@Data
public class SongsVO {
    private long id;
    private long userId;
    private byte[] theSong;
    private String zaner;
    private Date date;
    private String nameSong;
}
