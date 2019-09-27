package co.syalar.jokes.app.controllers;

import co.syalar.jokes.app.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jd.rodriguez
 */
@Controller
public class JokesController {

    private JokeService jokeService;

    @Autowired
    public JokesController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping(path = {"/",""})
    public String joke(Model model) {
        model.addAttribute("joke", jokeService.getJoke());
        return "chucknorris";
    }
}
