package com.example.controller;

import com.example.model.CanditateModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class WebController {
    @Autowired
    private CanditateModel canditateModel;

    @GetMapping("/candidate/list")
    public String getListDish(Model model, @RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "5") int limit) {
        model.addAttribute("pagination", canditateModel.findAll(PageRequest.of(page - 1, limit)));
        model.addAttribute("page", page);
        model.addAttribute("limit", limit);
        return "list";
    }
}
