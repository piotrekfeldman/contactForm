package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@Service
public class MailService {
    private Logger logger = LoggerFactory.getLogger(MailService.class);
    private JavaMailSender mailSender;

    public MailService(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    public boolean sendMail(String customerMailAdress, String nameSender, String content) {

        String ownerMailAddress = "pfeldman87@gmail.com";

        try {
            logger.debug("Wysyłam maila do {}", ownerMailAddress);
            MimeMessage mimeMessage = mailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, "UTF-8");
            helper.setFrom("piotrtestjavastart@op.pl");
            helper.setReplyTo(customerMailAdress);
            helper.setTo(ownerMailAddress);
            helper.setText(content, true);
            helper.setSubject("Wiadomość z formularza kontaktowego od użytkownika " + nameSender);
            mailSender.send(helper.getMimeMessage());
        } catch (MessagingException e) {
            logger.error("Mail do {} nie został wysłany poprawnie", ownerMailAddress);
            e.printStackTrace();
        }
        logger.info("Mail do {} wysłany poprawnie", ownerMailAddress);
        return true;
    }
}