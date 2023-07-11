import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("CAPÍTULO I");
        System.out.println("");

        System.out.println("Você entra numa academia de boxe com o sonho de virar um lutador profissional!");
        System.out.println("Você vê o mestre instruindo outros alunos, quando ele lhe vê pergunta seu nome!");
        System.out.println("'Qual o seu nome, garoto?'");
        Scanner escaneador = new Scanner(System.in);
        personagem player = new personagem();
        personagem rival = new personagem();
        player.nome = escaneador.nextLine();
        System.out.println("Qual o nome do seu rival?");
        rival.nome = escaneador.nextLine();

        Capitulo capitulo_1 = new Capitulo(2);
        capitulo_1.narrativa = "Bem vindo " + player.nome + " acho que podemos começar com as posturas "+
        " de luta\n'Bem  você este  levando jeito pra coisa' disse  o  mestre!\nBom, vamos agora fazer "+
        "alguns exercicios de cardio para ajudar voce a ter mais resistencia\nChegando em casa morto de"+
        " cansado " + player.nome + " nao sente se ira aguentar os exercicios\n e pensa em desistir!";

        capitulo_1.escolhas[0] = "Desistir";
        capitulo_1.escolhas[1] = "Continuar";
        capitulo_1.alteracaoDeEnergia = 50;
        capitulo_1.mostrar(player);
        if(capitulo_1.escolha(escaneador) == 0){
            System.out.println(player.nome + " desistiu da ideia e passou a ter outros objetivos na vida e desistiu do "+
            " seu sonho");
            System.exit(0);
        }else{
             player.perguntaramimir(escaneador);
        }
        
        System.out.println("No outro dia me levanto e depois das aulas vou até a academia de box, chagando lá eu conheço ele");
        System.out.println("Eu pergunto seu nome, mass ele tem um ar de arrogancia e superioridade e me ignora!");
        System.out.println("O mestre disse que ele se chama " + rival.nome + " e que ele é uma grande promessa no país");
        System.out.println(rival.nome +"  olhou para mim e depois perguntou para o mestre se a academia "+
            "estava aceitando perdedores.");
        System.out.println("Eu não consegui me conter de raiva e pedi para lutar com ele");
        System.out.println("Ele aceitou, e disse que ia me mostrar que eu não servia para estar ali");
        System.out.println("O mestre advertiu ele e a mim, pois ele disse que eu não sabia nem o básico"+
            " para ter um sparring");
        System.out.println("O mestre me disse que iria me treinar e que em 1 mês ele me deixaria lutar com ele!");

        System.out.println("---------------------------------");
        System.out.println("---------- CAPÍTULO II ----------");
        System.out.println("---------------------------------");

        System.out.println("Chegou o grande dia, e desde o segundo dia nunca fiu com a cara do "+ rival.nome);
        System.out.println("Eu treinei muito!!!");
        System.out.println("Eu sei que ele treina a mais tempo que ele é uma grande promessa,"+
            " mass eu não ligo para nada disso");
        System.out.println("Eu só sinto que preciso acabar com a arrogancia desse cara!!!");
        System.out.println("Chegando na academia eu vi ele já no ringue com suas luvas e proteção só me esperando");
        System.out.println("O mestre disse que ia ser o juiz e que iria mediar tudo");
        System.out.println("E assim nossa rivalidade começou, nossa luta começou!!!");

        Capitulo capitulo_2 = new Capitulo(2);
        capitulo_2.narrativa = rival.nome +" tenta acertar um gancho!!!";
        capitulo_2.escolhas[0] = "andar para tras";
        capitulo_2.escolhas[1]= "desviar para o lado";
        capitulo_2.mostrar(player);
        if(capitulo_2.escolha(escaneador) == 1){
            System.out.println("Tomei um soco na altura do estomago e vomitei, "+
            "e com vergonha fugi da situação e resolvi desistir de tudo");
            capitulo_2.alteracaoDeHp = 100;
            System.exit(0);
        }else{
            System.out.println("pensei rápido numa aula que o mestre me deu sobre ganchos e andei para trás desviando");
            capitulo_2.alteracaoDeEnergia = 20;
        }        
        Capitulo capitulo_3 = new Capitulo(2);
        capitulo_3.narrativa = rival.nome +" vai tentar me acertar um direto!!!";
        capitulo_3.escolhas[0] = "andar para frente e revidar";
        capitulo_3.escolhas[1] = "andar para o lado e revidar";
        capitulo_3.mostrar(player);
            if (capitulo_3.escolha(escaneador) == 1){
                System.out.println("Eu percebo que ele vai dar um direto eu jogo o meu corpo para o lado e tento"+
                " acerta-lo durante seu golpe, mas ele gira o quadril abaixa a cabeça e me acerta um direto bem"+
                " no meio do meu nariz, que fica sangrando e eu sinto muita dor, saio do ringue e o mestre  diz "+
                "que 'um aluno que não lembra do que o mestre dele o ensinou não deviar mais lutar, pois não tem "+
                "foco e concentração' depois disso peguei minhas coisas e desisti de tudo!!!");
                capitulo_3.alteracaoDeHp = 100;
                System.exit(0);
            }else{
                System.out.println("Eu lembro do que o mestre me ensinou sobre:'contra golpes e diretos', eu encurto"+
                " a distância e jogo um gancho no queixo dele, ele me olha irritado e frustado por eu ter acertado"+ 
                " ele, então ele me diz:'chega de pegar leve', quando ele vinha para cima de mim com sague nos olhos"+
                " o mestre encerra a luta e diz que era vergonhoso uma atleta como ele que é considerado a promessa "+
                "do país tomar um soco de uma iniciante que está treinando a 1 mês, e que ele não anda treinando seus"+
                " fundamentos. Ele fica muito irritado e saí da academia sem falar mais nada só com um olhar frustado"+
                " e de raiva!!!");
                capitulo_3.alteracaoDeEnergia = 30;
                }

        if (player.apto()){
            System.out.println("O mestre me considerou vencedor por acertar apenas um golpe, foi meio frustante.");
            System.out.println("Mais só de eu ter tirado aquele ar de superioridade dele já me motivou ainda mais.");
            System.out.println("Eu decidi que eu realmente poderia ser bom naquilo, mais que eu ainda tinha muito a aprender");
            System.out.println("descidi absorver o máximo possível que o mestre tem a ensinar com o intuito de algum dia "+
                "se tornar profissional.");    
        }else{
            System.out.println("Você acerta ele, mais cai de cansasso, você escuta o mestre murmurando algo e "+
                "enquanto você desmeia");
        }
        

        //Fim do Capítulo II

        escaneador.close();
    }
}
