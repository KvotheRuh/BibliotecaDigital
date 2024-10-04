public abstract class ItemBibliotecaDigital {
    private String nome;
    private String autor;

    public ItemBibliotecaDigital(String nome, String autor){
        this.nome = nome;
        this.autor = autor;
    }

    public String getNome(){
        return nome;
    }

    public String getAutor(){
        return autor;
    }

    public abstract String descricao();
    
}
