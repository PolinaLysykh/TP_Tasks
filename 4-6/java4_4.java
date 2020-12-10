public class java4_4 {
    public static String overTime(double b, double e, double c, double dp) {
        String dolar = "$";
        double s = 0;
        if (e > 17) {
            s = e - 17;
            s = (e - b - s) * c + (s * 30 * dp);
        } 
        else {
            s = (e - b) * c;
        }
        return dolar + String.format("%.2f", s);
    }

    public static void main(String[] args) {
        System.out.println(overTime(13.25, 15, 30, 1.5));
    }
}