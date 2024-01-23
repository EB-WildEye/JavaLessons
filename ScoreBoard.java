package CoreIdeas.Static;
/*  *** WE HAVA A PROBLEM HOUSTON ! ***
 * this program creates a ScoreBoard object and then prints the score of the game.
 * but the program doesn't run and we don't have a way to get the score.
 * 
 *  -> we need you to fix this <-
 * 
 * complete the missing code in the ScoreBoard class.
 * you can use the files from last lesson to help you.
 * The lines are divided by difficulty level, challenge yourself .
 * Good luck!
*/

  
public class ScoreBoard {
    private static int player1 = 0;
    private static int player2 = 0;
    private static int player3 = 0;
    private static int player4 = 0;
    
    
    public ScoreBoard(){
        // Defaulte constractor
    }

// Getters & Setters for the private variables
 
    public static int getPlayer1() {
        return player1;
    }
    public static void setPlayer1(){
        player1++;
    }

    public static int getPlayer2(){
        return player2;
    }
    public static void setPlayer2(){
        player2++;
    }
   
    public static int getPlayer3(){
        return player3;
    }

    public static void setPlayer3(){
        player3++;
    }

    public static int getPlayer4(){
        return player4;
    }
    public static void setPlayer4(){
        player4++;
    }
  
   
   // Hint --> use the tamplate for functions from last lesson
    
        // this function will update the score of the player with the given number of player, this function without a return value
    public static void updateScore(int numOfPlayer){    
        if(numOfPlayer == 1) 
            setPlayer1();
        else if(numOfPlayer == 2)
            setPlayer2();
        else if(numOfPlayer == 3) 
            setPlayer3();
        else 
            setPlayer4();
    }

     
    public static void showScore() {
        // The function print the score  to the console 
        System.out.println("Player 1: " + getPlayer1());
        System.out.println("Player 2: " + getPlayer2());
        System.out.println("Player 3: " + getPlayer3());
        System.out.println("Player 4: " + getPlayer4());
    }

    public static void main(String[] args) {

        ScoreBoard.updateScore(2);
        System.out.println(ScoreBoard.getPlayer2());

        for(int i =0; i<4; i++){
            ScoreBoard.setPlayer3();;
        }
        
        showScore();

    }
}