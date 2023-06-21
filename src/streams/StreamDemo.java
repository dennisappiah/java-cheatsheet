package streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/* Stream is a way to get a collection of data in functional way*/
public class StreamDemo {

    public static void main(String[] args) {
        show();
    }
    public static void  show(){
        List<Movie> movies = List.of(
                new Movie("movie1", 4, Genre.ACTION),
                new Movie("movie2", 19, Genre.ACTION),
                new Movie("movie3", 10, Genre.THRILLER)
        );

    // get count movies with likes greater than 10
    var count = movies.stream()
            .filter(movie -> movie.getLikes() >= 10).count();

    System.out.println(count);

    // get list of likes from the Movies array
    movies.stream().map(Movie::getLikes).forEach(System.out::println);

    // get  movies with likes greater than 10
    movies.stream()
        .filter(movie -> movie.getLikes() >= 10)
        .forEach(movie -> System.out.println(movie.getTitle()));

    // 1000 movies
    // 10 movies per page
    // 3rd page
    // Skip(20) -> Skip((page-1) * pageSize)
    // limit(10)

   movies.stream()
            .skip(20)
            .limit(10)
            .forEach(movie -> System.out.println(movie.getTitle()));

    // sorting movies by title in descending order
    movies.stream()
            .sorted(Comparator.comparing(Movie::getTitle).reversed())
            .forEach(movie -> System.out.println(movie.getTitle()));

    // get unique likes of Movies -> 4,19, 10
    movies.stream().map(Movie::getLikes).distinct().forEach(System.out::println);


    // get movies, map out the likes and filter by movies with likes greater than 10
    movies.stream()
            .map(Movie::getLikes)
            .filter(likes -> likes >= 10)
            .forEach(System.out::println);

    // Single reducers -> count, anyMatch, allMatch, noneMatch, findFirst, findAny, max, min
    var isLike20 = movies.stream().anyMatch(movie -> movie.getLikes() > 20); //returns boolean

    var result = movies.stream().findFirst().get();
    System.out.println("firstElement= "+ result.getTitle());

    var maxLike = movies.stream().max(Comparator.comparing(Movie::getLikes)).get();
    var minLike = movies.stream().min(Comparator.comparing(Movie::getLikes)).get();

    System.out.println("Maximum like= "+ maxLike.getTitle());
    System.out.println("Minimum like= "+ minLike.getTitle());


    // reducing a stream ([10,20,30] -> 60)

        var sum = movies.stream().map(Movie::getLikes).reduce((a, b) -> a+b);
        System.out.println(sum.orElse(0));

    // collecting results to a data structure
    var outcome = movies.stream()
                   .filter(movie -> movie.getLikes() > 10)
                   .collect(Collectors.toMap(Movie::getTitle, Movie::getLikes));

        System.out.println(outcome);

    // Grouping elements
    var groupedElements = movies.stream()
            .collect(Collectors.groupingBy(Movie::getGenre, Collectors.counting()));

    var grouped = movies.stream()
                .collect(Collectors.groupingBy(Movie::getGenre,
                        Collectors.mapping(Movie::getTitle, Collectors.joining(","))));

    System.out.println(groupedElements);

    }
}
