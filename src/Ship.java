public class Ship {   //Корабль

    static String name1 = "torpedoBoat"; //«однопалубный»; торпедный катер
    static String name2 = "destroyer"; //«двухпалубный»; эсминец
    static String name3 = "cruiser";  //«трёхпалубный»; крейсер
    static String name4 = "battle"; //«четырёхпалубный»; линкор

    Player player;   // игрок   Переменная типа Player для принятия в конструктор объекта Player
    String name;
    int size;

    public Ship( int size, String name, Player player) {
        this.player = player;
        this.name = name;
        this.size = size;
    }

    public Ship(String name, Player player) {
        this.name = name;
        this.player= player;
    }

    public Ship(int shipSize, Player player) {
        this.size = shipSize;
        this.player = player;
    }

    public Ship() {

    }

    public String getName() {
        return name;
    };


    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int shipSize) {
        this.size = shipSize;
    }
}
