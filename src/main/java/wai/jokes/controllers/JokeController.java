package wai.jokes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import wai.jokes.services.JokeService;

@Controller
public class JokeController {

    private final JokeService jokeService;

    @Autowired //not necessary Spring do it automatically
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    //Map out the context to root url
    @RequestMapping({"/", ""})
    public String showJoke(Model model){

        model.addAttribute("joke", jokeService.getJoke());

        return "chucknorris";
    }

}
