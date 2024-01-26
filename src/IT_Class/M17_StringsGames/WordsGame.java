package M17_StringsGames;
/*
Alice and Bob are playing game.
Each of them have some vocabulary with 4-letter words.
A word must be unique, four-letter, lowercased.
One letter is replaced while the other three stay in position.
 */
public class WordsGame {
    public static void main(String[] args) {
        String word = "send"; //send, flip, calm, more
        Player alice = new Player(new String[]{"plat", "rend","bear","soar","mare","pare","flap","neat","clan","pore"});
        Player bob = new Player(new String[]{"boar", "clap","farm","lend","near","peat","pure","more","plan","soap"});
        System.out.println("Word: "+word);

        int result = 0;
        int move = 1;
        while (result==0) {
            if (move==1) {
                int turn = alice.turn(word);
                if (turn != -1)
                    System.out.println(alice.getWords()[turn]);
                else {
                    System.out.println("Bob won");
                    break;
                }
                move++;
            }
            else{
                int turn = bob.turn(word);
                if (turn != -1)
                    System.out.println(bob.getWords()[turn]);
                else {
                    System.out.println("Alice won");
                    break;
                }
                move = 1;
            }
        }
    }
}

class Player{
    public String[] getWords() {
        return words;
    }

    private String[] words;
    private int[] moves;
    private int score = 0;

    public Player(String[] words) {
        this.words = words;
        moves = new int[words.length];
    }

    public int turn(String word){
        int count, result = -1;
        for (int i=0; i<words.length; i++) {
            count = 0;
            for (int j = 0; j < 4; j++)
                if (words[i].charAt(j) == word.charAt(j)) count++;
            if (count==3 && moves[i]!=1) {
                result = i;
                moves[i] = 1;
                break;
            }
        }
        return result;
    }
}