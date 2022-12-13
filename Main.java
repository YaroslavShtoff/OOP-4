import transport.Bus;
import transport.Car;


import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {



        Car lada = new Car("Lada",
                "Grande",
                "желтый",
                0,
                2015,
                "Россия",
                1.7,
                null,
                0,
                null,
                null,
                true,
                "бензин",
                46);
        lada.carID();

        Car audi = new Car("Audi",
                "A8 50 L TDI quattro",
                "черный",
                0,
                2020,
                "Германия",
                3.0,
                null,
                0,
                null,
                null,
                true,
                "дизель",
                72);
        audi.carID();
        Car bmw = new Car("BMW ",
                "Z8",
                "черный",
                0,
                2021,
                "Германия",
                3.0,
                null,
                0,
                null,
                null,
                true,
                "бензин",
                98);

        bmw.carID();

        Car kia = new Car("Kia",
                "Sportage 4 поколение",
                "красный",
                0,
                2018,
                "Южная Корея",
                2.4,
                null,
                0,
                null,
                null,
                true,
                "бензин",
                88);
        kia.carID();

        Car hyndai = new Car("Hyundai",
                "Avante",
                "оранжевый",
                0 ,
                2016,
                "Южная Корея",
                0,
                null,
                0,
                null,
                null,
                true,
                "бензин",
                15);
        hyndai.carID();


       /* Train lastochka = new Train(
                "Ласточка",
                "В-901",
                null,
                2011,
                "Россия",
                305,
                3500,
                11,
                "Белоруский вокзал",
                "Минск-Пасажирский",
                11,
                "дизель",
                11);

        Train leningrad = new Train(
                "Ленинград",
                "D-125",
                null,
                2019,
                "Россия",
                270,
                1700,
                5,
                "Ленингралский вокзал",
                "Ленинград - Пассажирский",
                8,
                "дизель",
                61);


        System.out.println(lastochka);
        System.out.println(leningrad);*/


        Bus volgograd = new Bus("Вольво",
                "Ф-115",
                "красный",
                2002,
                "Швеция",
                188,
                "дизель",
                800,
                8,
                "Волгоград-1",
                "автовокзал Элиста",
                100);

        Bus rostov = new Bus("Паз",
                "Т11",
                "желтый",
                2022,
                "Россия",
                100,
                "бензин",
                400,
                4,
                "Ростовский автовокзал",
                "Шахты",
                23);

        Bus krasnodar = new Bus("Ниссан",
                "екх",
                "синий",
                2015,
                "Япония",
                240,
                "дизель",
                680,
                6,
                "АС Краснодар",
                "автовокзал Сочи",
                65);
        System.out.println(volgograd);
        System.out.println(rostov);
        System.out.println(krasnodar);



    }


}



