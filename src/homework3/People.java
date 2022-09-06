package homework3;

import java.util.Calendar;

public abstract class People implements UserInterface {
    private final String nickName;

    private final Calendar registrationDate;

    public People(String nickName) {
        this.nickName = nickName;
        this.registrationDate = Calendar.getInstance();
    }

    public String getNickName() {
        return nickName;
    }

    public Calendar getRegistrationDate() {
        return registrationDate;
    }
    @Override
    public void sendMessage(String receiverNick, String text) {
        DataBase.addMessageLink(new MessageLink(new Message(text,
                DataBase.findUserId(this.nickName),
                DataBase.findUserId(receiverNick))));
    }

    @Override
    public void showPersonalMessages() {
        for (MessageLink el: DataBase.getMessageData()
             ) {
            if (DataBase.findPeopleById(el.getMessage().getAuthorId()).getNickName().equals(this.nickName)) {
                System.out.println(String.format("(ID %s) %s TO: %s MESSAGE %s",
                        el.getId(),
                        el.getMessage().getMessageDate().getTime(),
                        DataBase.findPeopleById(el.getMessage().getReceiverId()).nickName,
                        el.getMessage().getText()));
            } else if (DataBase.findPeopleById(el.getMessage().getReceiverId()).getNickName().equals(this.nickName)) {
                System.out.println(String.format("(ID %s) %s FROM: %s MESSAGE %s",
                        el.getId(),
                        el.getMessage().getMessageDate().getTime(),
                        DataBase.findPeopleById(el.getMessage().getAuthorId()).nickName,
                        el.getMessage().getText()));
            }
        }
    }

    @Override
    public void deletePersonalMessage(long id){
        if (DataBase.findMessageById(id).getAuthorId() == DataBase.findUserId(this.nickName)) {
            DataBase.delMessageById(id);
        } else {
            System.out.println("You cant delete this message!");
        }
    }

    @Override
    public void editPersonalMessage(long id, String text) {
        if (DataBase.findMessageById(id).getAuthorId() == DataBase.findUserId(this.nickName)) {
            DataBase.findMessageById(id).setText(text);
        } else {
            System.out.println("You cant edit this message!");
        }

    }

    @Override
    public String toString() {
        return "People{" +
                "nickName='" + nickName + '\'' +
                ", registrationDate=" + registrationDate.getTime() +
                '}';
    }
}
