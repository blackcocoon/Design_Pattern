package template_method.case2;

public class Facebook extends Network {

    public Facebook(String userName, String password) {
        super(userName, password);
    }

    @Override
    protected boolean logIn(String userName, String password) {

        System.out.println("\nChecking user's parameters");

        System.out.println("Name: " + this.userName);
        System.out.print("Password: ");

        for (int i = 0; i < this.password.length(); i++) {
            System.out.print("*");
        }

        simulateNetworkLatency();

        System.out.println("\n\nLogIn success on Facebook");
        return true;
    }

    @Override
    protected void logOut() {
        System.out.println("User: '" + userName + "' was logged out from Facebook");
    }

    @Override
    protected boolean sendData(byte[] data) {
        boolean messagePosted = true;

        if (messagePosted) {
            System.out.println("Message: '" + new String(data) + "' was posted on Facebook");
            return true;
        } else {
            return false;
        }
    }

    private void simulateNetworkLatency() {
        try {
            System.out.println();
            int i = 0;
            while (i < 10) {
                System.out.print(".");
                Thread.sleep(500);
                i++;
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
