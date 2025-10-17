public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1.4: Время");
        Time t1 = new Time(10);
        Time t2 = new Time(10000);
        Time t3 = new Time(100000);
        System.out.println("10 секунд -> " + t1);
        System.out.println("10000 секунд -> " + t2);
        System.out.println("100000 секунд -> " + t3);

        System.out.println("\nЗадание 1.5: Дом");
        House h1 = new House(1);
        House h5 = new House(5);
        House h23 = new House(23);
        System.out.println(h1);
        System.out.println(h5);
        System.out.println(h23);

        System.out.println("\nЗадание 2.4 и 3.4: Сотрудники и отделы");
        Department it = new Department("IT");
        Employee petrov = new Employee("Петров", it);
        Employee kozlov = new Employee("Козлов", it);
        Employee sidorov = new Employee("Сидоров", it);
        it.setManager(kozlov);
        System.out.println(petrov);
        System.out.println(kozlov);
        System.out.println(sidorov);

        System.out.println("\nСписок сотрудников отдела " + kozlov.getDepartment().getName() + ":");
        for (Employee e : kozlov.getDepartmentEmployees()) {
            System.out.println(" - " + e.getName());
        }

        System.out.println("\nЗадание 4.3: Неизменяемый дом");
        HouseImmutable hi2 = new HouseImmutable(2);
        HouseImmutable hi35 = new HouseImmutable(35);
        HouseImmutable hi91 = new HouseImmutable(91);
        System.out.println(hi2);
        System.out.println(hi35);
        System.out.println(hi91);
        System.out.println("(Попытка изменить количество этажей невозможна — поле final)");

        System.out.println("\nЗадание 5.1: Пистолет");
        Gun gun = new Gun(3);
        for (int i = 0; i < 5; i++) gun.shoot();
    }
}

