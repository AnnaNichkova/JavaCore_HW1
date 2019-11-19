package Task2;

public class Robot implements Competitors{
    private String name;

    private int maxRunLength;
    private int maxJumpHeight;

    private boolean onDistance2;

    public Robot(String name) {
        this.name = name;
        this.maxRunLength = maxRunLength;
        this.maxJumpHeight = maxJumpHeight;
        this.onDistance2 = true;
    }

    @Override
    public void run(int length) {
        if (length <= maxRunLength) {
            System.out.println(name + "Успешно побегал на беговой дорожке");
        } else {
            System.out.println(name + "Не справился с беговой дорожкой");
            onDistance2 = false;
        }
    }

    @Override
    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println(name + "Успешно позанималась на беговой дорожке.");
        } else {
            System.out.println (name + "Не смог перепрыгнуть");
            onDistance2 = false;
        }
    }

    @Override
    public boolean isOnDistance() {
        return onDistance2;
    }

    @Override
    public void info() {
        System.out.println(name + " " + (onDistance2 ? "на дистанции": " выбыл из соревнования"));
    }
}
