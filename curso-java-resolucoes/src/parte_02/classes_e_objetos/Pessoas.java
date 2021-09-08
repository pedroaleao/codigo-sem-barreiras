package parte_02.classes_e_objetos;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pessoas {

    /*
    1 - Crie uma classe para representar uma pessoa, com os a
    tributos de
    nome, ano de nascimento e altura.
    Crie também um método para
    1 - imprimir todos dados de uma pessoa usando System.out.println.
    2 - Crie um método para dizer quantos anos a pessoa fará no ano corrente.
    * */
    public String nome;
    public int anoNascimento;
    public float altura;

    public Pessoas(String nome, int anoNascimento, float altura) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.altura = altura;
    }

    public int suaIdade(int dia, int mes) {
        return (int) ChronoUnit.YEARS.between(LocalDate.of(this.anoNascimento, mes, dia), LocalDate.now());
    }

    public String getNome() {
        return nome;
    }


    @Override
    public String toString() {
        return "Pessoas =>> " +
                "Nome='" + nome + '\'' +
                ", Nascimento=" + anoNascimento +
                ", Altura=" + altura +"\n";
    }
}
