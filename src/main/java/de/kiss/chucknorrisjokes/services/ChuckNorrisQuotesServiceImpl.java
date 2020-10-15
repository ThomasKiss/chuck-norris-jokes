package de.kiss.chucknorrisjokes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisQuotesServiceImpl implements ChuckNorrisQuoteService {
    @Override
    public String getRandomQuote() {
        return new ChuckNorrisQuotes().getRandomQuote();
    }
}
