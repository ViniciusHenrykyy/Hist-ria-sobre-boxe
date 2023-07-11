import java.util.Scanner;

public class Capitulo {
    String narrativa;
    String[] escolhas;
    int alteracaoDeEnergia = 0;
    int alteracaoDeHp = 0;

    public Capitulo(int totaldeescolhas){
        escolhas = new String[totaldeescolhas];
    }
    public void mostrar(personagem personagemPrincipal){
        System.out.println(narrativa);
        System.out.println("");
        for(String i : escolhas){
            System.out.println(i);
        }
        System.out.println("");
        if(alteracaoDeEnergia > 0){
            personagemPrincipal.gastarenergia(alteracaoDeEnergia);
        }
        if(alteracaoDeHp > 0){
            personagemPrincipal.recceberdano(alteracaoDeHp);
        }
    }
    public int getindex(String valorString){
        int retorno = -1;
        for(String i : escolhas){
            retorno += 1;
            if(i.equalsIgnoreCase(valorString)){
                return retorno;
            }
        }
        return -1;
    }
    public int escolha(Scanner escaneador){
        String armazenar = escaneador.nextLine();
        while(true){
            if(getindex(armazenar)>=0){
                break;
            }else{
                System.out.println("escolha invalida digite novamente!!");
                armazenar = escaneador.nextLine();
            }            
        }
        return getindex(armazenar);
    }
        
}
