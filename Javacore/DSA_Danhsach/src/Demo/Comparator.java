package Demo;

//A Java program to demonstrate Comparator interface

import java.util.*;

// A class 'Movie' that implements Comparable

class Movie implements Comparable<MoVie> {
    private double rating;
    private String name;

    private int year;

    // Used to sort movies by year
    public int compareTo(MoVie m) {
        return this.year - m.getYear();
    }

    // Constructor
    public Movie(String nm, double rt, int yr) {
        this.name = nm;
        this.rating = rt;
        this.year = yr;
    }

    // Getter methods for accessing private data
    public double getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }
}

// Class to compare Movies by ratings
class RatingCompare implements Comparator<MoVie> {
    public int compare(MoVie m1, MoVie m2) {
        if (m1.getRating() < m2.getRating()) return -1;
        if (m1.getRating() > m2.getRating()) return 1;
        else return 0;
    }
}

// Class to compare Movies by name
class NameCompare implements Comparator<MoVie> {
    public int compare(MoVie m1, MoVie m2) {
        return m1.getName().compareTo(m2.getName());
    }
}

// Driver class
class main1 {
    public static void main(String[] args) {
        var list = new ArrayList<MoVie>();
        list.add(new MoVie("Force Awakens", 8.3, 2015));
        list.add(new MoVie("Star Wars", 8.7, 1977));
        list.add(new MoVie("Empire Strikes Back", 8.8, 1980));
        list.add(new MoVie("Return of the Jedi", 8.4, 1983));

        // Sort by rating : (1) Create an object of ratingCompare
        //				 (2) Call Collections.sort
        //				 (3) Print Sorted list
        System.out.println("Sorted by rating");
        RatingCompare ratingCompare = new RatingCompare();
        Collections.sort(list, ratingCompare);
        for (MoVie movie : list)
            System.out.println(movie.getRating() + " " +
                    movie.getName() + " " +
                    movie.getYear());


        // Call overloaded sort method with RatingCompare
        // (Same three steps as above)
        System.out.println("\nSorted by name");
        NameCompare nameCompare = new NameCompare();
        Collections.sort(list, nameCompare);
        for (MoVie movie : list)
            System.out.println(movie.getName() + " " +
                    movie.getRating() + " " +
                    movie.getYear());

        // Uses Comparable to sort by year
        System.out.println("\nSorted by year");
        Collections.sort(list);
        for (MoVie movie : list)
            System.out.println(movie.getYear() + " " +
                    movie.getRating() + " " +
                    movie.getName() + " ");
    }
}
