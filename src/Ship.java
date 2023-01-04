public class Ship {   //Корабль

    String shipName;
    int shipSize;

    public Ship(String shipName) {
        this.shipName = shipName;
    }

    public Ship(int shipSize) {
        this.shipSize = shipSize;
    }

    public String getShipName() {
        return shipName;
    };


    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public int getShipSize() {
        return shipSize;
    }

    public void setShipSize(int shipSize) {
        this.shipSize = shipSize;
    }
}
