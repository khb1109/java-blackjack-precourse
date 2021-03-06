package domain.user;

import domain.card.Card;

import java.util.ArrayList;
import java.util.List;

/**
 * 게임 참여자를 의미하는 객체
 */
public class Player extends People{
    private final String name;
    private final double bettingMoney;

    public Player(String name, double bettingMoney) {
        this.name = name;
        this.bettingMoney = bettingMoney;
    }

    // TODO 추가 기능 구현
    public String getName() {
        return this.name;
    }

    public double getBettingMoney() {
        return bettingMoney;
    }

    public double blackJackBonus(){
        if(this.isBlackJack())
            return bettingMoney * 0.5;
        return 0;
    }
}
