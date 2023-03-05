package pl.krzysztofjastrzebski.pw.javasem3;

public class Circle {
    private static double area;
    private static double radius;
    private final static double MIN = 0;
    private final static double MAX = 400;

    public static void main(String[] args) throws Exception {
        System.out.print("Podaj promień koła: ");

        Scanner scanner = new Scanner(System.in);
        radius = scanner.nextDouble();
        scanner.close();

        if(radius < MIN || radius > MAX){
            System.out.printf("Promień koła musi znajdować się w zakresie <%.0f; %.0f>", MIN, MAX);
        } else {
            area = radius * radius * Math.PI;
            System.out.println("Promień koła: " + radius);
            System.out.println("Pole koła: " + area);
            System.out.println("=== KONIEC PROGRAMU ===");
        }
    }
}

}
