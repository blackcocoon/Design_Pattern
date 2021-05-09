package singleton.case1;

public class BasicSingleTonClientWithMultiThread {

    public static void main(String[] args) {

        System.out.println("""
                If you see the same value, then singleton was reused (yay!)
                If you see different values, then 2 singletons were created (booo!!)
                RESULT:"""
        );

        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());

        threadFoo.start();
        threadBar.start();
    }

    static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            BasicSingleton singleton = BasicSingleton.getInstance("FOO");
            System.out.println(singleton.getValue());
        }
    }

    static class ThreadBar implements Runnable {
        @Override
        public void run() {
            BasicSingleton singleton = BasicSingleton.getInstance("BAR");
            System.out.println(singleton.getValue());
        }
    }
}
