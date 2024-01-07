package Task2_1_7;

public class Robot {
    public Direction getDirection() {
    }

    public int getX() {
    }

    public int getY() {
    }

    public void turnLeft() {
    }

    public void turnRight() {
    }

    public void stepForward() {
    }
}

public enum Direction {
    UP,
    DOWN,
    LEFT,
    RIGHT
}
    public static void main(String[] args) {
        Robot robot = new Robot();
        moveRobot(robot, 3, 5);
        System.out.println("Current coordinates: (" + robot.getX() + ", " + robot.getY() + ")");
        System.out.println("Current direction: " + robot.getDirection());
    }
    public static void moveRobot(Robot robot, int toX, int toY) {
        int currentX = robot.getX();
        int currentY = robot.getY();

        if (currentX < toX) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            while (currentX < toX) {
                robot.stepForward();
                currentX++;
            }
        } else if (currentX > toX) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
            while (currentX > toX) {
                robot.stepForward();
                currentX--;
            }
        }

        if (currentY < toY) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
            while (currentY < toY) {
                robot.stepForward();
                currentY++;
            }
        } else if (currentY > toY) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }
            while (currentY > toY) {
                robot.stepForward();
                currentY--;
            }
        }
    }
}




