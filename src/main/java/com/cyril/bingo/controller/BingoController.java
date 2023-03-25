package com.cyril.bingo.controller;

import com.cyril.bingo.service.BingoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BingoController {

    @Autowired
    BingoService bingoService;

    @GetMapping("/bingoPlay")
    public String createBingo(Model model){
        model.addAttribute("bingoService", bingoService);
        return "bingoPlay";
    }

    @PostMapping("/bingoPlay")
    public String processBingo(@ModelAttribute BingoService bingoService, Model model){
        bingoService.showBingoView();
        model.addAttribute("bingoService", bingoService);
        return "bingoPlay";
    }
}
