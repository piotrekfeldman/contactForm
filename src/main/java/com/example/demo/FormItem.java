package com.example.demo;

public class FormItem {

    private String senderName;
    private String senderMail;
    private String senderInputContent;

    public FormItem(String senderName, String senderMail, String senderInputContent) {
        this.senderName = senderName;
        this.senderMail = senderMail;
        this.senderInputContent = senderInputContent;
    }

    public FormItem() {
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getSenderMail() {
        return senderMail;
    }

    public void setSenderMail(String senderMail) {
        this.senderMail = senderMail;
    }

    public String getSenderInputContent() {
        return senderInputContent;
    }

    public void setSenderInputContent(String senderInputContent) {
        this.senderInputContent = senderInputContent;
    }
}
