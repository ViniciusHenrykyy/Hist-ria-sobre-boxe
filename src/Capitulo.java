import java.util.Scanner;

public class Capitulo {
    String narrativa;
    String escolha_1;
    String escolha_2;
    int alteracaoDeEnergia = 0;
    int alteracaoDeHp = 0;
    public void mostrar(personagem personagemPrincipal){
        System.out.println(narrativa);
        System.out.println("");
        System.out.println(escolha_1);
        System.out.println(escolha_2);
        System.out.println("");
        if(alteracaoDeEnergia > 0){
            personagemPrincipal.gastarenergia(alteracaoDeEnergia);
        }
        if(alteracaoDeHp > 0){
            personagemPrincipal.recceberdano(alteracaoDeHp);
        }
    }
    public int escolha(Scanner escaneador){
        String armazenar = escaneador.nextLine();
        while(true){
            if((escolha_1.equalsIgnoreCase(armazenar)) || (escolha_2.equalsIgnoreCase(armazenar))){
                break;
            }else{
                System.out.println("escolha invalida digite novamente!!");
                armazenar = escaneador.nextLine();
            }            
        }
        if(escolha_1.equalsIgnoreCase(armazenar)){
            return 1;
        }else{
            return 2;
        }
    }
        
}
