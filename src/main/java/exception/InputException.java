package exception;

public class InputException {

    static final int TWO_MEMBER = 2;
    static final int EIGHT_MEMBER = 8;

    static public boolean nameSplitException(String names) {
        if (names.split(",").length < TWO_MEMBER || names.split(",").length > EIGHT_MEMBER) {
            System.out.println("2~8명의 유저를 입력해주세요.");
            return true;
        }
        return false;
    }

    static public boolean priceStringException(String price) {
        try {
            Integer.parseInt(price);
        } catch (Exception e) {
            System.out.println("숫자를 입력해주세요!");
            return true;
        }
        return false;
    }

    static public boolean bettingMoneycheck(int price) {
        if (price <= 0) {
            System.out.println("1원이상으로 배팅해주세요.");
            return true;
        }
        return false;
    }


}
