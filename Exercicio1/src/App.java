public class App {
    public static void main(String[] args) throws Exception {
      // Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.
      
      int num = 10;
      boolean par = num % 2 == 0;
      boolean positivo = num > 0;

      if (num == 0 ) {
        System.out.println("Número neutro/zero");
        return;
      }

      if (par && positivo) {
          System.out.println("Número par e positivo");
      } else if (par && !positivo) {
          System.out.println("Número par e negativo");
      } else if (!par && positivo) {
          System.out.println("Número ímpar e positivo");
      } else {
          System.out.println("Número ímpar e negativo");
      }
    }
}
