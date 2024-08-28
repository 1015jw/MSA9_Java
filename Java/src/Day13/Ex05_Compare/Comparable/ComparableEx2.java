package Day13.Ex05_Compare.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Movie implements Comparable<Movie> {

    String title;
    String author;
    int price;

    public Movie() {
        this("제목없음", "감독미상", 0);
    }

    public Movie(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Movie [title=" + title + ", author=" + author + ", price=" + price + "]";
    }
    
    @Override
    public int compareTo(Movie o) {
        // 제목순으로 오름차순
        return this.title.compareTo(o.title);
    }

}

public class ComparableEx2 {
    public static void main(String[] args) {
        List<Movie> movieList = new ArrayList<>();
        movieList.add(new Movie("범죄도시", "장첸", 50000));
        movieList.add(new Movie("파일럿", "조정석", 30000));
        movieList.add(new Movie("인셉션", "디카프리오", 20000));
        movieList.add(new Movie("베테랑", "황정민", 40000));
        movieList.add(new Movie("타짜", "조승우", 10000));
        
        // 정렬 전
        System.out.println(" * 정렬 전");
        for (Movie movie : movieList) {
            System.out.println(movie);
        }
        System.out.println("----------------------------------------------");
        
        // 정렬
        Collections.sort(movieList);
        
        // 정렬 후
        System.out.println("* 정렬 후");
        for (Movie movie : movieList) {
            System.out.println(movie);
        }
        System.out.println("----------------------------------------------");
    }
}
