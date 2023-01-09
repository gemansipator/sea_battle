public class PlayingField {  //Игровое поле

    int[][] playingField = new int[10][10];  //Игровое поле

    int x;  //координата по х
    int y;
    Player player;   // игрок



    static int [] rulesOfTheGame = {4,3,2,1};   //правила игры

    //методы



    //конструктор класса

    public PlayingField(Player player) {
        this.player = player;
    }
}
