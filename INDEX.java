public class Main {
    public static void main(String[] args) {
        UserManagementSystem ums = new UserManagementSystem();

        ums.addUser(new User("Іван", "Петренко", 30, 1));
        ums.addUser(new User("Олена", "Шевченко", 25, 2));
        ums.addUser(new User("Марія", "Ковальчук", 35, 3));
        ums.addUser(new User("Андрій", "Мельник", 20, 4));

        System.out.println("Всі користувачі:");
        ums.displayAllUsers();

        System.out.println("\nВидалення користувача з ID 2:");
        ums.removeUserById(2);
        ums.displayAllUsers();

        System.out.println("\nПошук користувача з ID 3:");
        User user = ums.findUserById(3);
        if (user != null) {
            System.out.println(user);
        } else {
            System.out.println("Користувача не знайдено.");
        }

        System.out.println("\nНайстарший користувач:");
        System.out.println(ums.findOldestUser());

        System.out.println("\nНаймолодший користувач:");
        System.out.println(ums.findYoungestUser());

        System.out.println("\nРедагування користувача з ID 1:");
        ums.editUser(1, "Іванко", "Петренко", 31);
        ums.displayAllUsers();
    }
}
