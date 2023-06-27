public class BonusMilesService {
    /**
     * За каждые 20 рублей, потраченные на билет, начисляется 1 миля. Дробные мили не начисляются.
     * @param cost цена билета
     * @return количество бонусных миль
     */
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
