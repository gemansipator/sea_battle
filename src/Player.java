public class Player {
    String name;  //имя ирока
    int points;   //очки игрока



    public Player(String name) {
        this.name = name;
    }

    public Player(int points) {
        this.points = points;
    }

    public void shot(int x, int y){  //координаты выстрела
        System.out.println("Игрок " + name + " решил ударить по ячейке " +x + " / "  + y);
    };

    public void playerPoint(){
        this.points = points +1;

    }
}
