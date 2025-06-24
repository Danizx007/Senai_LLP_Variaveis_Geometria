public class Triangulo {
    public static void main(String[] args) {
        try {
            double base = Double.parseDouble(args[0]);
            double altura = Double.parseDouble(args[1]);
            double area = (base * altura) / 2;
            System.out.printf("Área do triângulo: %.2f\n", area);
        } catch (Exception e) {
            System.out.println("Uso: java Triangulo <base> <altura>");
        }
    }
}