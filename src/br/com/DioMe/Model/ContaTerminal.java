package br.com.DioMe.Model;

import java.util.Scanner;

public class ContaTerminal {
    public int numero;
    public String agencia;
    public String nomeCliente;
    public double saldo = 50.00;

    //Construtor vazio
    public ContaTerminal() {


    }

    public void abrirConta() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, digite seus dados bancários!");
        System.out.println("depois ENTER para o próximo campo");
        System.out.print("Nome do cliente: ");
        this.nomeCliente = sc.nextLine();
        System.out.print("Agência: ");
        this.agencia = sc.next();
        System.out.print("Numero da conta: ");
        this.numero = sc.nextInt();


        exibirInfo();


    }
    public void exibirInfo(){
        System.out.printf("Olá, %s! Obrigado por criar uma conta em nosso banco! %n",this.nomeCliente);

        System.out.println("==".repeat(15));
        System.out.println("Agência: "+this.agencia);
        System.out.println("Numero da conta: "+this.numero);
        System.out.println("Nome do cliente: "+this.nomeCliente);
        System.out.println("Saldo: "+this.saldo);
        System.out.println("==".repeat(15));


    }
}
