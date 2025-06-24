public class Tubo {
    public static void main(String[] args) {
        try {
            double raio = Double.parseDouble(args[0]);
            double altura = Double.parseDouble(args[1]);
            double areaBase = Math.PI * Math.pow(raio, 2);
            double areaLateral = 2 * Math.PI * raio * altura;
            double areaTotal = 2 * areaBase + areaLateral;
            System.out.printf("Área do tubo: %.2f\n", areaTotal);
        } catch (Exception e) {
            System.out.println("Uso: java Tubo <raio> <altura>");
        }
    }
}