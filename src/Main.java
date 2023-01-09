public class Main {
    public static void main(String[] args) {
        Player player = new Player("Николай");  //Ввод имени
        System.out.println("Имя игрока: "+ player.name);  //вывод введенного  имени в консоль

        System.out.println("Начальное количество очков игрока: " + player.points);

        player.shot(4,5); //выстрел

        player.playerPoint();  //выведет единицу
        System.out.println("Количество очков игрока: " + player.points);
        player.playerPoint();  //выведет двойку
        System.out.println("Количество очков игрока: " + player.points);
        player.playerPoint();  //выведет тройку
        System.out.println("Количество очков игрока: " + player.points);

        System.out.println("\n"+"\n"+"\n");


        Ship torpedoBoat = new Ship(1, "торпедный катер",player);
        Ship destroyer = new Ship(2, "эсминец",player);
        Ship cruiser = new Ship(3, "крейсер",player);
        Ship battle = new Ship(4, "линкор",player);

        System.out.println(torpedoBoat.name);
        System.out.println(torpedoBoat.size);
        System.out.println("\n"+"\n"+"\n");



    }
}