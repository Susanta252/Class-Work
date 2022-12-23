abstract class User {
    abstract void registerAccount();
    abstract void requestBook();
}

class KidUser extends User {
    void registerAccount() {
        System.out.println("Kids' section");
    }
    void requestBook() {
        System.out.println("Kids' book");
    }
}

class AdultUser extends User {
    void registerAccount() {
        System.out.println("Adult section");
    }
    void requestBook() {
        System.out.println("Fiction book");
    }
}

public class LibraryUser {
    public static void main(String[] args) {
        KidUser kid = new KidUser();
        kid.registerAccount();
        kid.requestBook();
        AdultUser adult = new AdultUser();
        adult.registerAccount();
        adult.requestBook();
    }
}