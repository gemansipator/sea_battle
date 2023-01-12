public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Николай",0);  //Ввод имени
        Player player2 = new Player("Никита Проиградовский",0);
        //player1.name = "Новое имя";
        //System.out.println(player1.name);


        PlayingField playingField1 = new PlayingField(player1);
        PlayingField playingField2 = new PlayingField(player2);

        player1.setPlayingField(playingField1); //ИГРОКУ 1 НАЗНАЧАЕМ ПОЛЕ 1 (каждое поле имеет своего игрока
        //и каждый игрок свое поле и избежали ошибки конструктора. Потому что конструктор с игроком используется
        // только в PlayingField а к игроку оно добавляется через сеттер)
        player2.setPlayingField(playingField2); //ИГРОКУ 2 НАЗНАЧАЕМ ПОЛЕ 2


        player1.shot(4,5); //выстрел первого игрока
        player2.shot(3,4); //выстрел второго игрока

        player1.playingField.hit(3,1);
        player1.playingField.put(4,3);
        player1.playingField.past(5,3);
        player1.playingField.past(3,6);
        player1.playingField.hit(3,7);
        player1.playingField.put(3,8);
        player1.playingField.killed(3,9);
        player1.playingField.killed(0,3);
        player1.playingField.killed(5,1);
        player1.playingField.status();
        PlayingField.countShips();



        player1.playerPoint();  //выведет единицу
        System.out.println("Количество очков игрока: " + player1.point);
        player1.playerPoint();  //выведет двойку
        System.out.println("Количество очков игрока: " + player1.point);
        player1.playerPoint();  //выведет тройку
        System.out.println("Количество очков игрока: " + player1.point);

        System.out.println("\n"+"\n"+"\n");


        Ship torpedoBoat = new Ship(1, "торпедный катер",player1);
        Ship destroyer = new Ship(2, "эсминец",player1);
        Ship cruiser = new Ship(3, "крейсер",player1);
        Ship battle = new Ship(4, "линкор",player1);

        System.out.println(torpedoBoat.name);
        System.out.println(torpedoBoat.size);
        System.out.println("\n"+"\n"+"\n");



    }
}