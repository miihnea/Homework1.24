public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Robot robot = new Robot(computer);
        robot.on();
        robot.off();
        robot.boot();
        robot.Move();
    }
}