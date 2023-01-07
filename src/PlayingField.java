public class PlayingField {  //Игровое поле

    int[][] playingField = new int[10][10];  //Игровое поле

    Player player;   // игрок

    public PlayingField(Player player) {
        this.player = player;
    }

    static int [] rulesOfTheGame = {1,2,3,4};   //правила игры



}
