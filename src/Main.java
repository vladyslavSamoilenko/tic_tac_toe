import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Use the following mapping table to specify a cell using numbers from 1 to 9:");
        printTableMapping();
        char[][] gameTable = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
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

    private static boolean isComputerWon(char[][] gameTable) {
        for (int i = 0; i < 3; i++) {
            if (gameTable[i][0] == gameTable[i][1] && gameTable[i][0] == gameTable[i][2] && gameTable[i][0] == 'O') {
                return true;
            }
        }
        for (int i = 0; i < 3; i++) {
            if (gameTable[0][i] == gameTable[1][i] && gameTable[0][i] == gameTable[2][i] && gameTable[0][i] == 'O') {
                return true;
            }
        }
        if (gameTable[0][0] == gameTable[1][1] && gameTable[0][0] == gameTable[2][2] && gameTable[0][0] == 'O') {
            return true;
        }
        if (gameTable[2][0] == gameTable[1][1] && gameTable[2][0] == gameTable[0][2] && gameTable[2][0] == 'O') {
            return true;
        }
        return false;
    }

    private static void printTableMapping() {
        char[][] gameTapping = {{'7', '8', '9'},
                {'4', '5', '6'},
                {'1', '2', '3'}};
        printGameTable(gameTapping);

    }

    private static void makeComputerMowe(char[][] gameTable) {
        Random random = new Random();
        while (true) {
            int row = random.nextInt(3);
            int col = random.nextInt(3);
            if (gameTable[row][col] == ' ') {
                gameTable[row][col] = 'O';
                return;
            }
        }

    }


    private static boolean isDraw(char[][] gameTable) {
        return false;
    }

    private static boolean isUserWin(char[][] gameTable) {
        for (int i = 0; i < 3; i++) {
            if (gameTable[i][0] == gameTable[i][1] && gameTable[i][0] == gameTable[i][2] && gameTable[i][0] == 'X') {
                return true;
            }
        }
        for (int i = 0; i < 3; i++) {
            if (gameTable[0][i] == gameTable[1][i] && gameTable[0][i] == gameTable[2][i] && gameTable[0][i] == 'X') {
                return true;
            }
        }
        if (gameTable[0][0] == gameTable[1][1] && gameTable[0][0] == gameTable[2][2] && gameTable[0][0] == 'X') {
            return true;
        }
        if (gameTable[2][0] == gameTable[1][1] && gameTable[2][0] == gameTable[0][2] && gameTable[2][0] == 'X') {
            return true;
        }
        return false;
    }

    private static void printGameTable(char[][] gameTable) {
        for (int i = 0; i < 3; i++) {
            System.out.println("-------------");
            for (int j = 0; j < 3; j++) {
                System.out.print("|" + " " + gameTable[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("-------------");
    }

    private static void makeUserMowe(char[][] gameTable) {
        while (true) {
        System.out.println("Please type number between 1 and 9:");
        String number = new Scanner(System.in).nextLine();
            if (number.length() == 1) {
                char ch = number.charAt(0);
                if (Character.isDigit(ch)) {
                    if (ch >= '1' && ch <= '9') {
                        char[][] mappingTable = {{'7', '8', '9'},
                                {'4', '5', '6'},
                                {'1', '2', '3'}};
                        boolean flag = true;
                        for (int i = 0; i < mappingTable.length; i++) {
                            for (int j = 0; j < mappingTable[i].length; j++) {
                                if (mappingTable[i][j] == ch) {
                                    if (gameTable[i][j] == ' ') {
                                        gameTable[i][j] = 'X';
                                        return;
                                    } else {
                                        System.out.println("Can't make a move, because the cell is not free! Try again!");
                                        flag = false;
                                        break;
                                    }
                                }
                            }
                            if (!flag) {
                                break;
                            }
                        }
                    }
                }
            }
        }
    }
}