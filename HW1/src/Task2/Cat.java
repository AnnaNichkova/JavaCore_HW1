package Task2;

public class Cat implements Competitors{
    private String name;

    private int maxRunLength;
    private int maxJumpHeight;

    private boolean onDistance;

    public Cat(String name) {
        this.name = name;
        this.maxRunLength = maxRunLength;
        this.maxJumpHeight = maxJumpHeight;
        this.onDistance = true;
    }

    @Override
    public void run(int length) {
        if (length <= maxRunLength) {
            System.out.println(name + "Успешно побегал на беговой дорожке");
        } else {
            System.out.println(name + "Не справился с беговой дорожкой");
                    onDistance = false;
        }
    }

    @Override
    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println(name + "Успешно позанималась на беговой дорожке.");
        } else {
            System.out.println (name + "Не смог перепрыгнуть");
            onDistance = false;
        }
        }

    @Override
    public boolean isOnDistance() {
        return onDistance;
    }

    @Override
    public void info() {
        System.out.println(name + " " + (onDistance ? "на дистанции": " выбыл из соревнования"));
    }
}
