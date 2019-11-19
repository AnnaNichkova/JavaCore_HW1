package Task3;

import Task2.Competitors;

public class Track extends Obstacle {
    int length;

    public Track(int length){
        this.length = length;
    }

    @Override
    public void doIt(Competitors competitors) {
        competitors.run(length);
    }
}
