package scr.MorningSession.Class211.Enums;
// Directional Constants:
//Create an enum named Direction to represent cardinal directions (NORTH, SOUTH, EAST, WEST).
//Define constants for each direction within the enum.
//Implement a constructor in the enum that takes two integers, deltaX and deltaY, representing changes in x and y coordinates when moving in that direction.
//Implement methods in the enum to calculate new x and y coordinates based on the current position and direction.
//Demonstrate the usage of the Direction enum by simulating movement in different directions from a given starting position.
public enum Direction {
    NORTH(0,1), SOUTH(0,-1), EAST(1,0), WEST(-1,0);

    private final int x;
    private final int y;

     Direction(int x, int y){
        this.x=x;
         this.y=y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public int moveX(int currentX) {
        return currentX + x;
    }

    public int moveY(int currentY) {
        return currentY + y;
    }

    public static void main(String[] args) {
        int startX = 0;
        int startY = 0;

        Direction moveDirection = Direction.NORTH;
        int newX = moveDirection.moveX(startX);
        int newY = moveDirection.moveY(startY);

        System.out.println("Move " + moveDirection + " to position: (" + newX + ", " + newY + ")");

        Direction moveDirection1 = Direction.SOUTH;
        int newX1 = moveDirection.moveX(startX);
        int newY1 = moveDirection.moveY(startY);

        System.out.println("Move " + moveDirection1 + " to position: (" + newX1 + ", " + newY1 + ")");
    }
}

