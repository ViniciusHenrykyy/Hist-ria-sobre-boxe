import java.util.Scanner;

public class Capituloimagem extends Capitulo{
    private String imagem;
    public void setImagem(String imagem) {
        this.imagem = imagem;
    }
    public Capituloimagem(personagem personagemPrincipal, Scanner escaneador, personagem ri) {
        super(personagemPrincipal, escaneador, ri);
    }
    @Override
    public void mostrar(){
        System.out.println(imagem);
        super.mostrar();
    }


  
}
