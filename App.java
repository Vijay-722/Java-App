public class App {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("=================================");
        System.out.println(" Java Application Started");
        System.out.println(" Deployed using Jenkins + Docker");
        System.out.println(" Running on AWS EC2");
        System.out.println("=================================");

        // Keep application running (important for Docker containers)
        while (true) {
            System.out.println(" Application is running successfully...");
            Thread.sleep(10000); // 10 seconds
        }
    }
}
