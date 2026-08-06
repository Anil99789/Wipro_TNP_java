class Apple extends Fruit {

    Apple() {
        super("Apple", "Sweet", "Medium");
    }

    @Override
    public void eat() {
        System.out.println("Fruit Name : " + name);
        System.out.println("Taste : Sweet");
    }
}