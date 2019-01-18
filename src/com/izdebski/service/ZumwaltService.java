package com.izdebski.service;

import org.springframework.stereotype.Service;

@Service
public class ZumwaltService {

    public String welcomeMessage(){
        return "Zumwalt Destroyer";
    }

    public Object welcomeAgainMessage() {
        return "The Second Version of Zumwalt Destroyer";
    }
}
