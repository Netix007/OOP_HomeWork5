package homework3;

public interface ModeratorInterface {
    default void showAllMessages() {
        for (MessageLink el: DataBase.getMessageData()
        ) {
            System.out.println(String.format("(ID %s) %s FROM: %s TO: %s MESSAGE %s",
                    el.getId(),
                    el.getMessage().getMessageDate().getTime(),
                    DataBase.findPeopleById(el.getMessage().getAuthorId()).getNickName(),
                    DataBase.findPeopleById(el.getMessage().getReceiverId()).getNickName(),
                    el.getMessage().getText()));
        }
    }

    void deleteMessage(long id);

    void editMessage(long id, String text);


}
