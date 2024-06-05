package l44_linkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Animal> animalsList = new LinkedList<>();
        int Catage = 0;
        int Dogage = 0;
        int Mouseage = 0;

        for (int i = 0; i <= 100; i++) {
            animalsList.add(new Cat(Catage++));
            animalsList.add(new Dog(Dogage++));
        }

        System.out.println(animalsList);

        int catsCount = 0;

        for (int i = 0; i < animalsList.size(); i++) {
            if (animalsList.get(i) instanceof Cat) {
                catsCount++;
                if (catsCount >= 5) {
                    animalsList.remove(i);
                    catsCount = 0;
                }
            }
        }

        System.out.println(animalsList);
        int dogsCount = 0;
        int mouseAge = 0;

        for (int i = 0; i < animalsList.size(); i++) {
            if (animalsList.get(i) instanceof Dog) {
                dogsCount++;
                if (dogsCount >= 3) {
                    animalsList.set(i, new Mouse(mouseAge++));
                    dogsCount = 0;
                }
            }
        }

        System.out.println(animalsList);

        LinkedList<Animal> catsMouseList = new LinkedList<>();

        for (int i = 0; i < animalsList.size(); i++) {
            if (animalsList.get(i) instanceof Cat && animalsList.get(i + 1) instanceof Mouse) {
                catsMouseList.add(animalsList.get(i));
                catsMouseList.add(animalsList.get(i + 1));
                i++;
                if (animalsList.get(i + 1) instanceof Cat) {
                    catsMouseList.add(animalsList.get(i + 1));
                    i++;
                }

                continue;
            }
            if (animalsList.get(i) instanceof Mouse && animalsList.get(i + 1) instanceof Cat) {
                catsMouseList.add(animalsList.get(i));
                catsMouseList.add(animalsList.get(i + 1));
                i++;
                if (animalsList.get(i + 1) instanceof Mouse) {
                    catsMouseList.add(animalsList.get(i + 1));
                    i++;
                }
            }
        }

        System.out.println(catsMouseList);
    }

}



