import Back.Contato;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        1.Faça um programa em Java para simular uma parte do funcionamento de uma agenda de contatos. Você deverá ter
//        as opções de incluir uma pessoa e listar todas as pessoas cadastradas. Cada pessoa terá nome, sobrenome e
//        telefone de contato. O número máximo de contatos que podem ser salvos é definido por você. Fique à vontade.
//                Após finalizar o programa, compartilhe-o em sua conta do GitHub.

        Scanner leia = new Scanner(System.in);
        int cont =0;

        System.out.println("====REGISTRO DE CONTATO===");
        System.out.print("Digite a capacidade da lista de contato: ");
        int totalContato = leia.nextInt();

        //criaçãoLista
        Contato [] listaContato = new Contato[totalContato];

        for(int i = 0;cont < totalContato; cont++){

            //Inicializador
            Contato listaTotal = new Contato();

            System.out.print("Nome: ");
            listaTotal.setNome(leia.next());

            System.out.print("Sobrenome: ");
            listaTotal.setSobrenome(leia.next());

            System.out.print("Back.Contato: ");
            listaTotal.setTelefone(leia.nextInt());


            listaContato [cont] = listaTotal;
        }
            System.out.println("\n==========LISTA DE CONTATO=====");
        for(Contato leiaContato : listaContato){

            System.out.print("NOME: "+leiaContato.getNome()+" SOBRENOME: "+leiaContato.getSobrenome()+" TELEFONE: "+leiaContato.getTelefone()+"\n");
        }
    }
}