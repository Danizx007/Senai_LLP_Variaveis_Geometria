public class Caixa {
    public static void main(String[] args) {
        try {
            double largura = Double.parseDouble(args[0]);
            double altura = Double.parseDouble(args[1]);
            double profundidade = Double.parseDouble(args[2]);
            double area = 2 * (largura * altura + largura * profundidade + altura * profundidade);
            System.out.printf("Área da superfície da caixa: %.2f\n", area);
        } catch (Exception e) {
            System.out.println("Uso: java Caixa <largura> <altura> <profundidade>");
        }
    }
}