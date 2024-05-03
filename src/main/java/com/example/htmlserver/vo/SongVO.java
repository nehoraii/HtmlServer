package com.example.htmlserver.vo;

import lombok.Data;

//מחלקה המתארת אובייקט מסוג שיר ובו את הנתונים הרלוונטים לנו
@Data
public class SongVO {
    private long id;
    private long userId;
}
