package co.syalar.jokes.app.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

/**
 * Created by jd.rodriguez
 */

@Service
public class ChuckNorrisJoke implements JokeService {

    private ChuckNorrisQuotes cnq = new ChuckNorrisQuotes();

    @Override
    public String getJoke() {

        return cnq.getRandomQuote();
    }
}
