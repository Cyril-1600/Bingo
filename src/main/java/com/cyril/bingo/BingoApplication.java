package com.cyril.bingo;

import com.cyril.bingo.service.BingoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BingoApplication {
    public static void main(String[] args) {
        SpringApplication.run(BingoApplication.class, args);
    }
}
