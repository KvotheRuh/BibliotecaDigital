public class Ebook extends ItemBibliotecaDigital{
    
    public Ebook(String nome, String autor) {
        super(nome,autor);

    }

    public void baixar(){
        System.out.println("O ebook " + getNome()  + " foi baixado!!");
    }

    
    
    public String descricao(){
        return "Livro: " + getNome() + "\nAutor: " + getAutor();
    }
}
