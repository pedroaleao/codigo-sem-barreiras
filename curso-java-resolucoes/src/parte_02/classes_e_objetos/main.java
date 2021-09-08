package parte_02.classes_e_objetos;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class main {




    public static void main(String[] args) {
        // Abrindo a agenda para 10 peaaoas
        Agenda agenda = new Agenda(10);

        //Criando Pessoas
        Pessoas pedro = new Pessoas("Pedro",1985,1.70F);
        Pessoas fabricio = new Pessoas("Fabricio",1985,1.70F);
        Pessoas patricia = new Pessoas("Patricia",1985,1.70F);
        Pessoas katia = new Pessoas("Katia",1985,1.70F);
        Pessoas nathally = new Pessoas("Nathally",1985,1.70F);

        // resolucao do 1
        // mostrando informacoes de uma pessoa
        System.out.print(pedro);
        // calculando a idade
        System.out.println(" || Idade: "+pedro.suaIdade(8,11));




        // Adicionanco as pessoas a agenda
        agenda.armazenaPessoa(pedro);
        agenda.armazenaPessoa(fabricio);
        agenda.armazenaPessoa(patricia);
        agenda.armazenaPessoa(katia);
        agenda.removePessoa(katia);
        agenda.armazenaPessoa(nathally);


        // imprimindo todas as pessoas da agenda
        agenda.imprimeAgenda();
        // Buscando uma pessoa pelo nome
        agenda.buscaPessoa("Pedro");

        // Imprimindo as informacoes da pessoa peo identificador
        agenda.imprimePessoa(1);





    }


}
