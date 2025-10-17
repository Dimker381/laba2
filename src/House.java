class House {
    private int floors;


    public House(int floors) {
        if (floors < 1) throw new IllegalArgumentException("Количество этажей должно быть >= 1");
        this.floors = floors;
    }


    @Override
    public String toString() {
        return "дом с " + floors + " " + floorsWord(floors);
    }


    private static String floorsWord(int n) {
        int nMod100 = n % 100;
        if (nMod100 >= 11 && nMod100 <= 14) return "этажей";
        int nMod10 = n % 10;
        if (nMod10 == 1) return "этаж";
        if (nMod10 >= 2 && nMod10 <= 4) return "этажа";
        return "этажей";
    }
}