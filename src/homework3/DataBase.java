package homework3;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    private static final List<UserLink> usersData = new ArrayList<>();
    private static final List<MessageLink> messageData = new ArrayList<>();

    private DataBase(){
    }

    public static void addUserLink(UserLink link) {
        usersData.add(link);
    }
    public static void addMessageLink(MessageLink messLink) {
        messageData.add(messLink);
    }

    public static List<UserLink> getUsersData() {
        return  usersData;
    }

    public static List<MessageLink> getMessageData() {
        return  messageData;
    }

    public static void delUserById(Long id) {
        for (int i = 0; i < usersData.size(); i++) {
            if (usersData.get(i).getUserId() == id) {
                usersData.remove(i);
                return;
            }
        }
        System.out.println("No user with ID =" + id);
    }
    public static long findUserId(String userNick) {
        for (int i = 0; i < usersData.size(); i++) {
            if (usersData.get(i).getPeople().getNickName().equals(userNick)) {
                return usersData.get(i).getUserId();
            }
        }
        System.out.println("No user with nick " + userNick);
        return -1L;
    }

    public static People findPeopleById(long id) {
        for (UserLink el: usersData
             ) {
            if (el.getUserId() == id) {
                return el.getPeople();
            }
        }
        return null;
    }

    public static void delMessageById(Long id) {
        for (int i = 0; i < messageData.size(); i++) {
            if (messageData.get(i).getId() == id) {
                messageData.remove(i);
                return;
            }
        }
        System.out.println("No message with ID =" + id);
    }

    public static Message findMessageById(long id) {
        for (MessageLink el: messageData
        ) {
            if (el.getId() == id) {
                return el.getMessage();
            }
        }
        return null;
    }

}
