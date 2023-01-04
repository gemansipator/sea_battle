public class Player {
    String playerName;  //имя ирока
    int playerPoints;   //очки игрока



    public Player(String playerName) {
        this.playerName = playerName;
    }

    public String shot(int x, int y){  //координаты выстрела
        System.out.println("Игрок " + playerName + " решил ударить по ячейке " +x + " / "  + y);
        return null;
    };

    public void player_point(){
        this.playerPoints = playerPoints +1;

    }
}
