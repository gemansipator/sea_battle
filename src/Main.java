public class Main {
    public static void main(String[] args) {
        Player player = new Player("Николай");  //Ввод имени
        System.out.println(player.name);  //вывод введенного  имени в консоль

        System.out.println("Начальное количество очков игрока: " + player.points);

        player.shot(4,5); //выстрел

        player.playerPoint();  //выведет единицу
        System.out.println("Количество очков игрока: " + player.points);
        player.playerPoint();  //выведет двойку
        System.out.println("Количество очков игрока: " + player.points);
        player.playerPoint();  //выведет тройку
        System.out.println("Количество очков игрока: " + player.points);

        System.out.println("\n"+"\n"+"\n");


        Ship torpedoBoat = new Ship();


        Ship size = new Ship();
        System.out.println("Размер корабля " + size.size);


//        ship.setShipName("Победа"); //Ввод имени корабля
//        System.out.println("Имя корабля: " + ship.getShipName());  //Вывод имени корабля в консоль
//
//        ship.setShipSize(3);  //Вводим размер корабля
//        System.out.println("размер корабля: " + ship.getShipSize());

    }
}