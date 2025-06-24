public class Retangulo {
    public static void main(String[] args) {
        try {
            double base = Double.parseDouble(args[0]);
            double altura = Double.parseDouble(args[1]);
            double area = base * altura;
            System.out.printf("Área do retângulo: %.2f\n", area);
        } catch (Exception e) {
            System.out.println("Uso: java Retangulo <base> <altura>");
        }
    }
}