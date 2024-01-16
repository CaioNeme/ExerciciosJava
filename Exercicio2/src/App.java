public class App {
    public static void main(String[] args) throws Exception {
      // Dado um número inteiro x, imprima uma sequência de Fibonacci de tamanho x.

      int x = 25;
      int a = 0;
      int b = 1;
      int aux = 0;

      if(x<0){
        System.out.println("Número inválido");
        return;
      }
      
      System.out.println("");
      for(int i = 0; i < x; i++){
        System.out.print(a + " ");
        aux = a;
        a = b;
        b = aux + b;
      }
      System.out.println("");
    }
}
