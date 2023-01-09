public class PlayingField {  //Игровое поле

    int[][] playingField = new int[10][10];  //Игровое поле


    int x;  //координата по х
    int y;
    Player player;   // игрок
    int status;


    static int [] rulesOfTheGame = {4,3,2,1};   //правила игры

    //методы

    public void put(int x,int y){// поставить корабль

    }
    public void past(int x,int y){// мимо, промах
    }
    public void hit(int x,int y){ // попадание
    }
    public void killed(int x,int y){ // убил

    }

    //конструктор класса

    public PlayingField(Player player) {
        this.player = player;
    }
}
