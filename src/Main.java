public class Main {
    public static void main(String[] args) {
        Player playerName = new Player("Николай");  //Ввод имени
        System.out.println(playerName.playerName);  //вывод введенного  имени в консоль
        Player playerPoint = new Player(0);
        System.out.println("Начальное количество очков игрока: " + playerPoint);

        playerName.shot(4,5); //выстрел

        playerName.playerPoint();  //выведет единицу
        System.out.println("Количество очков игрока: " + playerName.playerPoints);
        playerName.playerPoint();  //выведет двойку
        System.out.println("Количество очков игрока: " + playerName.playerPoints);
        playerName.playerPoint();  //выведет тройку
        System.out.println("Количество очков игрока: " + playerName.playerPoints);

        System.out.println("\n"+"\n"+"\n");


        Ship shipName = new Ship("Победа");
        System.out.println("Имя корабля " + shipName.getShipName());

        Ship shipSize = new Ship(1);
        System.out.println("Размер корабля " + shipSize.shipSize);


//        ship.setShipName("Победа"); //Ввод имени корабля
//        System.out.println("Имя корабля: " + ship.getShipName());  //Вывод имени корабля в консоль
//
//        ship.setShipSize(3);  //Вводим размер корабля
//        System.out.println("размер корабля: " + ship.getShipSize());

    }
}