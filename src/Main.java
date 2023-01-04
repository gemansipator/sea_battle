public class Main {
    public static void main(String[] args) {
        Player player = new Player("Николай");  //Ввод имени
        System.out.println(player.playerName);  //вывод введенного  имени в консоль

        player.shot(4,5); //выстрел

        player.player_point();  //выведет единицу
        System.out.println("Количество очков игрока: " + player.playerPoints);
        player.player_point();  //выведет двойку
        System.out.println("Количество очков игрока: " + player.playerPoints);
        player.player_point();  //выведет тройку
        System.out.println("Количество очков игрока: " + player.playerPoints);

        System.out.println();
        System.out.println();
        System.out.println();

        Ship ship = new Ship();

        ship.setShipName("Победа"); //Ввод имени корабля
        System.out.println("Имя корабля: " + ship.getShipName());  //Вывод имени корабля в консоль

        ship.setShipSize(3);  //Вводим размер корабля
        System.out.println("размер корабля: " + ship.getShipSize());

    }
}