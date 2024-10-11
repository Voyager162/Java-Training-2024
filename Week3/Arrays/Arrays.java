public class Arrays {
    public static void main(String[] args) {
        
        String[] randomRoboticsInformation = {"Software", "Tomiko Itooka", "Up-A-Creek Robotics", "Destination: Deep Space"};

        for(int i = randomRoboticsInformation.length - 1; i >= 0; i--) {
            System.out.println(randomRoboticsInformation[i]);
        }

    }
}
