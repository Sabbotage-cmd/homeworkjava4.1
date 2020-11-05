public class BonusMilesService {
    public static int calculate(int cost) {
        int BonusMilesStep = 20;
        return cost / BonusMilesStep;
    }
}
