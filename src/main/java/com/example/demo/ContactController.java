package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ContactController {

    private MailService mailService;

    public ContactController(MailService mailService) {
        this.mailService = mailService;
    }

    @PostMapping("/send")
    public String sendFilledForm(FormItem formItem, RedirectAttributes redirectAttributes) {

        boolean mailCorrectlySent = mailService.sendMail(formItem.getSenderMail(), formItem.getSenderName(), formItem.getSenderInputContent());

        if (mailCorrectlySent) {
            redirectAttributes.addFlashAttribute("mailSent", formItem);
            return "redirect:success";
        } else {
            return "redirect:failure.html";
        }
    }

    @GetMapping("/success")
    public String successPage(Model model) {

        Object mailConfirmation = model.getAttribute("mailSent");
        model.addAttribute("mail", mailConfirmation);
        return "success";
    }
}