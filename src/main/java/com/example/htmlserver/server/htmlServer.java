package com.example.htmlserver.server;

import com.example.htmlserver.repository.htmlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.htmlserver.entity.htmlEntity;

@Service
public class htmlServer {
    @Autowired
    private htmlRepository repository;
    public String getPageByName(String name){
        htmlEntity entity= repository.getByName(name);
        String html=entity.getTheHtml();
        return html;
    }
}
