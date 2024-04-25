import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Use the following mapping table to specify a cell using numbers from 1 to 9:");
        printTableMapping();
        char [][] gameTable = {{' ', ' ', ' '},{' ', ' ', ' '},{' ', ' ', ' '}};
        if (new Random().nextBoolean()) {
            makeComputerMowe(gameTable);
            printGameTable(gameTable);
        }
        while (true) {
            makeUserMowe(gameTable);
            printGameTable(gameTable);
            if (isUserWin(gameTable)) {
                System.out.println("YOU WIN");
                break;
            }
            if (isDraw(gameTable)) {
                System.out.println("SORRY DRAW");
                break;
            }
            makeComputerMowe(gameTable);
            printGameTable(gameTable);
            if (isComputerWon(gameTable)) {
                System.out.println("COMPUTER WIN");
                break;
            }
            if (isDraw(gameTable)) {
                System.out.println("SORRY DRAW");
                break;
            }

        }
        System.out.println("GAME OVER");
    }

    private static boolean isComputerWon(char [][] gameTable) {
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

    private static void makeComputerMowe(char [][] gameTable) {

    }

    private static boolean isDraw(char [][] gameTable) {
        return false;
    }

    private static boolean isUserWin(char [][] gameTable) {
        return false;
    }

    private static void printGameTable(char [][] gameTable) {
        System.out.println( "-------------");
        System.out.println("|" + " " + gameTable[2][0]  + " " +"|"+ " " +gameTable[2][1]+ " " +"|"+ " " +gameTable[2][2]+ " " +"|");
        System.out.println( "-------------");
        System.out.println("|" + " " + gameTable[1][0]  + " " +"|"+ " " +gameTable[1][1]+ " " +"|"+ " " +gameTable[1][2]+ " " +"|");
        System.out.println( "-------------");
        System.out.println("|" + " " + gameTable[0][0]  + " " +"|"+ " " +gameTable[0][1]+ " " +"|"+ " " +gameTable[0][2]+ " " +"|");
        System.out.println( "-------------");
    }

    private static void makeUserMowe(char [][] gameTable) {
    }


}