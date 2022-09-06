package homework3;

public interface UserInterface {
    void sendMessage(String receiverNick, String text);
    void showPersonalMessages();
    void deletePersonalMessage(long id);
    void editPersonalMessage(long id, String text);
}
