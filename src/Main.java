import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Use the following mapping table to specify a cell using numbers from 1 to 9:");
        printTableMapping();
        if (new Random().nextBoolean()) {
            makeComputerMowe();
            printGameTable();
        }
        while (true) {
            makeUserMowe();
            printGameTable();
            if (isUserWin()) {
                System.out.println("YOU WIN");
                break;
            }
            if (isDraw()) {
                System.out.println("SORRY DRAW");
                break;
            }
            makeComputerMowe();
            printGameTable();
            if (isComputerWon()) {
                System.out.println("COMPUTER WIN");
                break;
            }
            if (isDraw()) {
                System.out.println("SORRY DRAW");
                break;
            }

        }
        System.out.println("GAME OVER");
    }

    private static boolean isComputerWon() {
        return false;
    }

    private static void printTableMapping() {
        System.out.println( "-------------");
        System.out.println("| 7 | 8 | 9 |");
        System.out.println( "-------------");
        System.out.println("| 4 | 5 | 6 |");
        System.out.println( "-------------");
        System.out.println("| 1 | 2 | 3 |");
        System.out.println( "-------------");

    }

    private static void makeComputerMowe() {
    }

    private static boolean isDraw() {
        return false;
    }

    private static boolean isUserWin() {
        return false;
    }

    private static void printGameTable() {
    }

    private static void makeUserMowe() {
    }


}