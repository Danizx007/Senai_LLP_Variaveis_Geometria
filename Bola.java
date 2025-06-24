public class Bola {
    public static void main(String[] args) {
        try {
            double raio = Double.parseDouble(args[0]);
            double area = 4 * Math.PI * Math.pow(raio, 2);
            System.out.printf("Área da bola: %.2f\n", area);
        } catch (Exception e) {
            System.out.println("Uso: java Bola <raio>");
        }
    }
}