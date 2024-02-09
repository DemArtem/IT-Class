package IT_Class.M19_OOP.Animals;

class Cat extends Animal {
    @Override //переопределение метода sound
    public void sound() {
        System.out.println("meow");
    }
}
