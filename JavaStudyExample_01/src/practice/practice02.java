package practice;
import java.util.ArrayList;
import java.util.Scanner;

// 도서 클래스
class Book {
    private String title;
    private String author;
    private boolean isAvailable;

    // 생성자
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    // 책 대여
    public boolean borrow() {
        if (isAvailable) {
            isAvailable = false;
            return true;
        }
        return false;
    }

    // 책 반납
    public void returnBook() {
        isAvailable = true;
    }

    // 책 정보 출력
    @Override
    public String toString() {
        return String.format("제목: %s, 저자: %s, 대여 가능: %s", 
                title, author, isAvailable ? "가능" : "불가능");
    }
}

// 도서 관리 클래스
class Library {
    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    // 도서 추가
    public void addBook(Book book) {
        books.add(book);
    }

    // 도서 목록 출력
    public void showBooks() {
        if (books.isEmpty()) {
            System.out.println("등록된 도서가 없습니다.");
        } else {
            for (int i = 0; i < books.size(); i++) {
                System.out.println((i + 1) + ". " + books.get(i));
            }
        }
    }

    // 도서 대여
    public void borrowBook(int index) {
        if (index < 0 || index >= books.size()) {
            System.out.println("유효하지 않은 번호입니다.");
            return;
        }

        Book book = books.get(index);
        if (book.borrow()) {
            System.out.println("대여 완료: " + book);
        } else {
            System.out.println("이미 대여 중입니다.");
        }
    }

    // 도서 반납
    public void returnBook(int index) {
        if (index < 0 || index >= books.size()) {
            System.out.println("유효하지 않은 번호입니다.");
            return;
        }

        Book book = books.get(index);
        book.returnBook();
        System.out.println("반납 완료: " + book);
    }
}

// 메인 클래스
public class practice02 {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        // 기본 도서 추가
        library.addBook(new Book("자바의 정석", "남궁성"));
        library.addBook(new Book("Effective Java", "Joshua Bloch"));
        library.addBook(new Book("Clean Code", "Robert C. Martin"));

        while (true) {
            System.out.println("\n=== 도서 관리 시스템 ===");
            System.out.println("1. 도서 목록 보기");
            System.out.println("2. 도서 대여");
            System.out.println("3. 도서 반납");
            System.out.println("4. 종료");
            System.out.print("메뉴 선택: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    library.showBooks();
                    break;
                case 2:
                    library.showBooks();
                    System.out.print("대여할 도서 번호를 입력하세요: ");
                    int borrowIndex = scanner.nextInt() - 1;
                    library.borrowBook(borrowIndex);
                    break;
                case 3:
                    library.showBooks();
                    System.out.print("반납할 도서 번호를 입력하세요: ");
                    int returnIndex = scanner.nextInt() - 1;
                    library.returnBook(returnIndex);
                    break;
                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    scanner.close();
                    return;
                default:
                    System.out.println("잘못된 입력입니다. 다시 선택하세요.");
            }
        }
    }
}
