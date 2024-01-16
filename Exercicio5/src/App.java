public class App {
    public static void main(String[] args) throws Exception {
      // Escreva um código que encontre os elementos em comum que existem em dois arrays e imprima no console quais são esses elementos, um a um.

      String[] array1 = {"Morango", "Banana", "Maçã", "Uva", "Caqui"};
      String[] array2 = {"Manga", "Caqui", "Morango", "Amora"};

      for(int i = 0; i < array1.length; i++){
        for(int j = 0; j < array2.length; j++){
          if(array1[i] == array2[j]){
            System.out.print(array1[i] + " ");
          }
        }
      }
      System.out.println("");
    }
}
