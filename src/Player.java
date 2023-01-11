public class Player {
    String name;  //имя ирока
    int point;   //очки игрока



    Ship[] shipList;  //массив кораблей/ у игрока есть конкретные корабли

    PlayingField playingField;



    public Player(String name) {
        this.name = name;
    }

    public Player(int point) {
        this.point = point;
    }

    public Player(String name, int point) {
        this.name = name;
        this.point = point;
        shipList = new Ship[PlayingField.countShips()];  //иннициализация массива кораблей с определенным размером
    }

    public void shot(int x, int y){  //координаты выстрела
        System.out.println("Игрок " + name + " решил ударить по ячейке " +x + " / "  + y);
    };

    public void playerPoint(){
        this.point = point +1;

    }

    public void setPlayingField(PlayingField playingField) {
        this.playingField = playingField;
    }
}
