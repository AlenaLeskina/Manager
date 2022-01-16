package ru.netology.manager;

import ru.netology.domain.MovieInfo;

public class Manager {
    int countMovies = 10;

    public Manager(int countMovies) {
        this.countMovies = countMovies;
    }

    public Manager() {
    }

    private MovieInfo[] movies = new MovieInfo[0];

    public void addMovie(MovieInfo movie) {
        int length = movies.length + 1;
        MovieInfo[] tmp = new MovieInfo[length];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        tmp[length - 1] = movie;
        movies = tmp;
    }

    public MovieInfo[] getMovies() {
        int newSize = countMovies;
        if (newSize >= movies.length)
            newSize = movies.length;
        MovieInfo[] result = new MovieInfo[newSize];
        int index = 0;
        for (int i = movies.length - 1; i >= 0 && index < countMovies; i--) {
            result[index] = movies[i];
            index++;
        }
        return result;
    }
}
