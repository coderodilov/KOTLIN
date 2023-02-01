package str;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 56;
        int c = Math.max(a, b);
    }
}

class User implements myFun{

    @Override
    public void userLogin() {

    }

    @Override
    public void userRegister() {

    }
}
interface myFun {
    void userLogin();
    void userRegister();
}