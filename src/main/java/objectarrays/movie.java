package objectarrays;

import java.util.Arrays;
import java.util.stream.Collector;

public class movie {
    private int yearReleased;
    private double rating;
    private int budget;
    private int collectionAmount;

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    private String tittle;

    public int getYearReleased() {

        return yearReleased;
    }

    public void setYearReleased(int yearReleased) {

        this.yearReleased = yearReleased;
    }

    public double getRating() {

        return rating;
    }

    public void setRating(double rating) {

        this.rating = rating;
    }

    public int getBudget() {

        return budget;
    }

    public void setBudget(int budget) {

        this.budget = budget;
    }

    public int getCollectionAmount() {

        return collectionAmount;
    }

    public void setCollectionAmount(int collectionAmount) {

        this.collectionAmount = collectionAmount;
    }

    movie(String tittle,int yearReleased, double rating, int budget, int collectionAmount ){
        this.yearReleased=yearReleased;
        this.rating=rating;
        this.budget=budget;
        this.collectionAmount=collectionAmount;
        this.tittle=tittle;

    }














    public static void main(String arg[]){

        // Create an unsorted array of Person objects
        movie[] movies_List = {
                new movie("Movie1", 2001, 7.8, 2345678,3456789),
                new movie("Movie2", 1998, 6.5, 2345678,4567894),
                new movie("Movie3", 2010, 6.8, 3456789,7890765)
        };

        // Sorting by rating and profit
       // Arrays.sort(movies_List, new RatingAndProfitComparator());
        System.out.println("Sorted by Rating and Profit:");
        for (movie movie1 : movies_List) {
            System.out.println(movie1.tittle + " - Rating: " + movie1.rating + ", Profit: " + (movie1.collectionAmount - movie1.budget));
        }
    }
}
