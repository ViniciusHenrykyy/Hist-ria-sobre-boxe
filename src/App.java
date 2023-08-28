import java.io.File;
import java.util.HashMap;
import java.util.Map;
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
        player.setNome(escaneador.nextLine());
        System.out.println("Qual o nome do seu rival?");
        rival.setNome(escaneador.nextLine());
        Map < String,Capitulo > listaCapitulo = new HashMap < String,Capitulo > ();
        File save = new File("Rsc/data.txt");
        Scanner savScanner = new Scanner(save,"UTF-8");
        while(savScanner.hasNextLine()){
            String linha = savScanner.nextLine();
            if (linha.equalsIgnoreCase("Capitulo")){
                String nome = savScanner.nextLine();
                int setAlteracaoDeEnergia = Integer.parseInt(savScanner.nextLine());
                int setAlteracaoDeHp = Integer.parseInt(savScanner.nextLine());
                String rivalString = savScanner.nextLine();
                String narrativaString = savScanner.nextLine();
                Capitulo tempCapitulo = new Capitulo(player, escaneador,rival);
                tempCapitulo.setNarrativa(narrativaString);
                tempCapitulo.setAlteracaoDeEnergia(setAlteracaoDeEnergia);
                tempCapitulo.setAlteracaoDeHp(setAlteracaoDeHp);
                listaCapitulo.put(nome,tempCapitulo);
            }else if(linha.equalsIgnoreCase("Escolha")){
                String origem = savScanner.nextLine();
                String escolha = savScanner.nextLine();
                String destino = savScanner.nextLine();
                listaCapitulo.get(origem).adicionarescolha(new Escolha(escolha, listaCapitulo.get(destino)));
            } else if (linha.equalsIgnoreCase("CapituloImagem")){
                String nome = savScanner.nextLine();
                int setAlteracaoDeEnergia = Integer.parseInt(savScanner.nextLine());
                int setAlteracaoDeHp = Integer.parseInt(savScanner.nextLine());
                String rivalString = savScanner.nextLine();
                String narrativaString = savScanner.nextLine();
                String lerlinha = "";
                String imagem = "";
                while(!lerlinha.equalsIgnoreCase("Fim")){
                    imagem += lerlinha + "\n";
                    lerlinha = savScanner.nextLine();
                }
                Capituloimagem tempCapitulo = new Capituloimagem (player, escaneador,rival);
                tempCapitulo.setNarrativa(narrativaString);
                tempCapitulo.setAlteracaoDeEnergia(setAlteracaoDeEnergia);
                tempCapitulo.setAlteracaoDeHp(setAlteracaoDeHp);
                tempCapitulo.setImagem(imagem);
                listaCapitulo.put(nome,tempCapitulo);
            }
        }
        listaCapitulo.get("1").executar();
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
