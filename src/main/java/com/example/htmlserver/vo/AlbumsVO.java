package com.example.htmlserver.vo;

import lombok.Data;

@Data
public class AlbumsVO {
    private Long id;
    private long userId;
    private String nameAlbum;
    private byte[] imageAlbum;
    private long lengthAlbum;
}
