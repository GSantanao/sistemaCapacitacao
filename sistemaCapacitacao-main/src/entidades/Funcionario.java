package entidades;

public class Funcionario {
    private String nome;
    private double salarioBruto;
    private double taxa;

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBruto() {
        return salarioBruto;
        }
        
    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }
    
    public double getTaxa() {
        return taxa;
    }
    
    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }
    public double calcularSalarioLiquido(){
        double salarioLiquido = getSalarioBruto() - getTaxa();
        return salarioLiquido;
    }
    public void aumentarSalario(double porcentagem){
        System.out.printf("Dados atualizados: R$ %.2f",calcularSalarioLiquido() + (getSalarioBruto()*(porcentagem/100)));
    }
}
