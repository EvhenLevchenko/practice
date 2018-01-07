package module2.AbstractClassesAndInterfaces.InterfacesAndSortCompareTo;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Movable[] movables = new Movable[2];
//
//        movables[0] = new Bike();
//        movables[1] = new Human();
//
//        for (int i = 0; i < movables.length; i++) {
//            //movables[i].move();
//        }
//        new NR().movable.move();
//
//        new Movable() {
//            @Override
//            public void move() {
//                System.out.println("am");
//            }
//        }.move();//анонимный интерфейс сразу определили сразу вызвали

//        Movable[] movables = new Movable[2];
//
//        movables[0] = new Bike();
//        movables[1] = new Human(12, 125, "Ivan", "Semenov");
//
//        for (int i = 0; i < movables.length; i++) {
//            movables[i].move();
//        }
//
//        new NR().movable.move();
//
//        new Movable() {
//            @Override
//            public void move() {
//                System.out.println("Anonimous implementation!!!");
//            }
//        }.move();

        Human[] humans = new Human[3];
        humans[0] = new Human(34, 100, "Alex", "Ivanov");
        humans[1] = new Human(13, 1250, "Givi", "Zardzhaveli");
        humans[2] = new Human(76, 12, "Tanya", "Petrova");

        for (Human human : humans) {
            System.out.println(human);
        }
        System.out.println();

        Arrays.sort(humans);
        for (Human human : humans) {
            System.out.println(human);
        }
    }
}
