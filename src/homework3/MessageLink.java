package homework3;

public class MessageLink {
    private static long messageId;
    public Message message;
    public long id;

    public MessageLink(Message message) {
        this.message = message;
        this.id = messageId;
        messageId++;
    }

    public Message getMessage() {
        return message;
    }

    public long getId() {
        return id;
    }
}
