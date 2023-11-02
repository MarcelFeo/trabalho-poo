import java.util.Date;

public class Garcom extends Funcionario {
    private double salarioFixo;
    private String diaFolga;
    private int numPedidos;
    private int limitePedidos = 25; // para ganhar a gratificação
    private double salarioBonus = 0;

    public Garcom(double salarioFixo, String diaFolga, String nome, String cpf, String rg, String estadoCivil, String endereco, Date dataAdmissao, String carteiraDeTrabalho) {
        super(nome, cpf, rg, estadoCivil, endereco, dataAdmissao, carteiraDeTrabalho);
        this.salarioFixo = salarioFixo;
        this.diaFolga = diaFolga;
    }

    public double calcularSalario() {
        double salario = 0;

        if (numPedidos > limitePedidos) {
            salarioBonus = 0.1 * salarioFixo;
            salario += salarioBonus;
        }

        return salario;
    }

    public void verificaGratificacao() {

        if (numPedidos > limitePedidos) {
            System.out.println("Você ganhou a gratificação!");
        } else {
            System.out.println("Você não ganhou a gratificação!");
        }

    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public String getDiaFolga() {
        return diaFolga;
    }

    public void setDiaFolga(String diaFolga) {
        this.diaFolga = diaFolga;
    }
}
