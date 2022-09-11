package homework3;

public class Moderator extends People implements ModeratorInterface{

    protected Moderator(String nickName) {
        super(nickName);
    }

    @Override
    public void deleteMessage(long id) {
        if (DataBase.findPeopleById(DataBase.findMessageById(id).getAuthorId()).getClass() == Admin.class) {
            System.out.println("Error: You can't delete this message!");
            return;
        }
        DataBase.delMessageById(id);
    }

    @Override
    public void editMessage(long id, String text) {
        if (DataBase.findMessageById(id) != null) {
            if (DataBase.findPeopleById(DataBase.findMessageById(id).getAuthorId()).getClass() == Admin.class) {
                System.out.println("Error: You can't edit this message!");
                return;
            }
            DataBase.findMessageById(id).setText(text);
        } else {
            System.out.printf("Message with ID %s not found%n", id);
        }
    }
}
