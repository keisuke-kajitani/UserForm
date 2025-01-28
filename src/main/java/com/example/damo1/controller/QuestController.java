package com.example.damo1.controller;




import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.damo1.form.QuestForm;

import jakarta.validation.Valid;


@Controller
@RequestMapping("/hello-input")
public class QuestController {
@RequestMapping("")
public String index(Model model){
    model.addAttribute("questForm",new QuestForm());
    return "hello-input";
}

 @PostMapping("/hello-result")
    public String submitSurvey(@Valid @ModelAttribute QuestForm questForm, BindingResult result, Model model) {
     if (result.hasErrors()) {
        return "hello-input";  
    }
      model.addAttribute("questForm", questForm);
        return "hello-result"; 
}
}