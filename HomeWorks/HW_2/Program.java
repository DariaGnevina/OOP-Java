package HW_2;

import java.util.Scanner;

public class Program {
    
        public static Scanner sc = new Scanner(System.in);
        public static void main(String[] args) {
            int addFeed;
            Cat[] arrCat = new Cat[4];
            arrCat[0] = new Cat("Барсик", 5, false);
            arrCat[1] = new Cat("ВасЁк", 70, false);
            arrCat[2] = new Cat("Том", 12, false);
            arrCat[3] = new Cat("Сухарик", 45, false);

            Plate plate = new Plate(70);
            plate.info();
            for (int i = 0; i < arrCat.length; i++) {
                if (arrCat[i].getState()== false && arrCat[i].getAppetite() < plate.getFood()){
                    arrCat[i].eat(plate);
                    arrCat[i].setState(true);
                    System.out.println("Котик " + arrCat[i].name + " Кот поел!");
                } else {
                    System.out.println("Котик " + arrCat[i].name + " Кот не поел!");
                }
            }
            plate.info();
            System.out.println("Сколько добавить корма в миску?");
            addFeed = sc.nextInt();
            plate.addFood(addFeed);
            plate.info();
    
        }
    }