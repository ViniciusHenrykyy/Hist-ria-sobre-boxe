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

        System.out.println("Bem vindo " + player.nome + " acho que podemos começar com as posturas de luta");
        System.out.println("'Bem você esta levando jeito pra coisa' disse o mestre!");
        System.out.println("Bom, vamos agora fazer alguns exercícios de cardio para ajudar você a ter mais resistência");
        player.gastarenergia(50);
        System.out.println("Chegando em casa morto de cansado " + player.nome + " não sente se irá aguentar os exercicios");
        System.out.println(" e pensa em desistir!");
        System.out.println("");
        System.out.println("Desistir");
        System.out.println("Continuar");
        System.out.println("");
        String a = escaneador.nextLine();
        if (a.equalsIgnoreCase("Desistir")){
            System.out.println(player.nome + " desistiu da ideia e passou a ter outros objetivos na vida e desistiu do "+
            " seu sonho");
            System.exit(0);

        }else{
            player.perguntaramimir(escaneador);
        }

        System.out.println("No outro dia me levanto e depois das aulas vou até a academia de box, chagando lá eu conheço ele");
        System.out.println("Eu pergunto seu nome, mass ele tem um ar de arrogancia e superioridade e me ignora!");
        System.out.println("Qual o nome do seu rival?");
        rival.nome = escaneador.nextLine();

        System.out.println("O mestre disse que ele se chama " + rival.nome + " e que ele é uma grande promessa no país");
        System.out.println(rival.nome +"  olhou para mim e depois perguntou para o mestre se a academia "+
            "estava aceitando perdedores.");
        System.out.println("Eu não consegui me conter de raiva e pedi para lutar com ele");
        System.out.println("Ele aceitou, e disse que ia me mostrar que eu não servia para estar ali");
        System.out.println("O mestre advertiu ele e a mim, pois ele disse que eu não sabia nem o básico"+
            " para ter um sparring");
        System.out.println("O mestre me disse que iria me treinar e que em 1 mês ele me deixaria lutar com ele!");

        System.out.println("");
        System.out.println("CAPÍTULO II");
        System.out.println("");

        System.out.println("Chegou o grande dia, e desde o segundo dia nuca fiu com a cara do "+ rival.nome);
        System.out.println("Eu treinei muito!!!");
        System.out.println("Eu sei que ele treina a mais tempo que ele é uma grande promessa,"+
            " mass eu não ligo para nada disso");
        System.out.println("Eu só sinto que preciso acabar com a arrogancia desse cara!!!");
        System.out.println("Chegando na academia eu vi ele já no ringue com suas luvas e proteção só me esperando");
        System.out.println("O mestre disse que ia ser o juiz e que iria mediar tudo");
        System.out.println("E assim nossa rivalidade começou, nossa luta começou!!!");
        player.primeiraluta(escaneador, rival);
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
