public class App {
    public static void main(String[] args) throws Exception {
      //Escreva um código que deve imprimir a tabela de multiplicação de algum número fornecido além de exibir 
      //um cabeçalho com o nome Tabela de multiplicação de X, onde X é o número a ser multiplicado.

      int x = 10;

      System.out.println("Tabela de multiplicação de " + x);
      for(int i = 1; i <= 10; i++){
        System.out.println(x + " x " + i + " = " + x*i);
      }
    }
}
