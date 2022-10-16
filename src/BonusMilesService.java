public class BonusMilesService {

    public int calculate(int cost) {
        int bonus;
        if (cost >= 20) {
            bonus = cost / 20;
        } else {
            bonus = 0;
        }
        return bonus;
    }
}
