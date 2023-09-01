import Fucionarios.Funcionario;
import Viagem.Viagem;

import java.util.Scanner;

public class ClasseTeste {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Funcionario funcionario = new Funcionario(true,"04898803555","JP","Rua Engenheiro Gonçalves","jpferreira.dev@gmail.com","Desenvolvedor","Desenvolvimento");
        Viagem viagem = new Viagem("01/12/1991","37.701.046/0001-48","JP","04898803555","04897765444","confirmado");

        System.out.println(funcionario.toString());
        System.out.println("-------------");
        System.out.println(viagem.toString());



    }
}
