// Inner Classes implementation
public class ClassFirm {
    String address;
    String name;

    void firmAbles() {
        Employees employees = new Employees();
        Client client = new Client();
    }

    class Employees {
        String position;
        String name;
        String surname;
        String car;
        String address;
        boolean work = true;
        boolean talk = true;
        boolean walk = true;
        boolean acceptTheOrder = true;
    }

    class Client {
        String name;
        String surname;
        String patronymic;
        String profession;
        String hobby;
        boolean callAble = true;
        boolean writeAble = true;
        boolean talkAble = true;
    }
}
