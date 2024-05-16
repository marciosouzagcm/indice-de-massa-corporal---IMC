/*Cálculo IMC
IMC é a sigla para Indice de Massa Corpórea, parametro adotado pela Organizaçao Mundial de Saude para calcular o peso ideal de cada pessoa.

O índice é calculado da seguinte maneira: divide-se o peso do paciente pela sua altura elevada ao quadrado. Diz-se que o individuo tem peso normal quando o resultado do IMC está entre 18,5 e 24,9.
*/
import java.util.Scanner;
/**
 * Classe para calcular o Índice de Massa Corporal (IMC) e classificar o estado de saúde baseado no resultado.
 */
public class Imc {

    // Atributos privados para armazenar informações pessoais e resultados do IMC
    private String nome;
    private float peso;
    private float altura;
    private int idade;
    private float imc;
    private String classificacao;
    private String grau;

    // Getters e Setters para cada atributo
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getImc() {
        return imc;
    }

    public void setImc(float Imc) {
        this.imc = Imc;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public String getGrau() {
        return grau;
    }

    public void setGrau(String grau) {
        this.grau = grau;
    }

    /**
     * Método principal para interagir com o usuário, calcular o IMC e imprimir a classificação de saúde.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Imc pessoa = new Imc();

        // Solicita informações do usuário
        System.out.println("Digite o seu nome:");
        pessoa.setNome(scanner.nextLine());

        System.out.println("Digite o seu peso (em kg):");
        pessoa.setPeso(scanner.nextFloat());

        System.out.println("Digite a sua altura (em metros):");
        pessoa.setAltura(scanner.nextFloat());

        System.out.println("Digite a sua idade:");
        pessoa.setIdade(scanner.nextInt());

        // Calcula o IMC
        float imc = pessoa.getPeso() / (pessoa.getAltura() * pessoa.getAltura());
        String imcFormatado = String.format("%.2f", imc);  // Formata o IMC para duas casas decimais

        // Classifica o estado de saúde baseado no IMC
        if (imc < 18.5) {
            pessoa.setClassificacao("Magreza");
            pessoa.setGrau("0");
            System.out.println("\nSr.(a) " + pessoa.getNome() + ", seu IMC é " + imcFormatado + ", magreza e grau 0");
        } else if (imc >= 18.5 && imc <= 24.9) {
            pessoa.setClassificacao("Normal");
            pessoa.setGrau("0");
            System.out.println("\nSr.(a) " + pessoa.getNome() + ", seu IMC é " + imcFormatado + ", normal e grau 0");
        } else if (imc >= 25 && imc <= 29.9) {
            pessoa.setClassificacao("Sobrepeso");
            pessoa.setGrau("I");
            System.out.println("\nSr.(a) " + pessoa.getNome() + ", seu IMC é " + imcFormatado + ", sobrepeso e grau I");
        } else if (imc >= 30 && imc <= 39.9) {
            pessoa.setClassificacao("Obesidade");
            pessoa.setGrau("II");
            System.out.println("\nSr.(a) " + pessoa.getNome() + ", seu IMC é " + imcFormatado + ", obesidade e grau II");
        } else {
            pessoa.setClassificacao("Obesidade morbida");
            pessoa.setGrau("III");
            System.out.println("\nSr.(a) " + pessoa.getNome() + ", seu IMC é " + imcFormatado + ", obesidade morbida e grau III");
        }

        // Encerra a entrada de dados do scanner
        scanner.close();
    }
}
