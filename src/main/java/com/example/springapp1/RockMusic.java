package com.example.springapp1;

import org.springframework.stereotype.Component;

/*
 * @author ABelogolovskiy
 */
@Component
public class RockMusic implements Music{

    @Override
    public String getSong() {
        return "Let it be";
    }
}
