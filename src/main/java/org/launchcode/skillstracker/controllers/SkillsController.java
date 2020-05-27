package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {

    @GetMapping
    @ResponseBody
    public String hello() {
        String html =
                "<html>" +
                        "<body>" +
                        "<h1>Skills Tracker</h1>" +
                        "<h2>We have a few skills we would like to learn. Here is the list.<h2>" +
                        "<ol><li>Java</li><li> JavaScript</li><li>Python</li>" +
                        "</body>" +
                        "</html>";
        return html;
    }
    @GetMapping("hello")
    @ResponseBody
    public String helloResponse(@RequestParam String name, String languages, String languages1, String languages2) {
        return "<html"+
                "<h1>" + name + "</h2>" +
                "<ol>"+
                "<li>" + languages + "</li>" +
                "<li>" + languages1 + "</li>" +
                "<li>" + languages2 + "</li>";
    }
    @GetMapping("form")
    @ResponseBody
    public String form() {
        String html =
                "<html>" +
                        "<body>" +
                        "<form method = 'get' action = '/hello'>" +
                        "<div><label for = 'name'>Name: </label></div>" +
                        "<input type = 'text' name = 'name' />" +
                        "<div><label for = 'languages'>My favorite language: </label></div>" +
                        "<div><select name = 'languages' id = 'languages'>" +
                        "<option value = 'java'>Java</option>" +
                        "<option value = 'javascript'>JavaScript</option>" +
                        "<option value = 'python'>Python</option></select></div>" +
                        "<div><label for = 'languages1'>My second favorite language: </label></div>" +
                        "<div><select name = 'languages1' id = 'languages1'>" +
                        "<option value = 'java'>Java</option>" +
                        "<option value = 'javascript'>JavaScript</option>" +
                        "<option value = 'python'>Python</option></select></div>" +
                        "<div><label for = 'languages2'>My third favorite language: </label></div>" +
                        "<div><select name = 'languages2' id = 'languages2'>" +
                        "<option value = 'java'>Java</option>" +
                        "<option value = 'javascript'>JavaScript</option>" +
                        "<option value = 'python'>Python</option></select></div>" +
                        "<input type = 'submit' value = 'Submit' />" +
                        "</form>" +
                        "</body>" +
                        "</html>";
        return html;
    }

}
