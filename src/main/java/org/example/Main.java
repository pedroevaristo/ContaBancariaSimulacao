package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ObjectAccount obj = new ObjectAccount();
        Scanner scan = new Scanner(System.in);
        System.out.println("Por favor digite o número da Agencia");

        System.out.println("Numero: ");
        Integer numero_conta = scan.nextInt();
        obj.setNumero_da_conta(numero_conta);

        System.out.println("Agencia: ");
        String numero_Agencia = scan.next();
        scan.nextLine();
        obj.setAgencia(numero_Agencia);

        System.out.println("Nome do cliente: ");
        String nome_cliente = scan.nextLine();
        obj.setNome_do_cliente(nome_cliente);

        System.out.println("Saldo para transferir: ");
        Double saldo_para_transferir = scan.nextDouble();
        obj.setSaldo_da_conta(saldo_para_transferir);

        scan.nextLine();
        System.out.println("Obrigado por escolher nosso banco," + obj.getNome_do_cliente() + ". Sua agencia é " + obj.getAgencia() + " conta " + obj.getNumero_da_conta() + " e seu saldo " + obj.getSaldo_da_conta() + "está disponivel para saque");


        scan.close();
    }
}