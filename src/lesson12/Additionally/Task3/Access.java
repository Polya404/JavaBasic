package lesson12.Additionally.Task3;

public class Access {
    private static final String keyPro = "x987xy";
    private static final String kyeExp = "yx789x";

    boolean verificationPro(String key) {
        return key.equals(keyPro);
    }

    boolean verificationExp(String key) {
        return key.equals(kyeExp);
    }

}
