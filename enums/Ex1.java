package enums;

enum Direction { EAST, WEST, SOUTH, NORTH }

public class Ex1 {
    public static void main(String[] args) {
        Direction d1 = Direction.EAST;
        Direction d2 = Direction.valueOf("WEST");
        Direction d3 = Enum.valueOf(Direction.class, "EAST");

        System.out.println(d1);                 // EAST
        System.out.println(d2);                 // WEST
        System.out.println(d3);                 // EAST
        
        System.out.println(d1 == d2);           // false
        System.out.println(d1 == d3);           // true
        System.out.println(d1.equals(d3));      // true
        // System.out.println(d1 < d2);         // error
        System.out.println(d1.compareTo(d2));   // -1
        System.out.println(d1.compareTo(d3));   // 0
        
        switch(d1) {
            case EAST:
                System.out.println("The direction is EAST"); break;
            case WEST:
                System.out.println("The direction is WEST"); break;
            case SOUTH:
                System.out.println("The direction is SOUTH"); break;
            case NORTH:
                System.out.println("The direction is NORTH"); break;
            default:
                System.out.println("Invalid direction"); break;
        }

        Direction[] dArr = Direction.values();
        
        for ( Direction d : dArr )
            System.out.printf("%s : %d%n", d.name(), d.ordinal());
    }
}