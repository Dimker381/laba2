class Gun {
    private int bullets;


    public Gun() { this.bullets = 5; }


    public Gun(int bullets) {
        if (bullets < 0) bullets = 0;
        this.bullets = bullets;
    }


    public void shoot() {
        if (bullets > 0) {
            System.out.println("Бах!");
            bullets--;
        } else {
            System.out.println("Клац!");
        }
    }


    @Override
    public String toString() {
        return "Пистолет {патроны=" + bullets + '}';
    }
}