public class App {
    public static void main(String[] args) throws Exception {
        int score = 1000;
        int levelCompleted = 1;
        int bonus = 200;

        boolean gameOver = true;
        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);

        System.out.println("Your final score is " + highScore);
        //calculateScore(true,10000,8,200);
        //BEDA KASUS YA
        int score1 = 1500;
        int score2 = 900;
        int score3 = 400;
        int score4 = 50;
        
        
        int posisi = calculateHighScorePosition(score1);
        displayHighScorePosition("Tobi", posisi);

        posisi = calculateHighScorePosition(score2);
        displayHighScorePosition("As", posisi);

        posisi = calculateHighScorePosition(score3);
        displayHighScorePosition("Adit", posisi);

        posisi = calculateHighScorePosition(score4);
        displayHighScorePosition("Tya", posisi);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = 0;
        if (gameOver){
            finalScore = score +(levelCompleted*bonus);
            finalScore+=1000;
            
        }
        return finalScore; 
    }

    public static void displayHighScorePosition(String nama, int posisi) {
        System.out.println(nama + " berada di posisi ke "+ posisi);
    }

    public static int calculateHighScorePosition (int score){
        int posisi = -1;
        if (score>=1000){
            posisi =1;
        }
        //500 sampai 999
        else if(score>=500){
            posisi =2;
        }
        //100 sampai 499
        else if(score>=100){
            posisi =3;
        }
        else{
            posisi = 4;
        }
        return posisi;
    }
}
