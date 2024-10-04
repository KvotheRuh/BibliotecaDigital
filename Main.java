public class Main {
    public static void main(String[] args) {
        Ebook ebook1 = new Ebook("Livro X", "Autor A");
        Ebook ebook2 = new Ebook("Livro Y", "Autor B");
        
        VideoDigital video = new VideoDigital("Video Z", "Autor C");
        VideoDigital video2 = new VideoDigital("Video V", "Autor D");


        System.out.println(ebook1.descricao());
        System.out.println(ebook2.descricao());
        System.out.println(video.descricao());



        ebook1.baixar();
        ebook2.baixar();
        video.vizualizar();
        video2.baixar();

    }
}