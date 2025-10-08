public class Race {
    public static String leader = "Car";
    public static int distanceLeader = 0;
    public static boolean flag = false;

    public static void race (Car car) {
        int loserDistance = car.speed * 24;

        if (loserDistance > distanceLeader) {
            leader = car.name;
            distanceLeader = loserDistance;
        } else if (distanceLeader == loserDistance) {
            flag = true;
        }

    }

    public static String Resuilt() {
        if (flag) {
            return "Ничья!";
        } else {
            return "Победитель: " + leader;
        }
    }

}
