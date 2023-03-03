import java.util.ArrayList;
import java.util.List;

public class Main {
    /*
    Создать иерархию родительский и дочернии классы для Транспорта
    Например Транспорт - > Автомобиль - > Автобус
    Транспорт - > Автомобиль - > Легковой
    Используем наследование, инкапсуляцию
     */


    public static void main(String[] args) {

        Bus bus1 = new Bus("Mersedes-Bens", 2012, "Germany", 100, 20, 40);
        Bus bus2 = new Bus("Volvo", 2010, "Sweden", 120, 25, 45);
        Truck truck = new Truck("Iveco", 2017, "Italy", 150, 40);
        List<Transport> transportList = new ArrayList<>();
        transportList.add(bus1);
        transportList.add(bus2);
        transportList.add(truck);

        for (Transport transport: transportList) {
            System.out.println(transport);

        }
    }
}