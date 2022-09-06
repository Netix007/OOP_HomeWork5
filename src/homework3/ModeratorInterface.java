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

    default void deleteMessage(long id) {
        DataBase.delMessageById(id);
    }

    default void editMessage(long id, String text) {
        DataBase.findMessageById(id).setText(text);
    }
}
