import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        double parametroUm =sc.nextDouble();

        System.out.println("Digite o segundo parâmetro");
        double parametroDois = sc.nextDouble();

        try {
            //todo: chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException e) {
            //todo: imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

    }
    static void contar(double parametroUm, double parametroDois ) throws ParametrosInvalidosException {
        double contagem = 0;
        //todo: validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if(parametroUm > parametroDois)
            throw new ParametrosInvalidosException();
        else
            contagem = parametroDois - parametroUm;




        for(; contagem >0; contagem--){
            System.out.println("imprimindo o numero: "+ contagem);

        }
    }
}



