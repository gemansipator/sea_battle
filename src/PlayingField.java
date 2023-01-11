public class PlayingField {  //Игровое поле
    int[][] playingField = new int[10][10];  //Игровое поле
    Player player;   // игрок
    static int [] rulesOfTheGame = {4,3,2,1};   //правила игры
    static int countShips(){      //подсчет количества кораблей
        int result = 0;

        for (int i = 0; i < rulesOfTheGame.length; i++) {
            result += rulesOfTheGame[i];
        }
        return result;
    }
    void put(int x,int y){// поставить корабль
        playingField[x][y] = 1;
    }
    void past(int x,int y){// мимо, промах
        playingField[x][y] = 2;
    }
    void hit(int x,int y){ // попадание
        playingField[x][y] = 3;
    }
    void killed(int x,int y){ // убил
        playingField[x][y] = 4;
    }
    //конструктор класса

    public PlayingField(Player player) {
        this.player = player;
    }

    static void status(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                //System.out.println(playingField[i][j]+ " ");  //проблема
            }
            System.out.println();
        }
        
    }

}
