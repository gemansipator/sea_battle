public class PlayingField {  //Игровое поле

    int[][] playingField = new int[10][10];  //Игровое поле


    Player player;   // игрок

//    public PlayingField(Player player) {
//        this.player = player;
//    }
//
//    public PlayingField(int[][] playingField) {
//        this.playingField = playingField;
//    }

    static int [] rulesOfTheGame = {4,3,2,1};   //правила игры



    //методы


    public void put(PlayingField playingField){// поставить корабль


    }
    public void past(PlayingField playingField){// мимо, промах

    }
    public void hit(PlayingField playingField){ // попадание

    }
    public void killed(PlayingField playingField){ // убил

    }



    //конструктор класса

    public PlayingField(int[][] playingField) {
        this.playingField = playingField;
    }
}
