package org.example.codingTasks;

interface AnimalBehavior {
    void eat();

    void sleep();

    void makeSounds();
}

    abstract class Animal implements AnimalBehavior{
        String name;
        int age;

        public Animal(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public void sleep(){
            System.out.println(name+" is sleeping");
        }
        abstract void displayInformation();
    }

    class Mammal extends Animal{
        public Mammal(String name, int age) {
            super(name, age);
        }
        public void eat(){
            System.out.println(name+" is eating");
        }
        public void makeSounds(){
            System.out.println(name+" makes mammal sound");
        }
        void displayInformation(){
            System.out.println("Mammal: "+name+" age: "+age);
        }
    }

    class Bird extends Animal{
        public Bird(String name, int age) {
            super(name, age);
        }

        @Override
        public void eat() {
            System.out.println(name+" is eating too");
        }

        @Override
        public void makeSounds() {
            System.out.println(name+" makes bird sound");
        }

        @Override
        void displayInformation() {
            System.out.println("Bird: "+name+" age: "+age);
        }
    }

    class Lion extends Mammal{
        public Lion(String name, int age) {
            super(name, age);
        }
        @Override
        public void eat() {
            System.out.println(name+" is eating a lot");
        }

        @Override
        public void makeSounds() {
            System.out.println("RRRRRRRRRRR");
        }

        @Override
        void displayInformation() {
            System.out.println("Lion: "+name+" age: "+age);
        }
    }

class Elephant extends Mammal {
    public Elephant(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating yami-yami");
    }

    @Override
    public void makeSounds() {
        System.out.println("UUUUUUUUU");
    }

    @Override
    void displayInformation() {
        System.out.println("Elephant: " + name + " age: " + age);
    }
}

class Parrot extends Bird{
    public Parrot(String name, int age) {
        super(name, age);
    }
    public void eat() {
        System.out.println(name + " is eating umm-umm");
    }

    @Override
    public void makeSounds() {
        System.out.println("car-car");
    }

    @Override
    void displayInformation() {
        System.out.println("Parrot: " + name + " age: " + age);
    }
}

class Eagle extends Bird{
    public Eagle(String name, int age) {
        super(name, age);
    }
    public void eat() {
        System.out.println(name + " is eating mouse");
    }

    @Override
    public void makeSounds() {
        System.out.println("wrap-wrap");
    }

    @Override
    void displayInformation() {
        System.out.println("Eagle: " + name + " age: " + age);
    }
}

class ZooTester{
    public static void main(String[] args) {


        Animal[] animals= new Animal[]{new Lion("Simba",7), new Elephant("Jumbo", 3),new Parrot("Kiesha", 5),new Eagle("Simon", 9)};
        for (Animal an: animals){
            an.displayInformation();
            an.eat();
            an.sleep();
            an.makeSounds();

        }
    }
}
