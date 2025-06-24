public class Circulo {
    public static void main(String[] args) {
        try {
            double raio = Double.parseDouble(args[0]);
            double area = Math.PI * Math.pow(raio, 2);
            System.out.printf("Área do círculo: %.2f\n", area);
        } catch (Exception e) {
            System.out.println("Uso: java Circulo <raio>");
        }
    }
}