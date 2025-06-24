public class Piramide {
    public static void main(String[] args) {
        try {
            double base = Double.parseDouble(args[0]);
            double alturaLateral = Double.parseDouble(args[1]);
            double areaBase = base * base;
            double areaLateral = 2 * base * alturaLateral;
            double areaTotal = areaBase + areaLateral;
            System.out.printf("Área da pirâmide: %.2f\n", areaTotal);
        } catch (Exception e) {
            System.out.println("Uso: java Piramide <base> <altura_lateral>");
        }
    }
}