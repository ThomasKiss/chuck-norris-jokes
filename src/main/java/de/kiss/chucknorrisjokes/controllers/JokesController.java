package de.kiss.chucknorrisjokes.controllers;

import de.kiss.chucknorrisjokes.services.ChuckNorrisQuoteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private ChuckNorrisQuoteService chuckNorrisQuoteService;

    public JokesController(ChuckNorrisQuoteService chuckNorrisQuoteService) {
        this.chuckNorrisQuoteService = chuckNorrisQuoteService;
    }

    @RequestMapping("/")
    public String getRandomQuote(Model model)
    {
        model.addAttribute("joke", chuckNorrisQuoteService.getRandomQuote());
        return "chucknorris";
    }
}
