package Task4;

import Task2.Cat;
import Task2.Competitors;
import Task2.Human;
import Task2.Robot;
import Task3.Obstacle;
import Task3.Track;
import Task3.Wall;

public class Main {
    public static void main(String[] args) {
        Competitors[] competitors = {
                new Human("Ivan"),
                new Cat("Barsik"),
                new Robot("L2000")
        };
        Obstacle[] obstacles = {
                new Track(100),
                new Wall(3)
        };
        for (Competitors c : competitors) {
            for (Obstacle o : obstacles) {
                o.doIt(c);
                if (!c.isOnDistance()) {
                    break;
                }
            }
        }
        for (Competitors c : competitors) {
            c.info();
        }
    }
}
