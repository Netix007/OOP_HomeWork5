package homework3;

import java.util.List;

public class App {
    public static void main(String[] args) {

        Admin superAdmin = new Admin("Boss");
        DataBase.addUserLink(new UserLink(superAdmin));

        User superModer = new User("Moderator");
        DataBase.addUserLink(new UserLink(superModer));

        User superUser = new User("Worker");
        DataBase.addUserLink(new UserLink(superUser));

        superAdmin.addAdmin("Vasiliy1");
        superAdmin.addAdmin("Vasiliy2");

        superAdmin.sendMessage("Vasiliy1", "test");
        superUser.sendMessage("Boss", "OK");
        superModer.sendMessage("Vasiliy1", "Hi!");

        superAdmin.showAllMessages();
        superAdmin.showPersonalMessages();

    }
}
