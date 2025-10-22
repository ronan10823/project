package So;

public class Book {
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public void borrow() {
        if (isAvailable) {
            isAvailable=false;
            System.out.println(title+" 대출 완료");
        } else {
            System.out.println("이미 대출 중입니다");
        }
    }

    public void returnBook(){
        isAvailable=true;
        System.out.println(title+" 반납완료");
    }

    public void showInfo(){
        System.out.println("제목: "+title+", 저자: "+author+", 대출가능: "+isAvailable);
    }
}
