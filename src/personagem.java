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
        if (b.equalsIgnoreCase("sim")){
            this.amimir();
            System.out.println("Você dormiu bem essa noite");
        }else{
            System.out.println("Você dormiu mal essa noite");
        }    
    }
    public void primeiraluta(Scanner escaneador, personagem inimigo){
        System.out.println(inimigo.nome +" tenta acertar um gancho!!!");
        System.out.println("andar para tras");  
        System.out.println("desviar para o lado");
        String c = escaneador.nextLine();
        if (c.equalsIgnoreCase("desviar para o lado")){
            System.out.println("Tomei um soco na altura do estomago e vomitei, "+
            "e com vergonha fugi da situação e resolvi desistir de tudo");
            this.recceberdano(100);
        }else{
            System.out.println("pensei rápido numa aula que o mestre me deu sobre ganchos e andei para trás desviando");
            this.gastarenergia(20);
            System.out.println(inimigo.nome +" vai tentar me acertar um direto!!!");
            System.out.println("andar para frente e revidar");
            System.out.println("andar para o lado e revidar");
            String d = escaneador.nextLine();
            if (d.equalsIgnoreCase("andar para o lado e revidar")){
                System.out.println("Eu percebo que ele vai dar um direto eu jogo o meu corpo para o lado e tento"+
                " acerta-lo durante seu golpe, mas ele gira o quadril abaixa a cabeça e me acerta um direto bem"+
                " no meio do meu nariz, que fica sangrando e eu sinto muita dor, saio do ringue e o mestre  diz "+
                "que 'um aluno que não lembra do que o mestre dele o ensinou não deviar mais lutar, pois não tem "+
                "foco e concentração' depois disso peguei minhas coisas e desisti de tudo!!!");
                this.recceberdano(100);
            }else{
                System.out.println("Eu lembro do que o mestre me ensinou sobre:'contra golpes e diretos', eu encurto"+
                " a distância e jogo um gancho no queixo dele, ele me olha irritado e frustado por eu ter acertado"+ 
                " ele, então ele me diz:'chega de pegar leve', quando ele vinha para cima de mim com sague nos olhos"+
                " o mestre encerra a luta e diz que era vergonhoso uma atleta como ele que é considerado a promessa "+
                "do país tomar um soco de uma iniciante que está treinando a 1 mês, e que ele não anda treinando seus"+
                " fundamentos. Ele fica muito irritado e saí da academia sem falar mais nada só com um olhar frustado"+
                " e de raiva!!!");
                this.gastarenergia(30);
            }

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

