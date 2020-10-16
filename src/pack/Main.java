package pack;

import java.util.Scanner;
/**
 *
 * @author Bruno Gressler da Silveira
 * @version 1
 * @since 12/10/2020
 */
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        
        byte op;
        float f_digito1, f_digito2, resultado = 0;
        char e = 't';
        
        try{
            do{    
                System.out.println("::::::O que Deseja Fazer?:::::::::::::\n"
                        + "::0 - Sair                          ::\n"
                        + "::1 ---------------- +              ::\n"
                        + "::2 ---------------- -              ::\n"
                        + "::3 ---------------- /              ::\n"
                        + "::4 ---------------- *              ::\n" 
                        + "::5 ---------------- x¹             ::\n"
                        + "::6 ---------------- √              ::\n"
                        + "::7 ---------------- ∛              ::\n"
                        + "::8 ---------------- %              ::\n"
                        + "::::::::::::::::::::::::::::::::::::::");
                op = leia.nextByte();

                switch(op){
                    case 0:

                        Tela.limparTela();
                        System.out.println("Sistema Encerrado");
                        break;
                    case 1:

                        Tela.limparTela();  
                        f_digito1 = leia.nextFloat();
                        f_digito2 = leia.nextFloat();

                        resultado = f_digito1 + f_digito2;
                        Tela.limparTela();

                        System.out.print("O Resultado de: " + f_digito1 + " + " + f_digito2 + " é:\n"
                                + ":::" + resultado + ":::\n\n");
                        break;
                    case 2:

                        Tela.limparTela();
                        f_digito1 = leia.nextFloat();
                        f_digito2 = leia.nextFloat();

                        resultado = f_digito1 - f_digito2;
                        Tela.limparTela();

                        System.out.print("O Resultado de: " + f_digito1 + " - " + f_digito2 + " é:\n"
                                + ":::" + resultado + ":::\n\n");
                        Tela.limparTela();  

                        break;
                    case 3:

                        Tela.limparTela();
                        f_digito1 = leia.nextFloat();
                        f_digito2 = leia.nextFloat();

                        resultado = f_digito1 / f_digito2;
                        Tela.limparTela();

                        System.out.print("O Resultado de: " + f_digito1 + " / " + f_digito2 + " é:\n"
                                + ":::" + resultado + ":::\n\n");
                        break;
                    case 4:

                        Tela.limparTela();
                        f_digito1 = leia.nextFloat();
                        f_digito2 = leia.nextFloat();

                        resultado = f_digito1 * f_digito2;
                        Tela.limparTela();

                        System.out.print("O Resultado de: " + f_digito1 + " * " + f_digito2 + " é:\n"
                                + ":::" + resultado + ":::\n\n");
                        break;
                    case 5:

                        Tela.limparTela();
                        f_digito1 = leia.nextFloat();
                        f_digito2 = leia.nextFloat();

                        resultado = (float) Math.pow(f_digito1, f_digito2);
                        Tela.limparTela();

                        System.out.print("O Resultado de: " + f_digito1 + " Elevado a " + f_digito2 + " Potência é:\n"
                                + ":::" + resultado + ":::\n\n");                 
                        break;
                    case 6:

                        Tela.limparTela();
                        f_digito1 = leia.nextFloat();
                        
                        resultado = (float) Math.sqrt(f_digito1);
                        Tela.limparTela();

                        System.out.print("A Raiz Quadradade: " + f_digito1 + " é:\n"
                                + ":::" + resultado + ":::\n\n");
                        break;
                    case 7:

                        Tela.limparTela();
                        f_digito1 = leia.nextFloat();

                        resultado = (float) Math.cbrt(f_digito1);
                        Tela.limparTela();

                        System.out.print("A Raiz cubica: " + f_digito1 + " é:\n"
                                + ":::" + resultado + ":::\n\n");

                        break;
                    case 8:
                        
                        Tela.limparTela();                       
                        System.out.print("Em Breve\n\n");
                        ///*
                        Tela.limparTela();

                        System.out.print("Qual a Porcetagem que Deseja Calcular: ");
                        f_digito1 = leia.nextFloat();
                        System.out.print("De: ");
                        f_digito2 = leia.nextFloat();

                        resultado = f_digito1 * f_digito2 / 100;
                        Tela.limparTela();

                        System.out.print("a Porcentagem é: " + resultado + "\n\n");

                        //*/
                        break;
                    default:

                        Tela.limparTela();
                        System.out.println("Opção Inválida");
                        break;
                }
            }while(op != 0);
        }catch(Exception erro){
            
            Tela.limparTela();
            System.out.println("Erro: " + erro + "\n\n");  
            Main.main(args);
        }
    }
}
