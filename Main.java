public class Main {
    public static void main(String[] args) {
        // Step # 1
        int a[] = new int[(22 - 2) / 2 + 1];
        int idx = -1;
        for (int i = 22; i > 1; i -= 2) {
            idx += 1;
            a[idx] = i;
        }
        // Step # 2
        double x[] = new double[10];
        for (int i = 0; i < 10; i++) {
            x[i] = -3 + Math.random() * 10;
        }
        // Step # 3
        double sp[][] = new double[11][10];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < 10; j++) {
                if (a[i] == 20) {
                    sp[i][j] = Math.pow(2 * Math.asin(Math.pow((x[j] + 2) * Math.E + 1, 2)), 3);
                } else if (a[i] == 2 || a[i] == 6 || a[i] == 10 || a[i] == 12 || a
                        [i] == 14) {
                    sp[i][j] = Math.asin(0.5 * Math.pow(Math.E, -Math.abs(x[j])));
                } else {
                    sp[i][j] = Math.pow((0.5 - Math.pow(Math.pow(2 * Math.atan(x[j] + 2 * Math.E + 1), Math.cos(x[j])), 2))  / 3, 3);
                }
            }
        }
        System.out.println("Output:");
        System.out.println("Col/Row | Col 1 | Col 2 | Col 3 | Col 4 | Col 5 | Col 6 | Col 7 | Col 8 | Col 9 | Col 10");
        //System.out.println("-".repeat(88));
        for (int i = 0; i < 11; i++){
            String to_print;
            if (i > 8) {to_print = " Row " + (i + 1) + " |";}
            else {to_print = " Row " + (i + 1) + "  |";}
            for (int j = 0; j < 10; j++) {
                if (Double.isNaN(sp[i][j])) {to_print += "  " + String.format("%.3f", sp[i][j]) + "  |";}
                else if (String.format("%.3f", sp[i][j]).length() == 5) {to_print += " " + String.format("%.3f", sp[i][j]) + " |";}
                else if (String.format("%.3f", sp[i][j]).length() == 6) {to_print += "" + String.format("%.3f", sp[i][j]) + " |";}
                else if (String.format("%.3f", sp[i][j]).length() == 7) {to_print += String.format("%.3f", sp[i][j]) + "|";}
            }
            System.out.println(to_print);
        }
        //System.out.println("-".repeat(88));
    }
}
