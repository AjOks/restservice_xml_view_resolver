package mypkg;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement
public class Message {
    private int messageId;
    private String message;
    private Date created;
    private String author;

    public Message(){super();}

    public Message(int messageId, String message, String author){
        this.messageId = messageId;
        this.message = message;
        this.created = new Date();    //automatically assigns current date
        this.author = author;
    }

    public int getMessageId() {
        return messageId;
    }

    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
