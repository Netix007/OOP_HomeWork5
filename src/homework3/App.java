package homework3;

public class App {
    public static void main(String[] args) {

        Admin superAdmin = new Admin("Boss");
        DataBase.addUserLink(new UserLink(superAdmin));

        Moderator superModer = new Moderator("Moderator");
        DataBase.addUserLink(new UserLink(superModer));

        User superUser = new User("Worker");
        DataBase.addUserLink(new UserLink(superUser));

        superAdmin.addAdmin("Vasiliy1");
        superAdmin.addAdmin("Vasiliy2");

        superAdmin.sendMessage("Vasiliy1", "test");
        superUser.sendMessage("Boss", "OK");
        superModer.sendMessage("Vasiliy1", "Hi!");

        superModer.editMessage(0L, "");
        superAdmin.showAllMessages();
        superAdmin.showPersonalMessages();



    }
}
