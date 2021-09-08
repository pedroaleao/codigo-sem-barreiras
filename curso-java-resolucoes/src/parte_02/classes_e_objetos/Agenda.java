package parte_02.classes_e_objetos;
/*
- Crie uma classe Agenda que pode armazenar 10 pessoas e que seja capaz de realizar as seguintes operações:
- void armazenaPessoa(String nome, int anoNascimento, float altura); (FEITO NA CLASSE PESSOA)
- void removePessoa(String nome); (FEITO)
    - int buscaPessoa(String nome); // informa em que posição da agenda está a pessoa
- void imprimeAgenda(); // imprime os dados de todas as pessoas da agenda
    - void imprimePessoa(int index); // imprime os dados da pessoa que está na posição “i” da agenda.
* */


import java.util.ArrayList;
import java.util.List;

public class Agenda {



    int quantidade;
    public List<Pessoas> agendar = new ArrayList<>();


    public Agenda(int quantidade) {
        this.quantidade = quantidade;
    }



    // adicionar pessoas
    public void armazenaPessoa(Pessoas pessoa){
        if(this.quantidade > agendar.size()){
            if(!agendar.contains(pessoa)) {
                agendar.add(pessoa);
                System.out.println("Adicionado a pessoa " + pessoa.getNome());
            }else{
                System.out.println(pessoa.getNome() + " JÁ Adicionada");
            }
        }else {
            System.out.println("Agendamento Finalizado. "+ pessoa.getNome() + " NÃO PODE SER AGENDADA\n");
        }
    }




    //  - int buscaPessoa(String nome); // informa em que posição da agenda está a pessoa
    public void  buscaPessoa(String nome){
        for(Pessoas pessoa: agendar){
            if (pessoa.getNome().equals(nome)){
                System.out.println("A pessoa "+pessoa+ " foi encontrada");
                //return agendar.iterator();
            }
        }
        System.out.println("PESSOA NAO ENCONTRADA");
    }


    //   - void imprimePessoa(int index); // imprime os dados da pessoa que está na posição “i” da agenda.
    public void  imprimePessoa(int index){
        int i = 0;
        for(Pessoas pessoa: agendar){
            if (agendar.get(i).equals(index)){
                System.out.println("A pessoa "+pessoa.nome+ " foi encontrada");
                //return agendar.iterator();
            }
            i++;
        }
        System.out.println("PESSOA NAO ENCONTRADA");
    }


    // void removePessoa(String nome);
    public void removePessoa(Pessoas pessoa){
        if(agendar.remove(pessoa)){
            System.out.println("A pessoa; "+pessoa.getNome() + " foi REMOVIDO\n");
        }else {
            System.out.println("Esta Pessoa nao existe");
        }
    }

    //- void imprimeAgenda(); // imprime os dados de todas as pessoas da agenda
    public void imprimeAgenda(){
        System.out.println("*******PESSOAS NA AGENDA***********");
                System.out.println(agendar);
        }
    }



