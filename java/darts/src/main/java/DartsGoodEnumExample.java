class DartsGoodEnumExample {

    // Coordinates of centre
    int X = 0, Y = 0;
    // Radius of circle
    int R = 10;
    // Coordinates of the given point
    double PX = 0;
    double PY = 0;

    //public enum Circle {
    //    1, 5, 10
    //}
    //public enum Circle {
    //    1, 5, 10, WEBNESDAY, THRUSDAY, FRIDAY, SATURDAY
    //}
    //private enum Circle {
    //    ONE(1), FIVE(5), TEN(10);
    //    //rest of the code
    //}
    private enum Circle  {
        ONE(1), FIVE(5), TEN(10);
        private final int value;

        private Circle(int value) {
            this.value = value;
        }
    }


    DartsGoodEnumExample(double x, double y) {
        PX = x;
        PY = y;
    }

    int scoreOrig() {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        return 66;
    }

    int score() {

        int ans = 0;
        int first_match = 0;
        for(Circle circle : Circle.values()) {
            System.out.println("Circle is :" + circle.name());
            //System.out.println("Circle is :" + circle.value);

            //int ans = getQuadrant(X, Y, R, PX, PY);
            ans = getQuadrant(X, Y, circle.value, PX, PY);
            if (ans >= 0) {
                first_match = circle.value;
                System.out.println("\t" + ans + " Quadrant");
                System.out.println("\t" + first_match + " first_match");
                break;
            }

            if (ans == -1)
                System.out.println("\tLies Outside the circle");
            /*
            else if (ans == 0)
                System.out.println("\tCoincides with centre");
            else
                System.out.println("\t" + ans + " Quadrant");
             */

        }

        switch (first_match) {
            //case Circle.ONE.ordinal():
            case 1:
                ans = 10;
                break;
            case 5:
                ans = 5;
                break;
            case 10:
                ans = 1;
                break;
            default:
                ans = 0;
        }
        return ans;

    }

    // Thus function returns
    // the quadrant number
    static int getQuadrant(int X, int Y,
                           int R, double PX,
                           double PY)
    {

        // Coincides with center
        if (PX == X && PY == Y)
            return 0;

        int val = (int)Math.pow((PX - X), 2) +
                (int)Math.pow((PY - Y), 2);

        System.out.format("GJS: val           \t%d\n", val );
        System.out.format("GJS: Math.pow(R, 2)\t%f\n", Math.pow(R, 2) );

        // Outside circle
        //if (val > Math.pow(R, 2))
        if (val > Math.round( Math.pow(R, 2)) ) {
            System.out.format("\tGJS:\t\tOutside circle\n" );

            return -1;
        }

        // 1st quadrant
        if (PX > X && PY >= Y)
            return 1;

        // 2nd quadrant
        if (PX <= X && PY > Y)
            return 2;

        // 3rd quadrant
        if (PX < X && PY <= Y)
            return 3;

        // 4th quadrant
        if (PX >= X && PY < Y)
            return 4;
        return 0;
    }

}

