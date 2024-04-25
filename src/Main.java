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
            break;
        }
        System.out.println("GAME OVER");
    }

    private static boolean isComputerWon(char[][] gameTable) {
        for(int i = 0; i < 3 ; i++){
            if(gameTable [i][0] == gameTable[i][1] && gameTable [i][0] == gameTable[i][2] && gameTable[i][0] == 'O'){
                return true;
            }
        }
        for(int i = 0; i < 3 ; i++){
            if(gameTable [0][i] == gameTable[1][i] && gameTable [0][i] == gameTable[2][i] && gameTable[0][i] == 'O'){
                return true;
            }
        }
         if(gameTable[0][0] == gameTable[1][1] &&  gameTable[0][0] == gameTable[2][2] && gameTable[0][0] == 'O'){
             return true;
         }
        if(gameTable[2][0] == gameTable[1][1] &&  gameTable[2][0] == gameTable[0][2] && gameTable[2][0] == 'O'){
            return true;
        }
        return false;
    }

    private static void printTableMapping() {
        char [][] gameTapping = {{'7', '8', '9'},
                                 {'4', '5', '6'},
                                 {'1', '2','3'}};
        printGameTable(gameTapping);

    }

    private static void makeComputerMowe(char[][] gameTable) {
        Random random = new Random();
        while(true){
            int row = random.nextInt(3);
            int col = random.nextInt(3);
            if (gameTable[row][col] == ' '){
                gameTable[row][col] = 'O';
            }else {
                return;
            }
        }

    }


    private static boolean isDraw(char[][] gameTable) {
        return false;
    }

    private static boolean isUserWin(char[][] gameTable) {
        return false;
    }

    private static void printGameTable(char[][] gameTable) {
        for(int i = 0; i < 3;i++){
            System.out.println("-------------");
            for( int j = 0; j < 3; j++) {
                System.out.print("|" + " " + gameTable[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("-------------");
    }

    private static void makeUserMowe(char[][] gameTable) {
        System.out.println("User make mowe!: ");
        int number = new Scanner(System.in).nextInt();
        if (number > 9 || number < 0){
            System.out.println("Wrong number");
            makeUserMowe(gameTable);
        }else {

        }
    }


}