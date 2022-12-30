public class Main {
    public static void main(String[] args) {
        Player player = new Player("Николай");  //Ввод имени
        System.out.println(player.player_name);  //вывод введенного  имени в консоль

        player.shot(4,5); //выстрел

        player.player_point();  //выведет единицу
        System.out.println("Количество очков игрока: " + player.player_points );
        player.player_point();  //выведет двойку
        System.out.println("Количество очков игрока: " + player.player_points );
        player.player_point();  //выведет тройку
        System.out.println("Количество очков игрока: " + player.player_points );

        System.out.println();
        System.out.println();
        System.out.println();

        Ship ship = new Ship();

        ship.setShip_name("Победа"); //Ввод имени корабля
        System.out.println("Имя корабля: " + ship.getShip_name());  //Вывод имени корабля в консоль

        ship.setShip_size(3);  //Вводим размер корабля
        System.out.println("размер корабля: " + ship.getShip_size());

    }
}