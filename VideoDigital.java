public class VideoDigital extends ItemBibliotecaDigital implements Vizualizavel, Baixavel {

    public VideoDigital(String nome, String autor) {
        super(nome,autor);
        
    }


    public void vizualizar(){
        System.out.println("O video esta sendo vizualizado!!");
    }


    public void baixar(){
        System.out.println("O video " + getNome() + " foi baixado!!" );
    }
    
    public String descricao(){
        return "Livro: " + getNome() + "\nAutor: " + getAutor() ; 
    }
}