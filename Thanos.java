import java.util.*;

public class Thanos {

    public static void main(String[] args) {

        ArrayList<Hero> heroes = new ArrayList<>(); // TODO 1 : Create an empty heroes list
        Hero blackWidow = new Hero("Black Widow", 34); // name: Black Widow, age: 34
        Hero captainAmerica = new Hero("Captain America", 100); // name: Captain America, age: 100
        Hero vision = new Hero("Vision", 3); // name: Vision, age: 3
        Hero ironMan = new Hero("Iron Man", 48); // name: Iron Man, age: 48
        Hero scarletWitch = new Hero("Scarlet Witch", 29); // name: Scarlet Witch, age: 29
        Hero thor = new Hero("Thor", 1500); // name: Thor, age: 1500
        Hero hulk = new Hero("Hulk", 49); // name: Hulk, age: 49
        Hero doctorStrange = new Hero("Doctor Strange", 42); // name: Doctor Strange, age: 42

        // TODO 2 : Add those heroes to the list
        heroes.add(blackWidow); // index 0
        heroes.add(captainAmerica); // index 1
        heroes.add(vision); // index 2
        heroes.add(ironMan); // index 3
        heroes.add(scarletWitch); // index 4
        heroes.add(thor); // index 5
        heroes.add(hulk); // index 6
        heroes.add(doctorStrange); // index 7

        thor.setAge(1501); // TODO 3 : It's Thor birthday, now he's 1501

        Collections.shuffle(heroes); // TODO 4 : Shuffle the heroes list

        // TODO 5 : Keep only the half of the list
        heroes.subList(0, 4).clear();

        // TODO 6 : Loop throught the list and display the name of the remaining heroes
        for (Hero loop : heroes) {
            System.out.println(loop.getName());
        }
    }
}
