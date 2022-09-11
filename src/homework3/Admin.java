package homework3;

public class Admin extends People implements Administration, ModeratorInterface{

    public Admin(String nickName) {
        super(nickName);
    }

    @Override
    public void addModerator(String name) {
        DataBase.addUserLink(new UserLink(new Moderator(name)));
    }

    @Override
    public void addAdmin(String name) {
        DataBase.addUserLink(new UserLink(new Admin(name)));
    }

    @Override
    public void addUser(String name) {
        DataBase.addUserLink(new UserLink(new User(name)));
    }

    @Override
    public void delUserById(Long id) {
        DataBase.delUserById(id);
    }

    @Override
    public void deleteMessage(long id) {
        DataBase.delMessageById(id);
    }

    @Override
    public void editMessage(long id, String text) {
        if (DataBase.findMessageById(id) != null) {
            DataBase.findMessageById(id).setText(text);
        } else {
            System.out.printf("Message with ID %s not found%n", id);
        }
    }
}
