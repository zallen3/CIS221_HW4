/* 
Zachery Allen
CIS221 
T & Th 2:10pm 
*/

class MyGames {
    //Array of possible platforms
    protected String[] platforms = {"PC", "Xbox", "PS5"};
    //Prints out good games message
    public void gamesAreGood() {
        System.out.println("This game is so good!");
    }

}

public class VideoGames extends MyGames {

    static String games = "Elden Ring";

    public static void main(String[] args) {
        //Object of MyGames, using VideoGames
        VideoGames thisGame = new VideoGames();
        //The object can call the method to print the message
        thisGame.gamesAreGood();
        //Uses the games name and selects the platform Im on from the array in MyGames
        System.out.println(games + " for " + thisGame.platforms[0]);
    }
}
