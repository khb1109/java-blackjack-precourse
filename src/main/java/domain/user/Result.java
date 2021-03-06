package domain.user;

public class Result {
    private final String name;
    private final double money;

    public Result(String name, double money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public double getMoney() {
        return money;
    }
}
