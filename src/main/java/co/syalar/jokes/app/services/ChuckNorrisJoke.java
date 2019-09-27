package co.syalar.jokes.app.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jd.rodriguez
 */

@Service
public class ChuckNorrisJoke implements JokeService {

    private final ChuckNorrisQuotes cnq;

    @Autowired
    public ChuckNorrisJoke(ChuckNorrisQuotes cnq) {
        this.cnq = cnq;
    }

    @Override
    public String getJoke() {

        return cnq.getRandomQuote();
    }
}
