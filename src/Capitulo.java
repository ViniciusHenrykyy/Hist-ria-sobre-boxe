import java.util.ArrayList;
import java.util.Scanner;

public class Capitulo {
    protected String narrativa;
    protected ArrayList<Escolha> escolhas;
    protected int alteracaoDeEnergia = 0;
    protected int alteracaoDeHp = 0;
    protected personagem personagemPrincipal;
    protected personagem rival;
    protected Scanner escaneador;

    public Capitulo(personagem personagemPrincipal, Scanner escaneador, personagem ri) {
        this.personagemPrincipal = personagemPrincipal;
        this.escaneador = escaneador;
        this.escolhas = new ArrayList<Escolha>();
        this.rival = ri;
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

    protected void mostrar(){
        System.out.println(narrativa.replace("\\n","\n").replace("player.getNome()", personagemPrincipal.getNome()).replace("rival.getNome()", rival.getNome()));
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
    protected int getindex(String valorString){
        int retorno = -1;
        for(Escolha i : escolhas){
            retorno += 1;
            if(i.texto.equalsIgnoreCase(valorString)){
                return retorno;
            }
        }
        return -1;
    }
    protected int escolha(){
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
