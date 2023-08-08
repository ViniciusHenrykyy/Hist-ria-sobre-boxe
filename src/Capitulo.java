import java.util.ArrayList;
import java.util.Scanner;

public class Capitulo {
    private String narrativa;
    private ArrayList<Escolha> escolhas;
    private int alteracaoDeEnergia = 0;
    private int alteracaoDeHp = 0;
    private personagem personagemPrincipal;
    private Scanner escaneador;

    public Capitulo(personagem personagemPrincipal, Scanner escaneador) {
        this.personagemPrincipal = personagemPrincipal;
        this.escaneador = escaneador;
        this.escolhas = new ArrayList<Escolha>();
    }
     public void setAlteracaoDeHp(int alteracaoDeHp) {
        this.alteracaoDeHp = alteracaoDeHp;
    }
    public void adicionarescolha(Escolha e){
        this.escolhas.add(e);
    }
    public void setAlteracaoDeEnergia(int alteracaoDeEnergia) {
        this.alteracaoDeEnergia = alteracaoDeEnergia;
    }

    public void setNarrativa(String narrativa) {
        this.narrativa = narrativa;
    }

    private void mostrar(){
        System.out.println(narrativa);
        System.out.println("");
        for(Escolha i : escolhas){
            System.out.println(i.texto);
        }
        System.out.println("");
        if(alteracaoDeEnergia > 0){
            personagemPrincipal.gastarenergia(alteracaoDeEnergia);
        }
        if(alteracaoDeHp > 0){
            personagemPrincipal.recceberdano(alteracaoDeHp);
        }
    }
    private int getindex(String valorString){
        int retorno = -1;
        for(Escolha i : escolhas){
            retorno += 1;
            if(i.texto.equalsIgnoreCase(valorString)){
                return retorno;
            }
        }
        return -1;
    }
    private int escolha(){
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
    public void executar() {
        mostrar();
        if(this.escolhas.size() > 0){
            int escolhido = escolha();
            this.escolhas.get(escolhido).executar();
        }
        
    }
    
}
