public class Player {
    String player_name;  //имя ирока
    int player_points;   //очки игрока



    public Player(String player_name) {
        this.player_name = player_name;
    }

    public String shot(int x, int y){  //координаты выстрела
        System.out.println("Игрок " + player_name+ " решил ударить по ячейке " +x + " / "  + y);
        return null;
    };

    public void player_point(){
        this.player_points = player_points +1;

    }
}
