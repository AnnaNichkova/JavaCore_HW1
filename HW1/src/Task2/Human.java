package Task2;

public class Human implements Competitors{
    String name;

    int maxRunLength;
    int maxJumpHeight;

    boolean active;

    public Human(String name, int maxRunLength, int maxJumpHeight) {
        this.name = name;
        this.maxRunLength = maxRunLength;
        this.maxJumpHeight = maxJumpHeight;
        this.active = true;
    }

    public Human(String name) {
        this(name, 1000, 2);
    }

    @Override
    public void run(int length) {
        if (length <= maxRunLength) {
            System.out.println(name + "Успешно пробежал на беговой дорожке");
        } else {
            System.out.println(name + "Не осилил беговую дорожку");
            active = false;
        }
    }

    @Override
    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println(name + "Успешно преодолел прыжок");
        } else {
            System.out.println(name + "Не смог прыгнуть");
            active = false;
        }
    }

    @Override
    public boolean isOnDistance() {
        return active;
    }

    @Override
    public void info() {
        System.out.println(name + " " + (active ? " на дистанции" : " выбыл из соревнований"));
    }
}
