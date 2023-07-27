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

        Capitulo capitulo_1 = new Capitulo(player,escaneador);
        capitulo_1.narrativa = "Bem vindo " + player.nome + " acho que podemos começar com as posturas "+
        " de luta\n'Bem  você este  levando jeito pra coisa' disse  o  mestre!\nBom, vamos agora fazer "+
        "alguns exercicios de cardio para ajudar voce a ter mais resistencia\nChegando em casa morto de"+
        " cansado " + player.nome + " nao sente se ira aguentar os exercicios\n e pensa em desistir!";

        capitulo_1.alteracaoDeEnergia = 50; 
        Capitulo capitulo_1_1 = new Capitulo(player, escaneador);
        Capitulo capitulo_1_2 = new Capitulo(player, escaneador);
        capitulo_1.escolhas.add(new Escolha("Desistir", capitulo_1_1));
        capitulo_1.escolhas.add(new Escolha("Continuar", capitulo_1_2));
        capitulo_1_1.narrativa = player.nome + " desistiu da ideia e passou a ter outros objetivos na vida e desistiu do \n"+
        " seu sonho";
        capitulo_1_2.narrativa = "No outro dia me levanto e depois das aulas vou até a academia de box, chagando lá eu conheço ele\n" +
        "Eu pergunto seu nome, mass ele tem um ar de arrogancia e superioridade e me ignora!\n"+
        "O mestre disse que ele se chama " + rival.nome + " e que ele é uma grande promessa no país\n"+
         rival.nome + " olhou para mim e depois perguntou para o mestre se a academia "+   "estava aceitando perdedores.\n"+
        "Eu não consegui me conter de raiva e pedi para lutar com ele"+
        "Ele aceitou, e disse que ia me mostrar que eu não servia para estar ali\n"+
        "O mestre advertiu ele e a mim, pois ele disse que eu não sabia nem o básico"+ " para ter um sparring\n"+
        "O mestre me disse que iria me treinar e que em 1 mês ele me deixaria lutar com ele!\n"+                
        "Chegou o grande dia, e desde o segundo dia nunca fiu com a cara do "+ rival.nome +"\n"+
        "Eu treinei muito!!!\n"+
        "Eu sei que ele treina a mais tempo que ele é uma grande promessa,\n"+
            " mass eu não ligo para nada disso\n"+
        "Eu só sinto que preciso acabar com a arrogancia desse cara!!!\n"+
        "Chegando na academia eu vi ele já no ringue com suas luvas e proteção só me esperando\n"+
        "O mestre disse que ia ser o juiz e que iria mediar tudo\n"+
        "E assim nossa rivalidade começou, nossa luta começou!!!\n";

        Capitulo capitulo_2 = new Capitulo(player,escaneador);
        capitulo_1_2.escolhas.add(new Escolha("proximo", capitulo_2));
        capitulo_2.narrativa = rival.nome +" tenta acertar um gancho!!!";
        Capitulo capitulo_2_1 = new Capitulo(player, escaneador);
        Capitulo capitulo_2_2 = new Capitulo(player, escaneador);
        capitulo_2.escolhas.add(new Escolha("andar para tras", capitulo_2_1));
        capitulo_2.escolhas.add(new Escolha("desviar para o lado", capitulo_2_2)); 
        capitulo_2_1.narrativa = "Tomei um soco na altura do estomago e vomitei,\n e com vergonha fugi da situação e resolvi desistir de tudo";
        capitulo_2_1.alteracaoDeEnergia = 100;
        capitulo_2_2.narrativa = "pensei rápido numa aula que o mestre me deu sobre ganchos e andei para trás desviando";
        capitulo_2_1.alteracaoDeEnergia = 20;

        Capitulo capitulo_3 = new Capitulo(player,escaneador);
        capitulo_2_2.escolhas.add(new Escolha("proximo",capitulo_3));
        capitulo_3.narrativa = rival.nome +" vai tentar me acertar um direto!!!";
        Capitulo capitulo_3_1 = new Capitulo(player, escaneador);
        Capitulo capitulo_3_2 = new Capitulo(player, escaneador);
        capitulo_3.escolhas.add(new Escolha("andar para frente e revidar", capitulo_3_1));
        capitulo_3.escolhas.add(new Escolha("andar para o lado e revidar", capitulo_3_2));

        capitulo_3_1.narrativa = "Eu percebo que ele vai dar um direto eu jogo o meu corpo para o lado e tento\n"+
                " acerta-lo durante seu golpe, mas ele gira o quadril abaixa a cabeça e me acerta um direto bem\n"+
                " no meio do meu nariz, que fica sangrando e eu sinto muita dor, saio do ringue e o mestre  diz \n"+
                "que 'um aluno que não lembra do que o mestre dele o ensinou não deviar mais lutar, pois não tem \n"+
                "foco e concentração' depois disso peguei minhas coisas e desisti de tudo!!!\n";

        capitulo_3_1.alteracaoDeHp = 100;


        capitulo_3_2.narrativa = "Eu lembro do que o mestre me ensinou sobre:'contra golpes e diretos', eu encurto\n"+
                " a distância e jogo um gancho no queixo dele, ele me olha irritado e frustado por eu ter acertado\n"+ 
                " ele, então ele me diz:'chega de pegar leve', quando ele vinha para cima de mim com sague nos olhos\n"+
                " o mestre encerra a luta e diz que era vergonhoso uma atleta como ele que é considerado a promessa \n"+
                "do país tomar um soco de uma iniciante que está treinando a 1 mês, e que ele não anda treinando seus\n"+
                " fundamentos. Ele fica muito irritado e saí da academia sem falar mais nada só com um olhar frustado\n"+
                " e de raiva!!!";

        capitulo_3_1.alteracaoDeHp = 30;

        capitulo_1.executar();
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
        

        escaneador.close();
    }
}
