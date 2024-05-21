package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {

    @GetMapping()
    @ResponseBody
    public String languages() {
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("form")
    @ResponseBody
    public String nameAndLangRankForm() {
        return "<html>" +
                "<body>" +
                "<p>Name:</p>" +
                "<form method='post'>" +
                "<input type='text' name='name' palceholder='Enter your name here'><br><br>" +
                "<label for='firstchoice'>My Favorite Language:</label><br>" +
                "<select name=firstchoice id=firstchoice'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "<br>" +
                "<label for='secondchoice'>My Second Favorite Language:</label>" +
                "<br>" +
                "<select name='secondchoice' id='secondchoice'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "<br>" +
                "<label for='thirdchoice'>My Third Favorite Language:</label>" +
                "<br>" +
                "<select name='thirdchoice' id='thirdchoice'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "<br><br>" +
                "<input type='submit' value='Submit'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @PostMapping("form")
    @ResponseBody
    public String displayResponse(String name, String firstchoice, String secondchoice, String thirdchoice) {
        return "<h1>" + name + "</h1>" +
                "<ol>" +
                    "<li>" + firstchoice + "</li>" +
                    "<li>" + secondchoice + "</li>" +
                    "<li>" + thirdchoice + "</li>" +
                "</ol>";
    }
}
