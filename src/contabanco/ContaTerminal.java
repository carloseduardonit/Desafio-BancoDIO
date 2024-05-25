/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contabanco;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class ContaTerminal {
   private int numeroConta;
   private int agencia;
   private String nomeCliente;
   private double Saldo;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaTerminal conta  = new ContaTerminal();
        System.out.println("Por favor, digite o seu Nome:");
        conta.setNomeCliente(scanner.nextLine());
        System.out.println("Por favor, digite o numero da Agência:");
        conta.setAgencia(scanner.nextInt());
        System.out.println("Por favor, digite o numero da Conta:");
        conta.setNumeroConta(scanner.nextInt());
        System.out.println("Por favor, digite o seu Saldo:");
        conta.setSaldo(scanner.nextDouble());
        scanner.close();
        // TODO code application logic here
        System.out.println("\nOlá "+conta.getNomeCliente()+
                ", obrigado por criar uma conta em "
                + "nosso banco, sua agência é "+conta.getAgencia()+
                ", conta "+conta.getNumeroConta()+" e seu saldo "
                +conta.getSaldo()+" já está disponível para saque");
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }
    
}
