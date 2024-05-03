package com.example.htmlserver.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "html_table",schema = "public")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
//קלאס המתאר את הטבלה ב-DB מייצג את האוייבקט המלא
public class HtmlEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "the_html")
    private String theHtml;

}
