public class App {
    public static void main(String[] args) throws Exception {
        // Crie uma pirâmide de números, onde você deve imprimir em cada linha separada a quantidade de números que está sendo iterado no momento. 
        int x = 9;

        for(int i = 1; i <= x; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
