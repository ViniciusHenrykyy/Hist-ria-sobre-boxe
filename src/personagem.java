import java.util.Scanner;


public class personagem {
    String nome;
    int hp = 100;
    int energia = 100;
    int forca = 5;
    int defesa = 5;
    
    public boolean apto(){
        return this.energia > 0;
    }

    public void gastarenergia(int valor){
        this.energia -= valor; 
        if (this.energia <= 0){
            this.energia = 0;
            System.out.println("Você esgotou sua energia você está muito abatido!!!");
        }

        System.out.println("Você gastou "+ valor + " de energia, ainda lhe resta: " + this.energia + "/100");
    }
    public void amimir(){
        this.energia = 100;
    }
    public void perguntaramimir(Scanner escaneador){
        System.out.println("Você deseja dormir?");
        System.out.println("sim");
        System.out.println("não");
        System.out.println("");
        String b = escaneador.nextLine();
        while(!b.equalsIgnoreCase("sim") && !b.equalsIgnoreCase("não")){
            System.out.println("Digite novamente!!!");
            b = escaneador.nextLine();
        }
        if (b.equalsIgnoreCase("sim")){
            this.amimir();
            System.out.println("Você dormiu bem essa noite");
        }else{
            System.out.println("Você dormiu mal essa noite");
        }    
    }
    
    public void recceberdano(int dano){
        this.hp -= dano;
        if (this.hp <= 0 ){
            this.hp =  0;
            System.out.println("Sua vida chegou a zero, você desmaiou!!!");
            System.exit(0);
        }
        System.out.println(this.nome +" recebeu "+ dano + " de dano");
        System.out.println("Ainda resta " + this.hp);
        
    }
}

