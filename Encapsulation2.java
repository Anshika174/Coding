public class Encapsulation2 {
    public static void main(String args[]){
          ImmutableBook book1=new ImmutableBook("harry potter","jk rowling");
          System.out.println(book1.getTitle());
          System.out.println(book1.getAuthor());
    }
}
class ImmutableBook{
    private final String title;
    private  final  String author;
    ImmutableBook(String title,String author){
        this.title=title;
        this.author=author;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    

}
