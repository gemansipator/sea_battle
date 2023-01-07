public class Player {
    String name;  //имя ирока
    int playerPoints;   //очки игрока



    public Player(String name) {
        this.name = name;
    }

    public Player(int playerPoints) {
        this.playerPoints = playerPoints;
    }

    public String shot(int x, int y){  //координаты выстрела
        System.out.println("Игрок " + name + " решил ударить по ячейке " +x + " / "  + y);
        return null;
    };

    public void playerPoint(){
        this.playerPoints = playerPoints +1;

    }
}
