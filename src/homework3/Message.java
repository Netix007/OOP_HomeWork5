package homework3;

import java.util.Calendar;

public class Message {
    private String text;
    private Calendar messageDate;
    private long authorId;
    private long receiverId;

    public Message(String text, long authorId, long receiverId) {
        this.text = text;
        this.messageDate = Calendar.getInstance();
        this.authorId = authorId;
        this.receiverId = receiverId;
    }

    public String getText() {
        return text;
    }

    public Calendar getMessageDate() {
        return messageDate;
    }

    public long getAuthorId() {
        return authorId;
    }

    public long getReceiverId() {
        return receiverId;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Message{" +
                "text='" + text + '\'' +
                ", messageDate=" + messageDate.get(Calendar.DATE) +
                ", authorId=" + authorId +
                ", receiverId=" + receiverId +
                '}';
    }
}
