public class Main {
    public static void main(String[] args) {
        Car car = new Car("������", 4);
        Truck truck = new Truck("�����",  12);
        Bicycle bicycle = new Bicycle("����", 2);


        ServiceStation station = new ServiceStation();
        station.check(car);
        station.check(bicycle);
        station.check( truck);

    }
}