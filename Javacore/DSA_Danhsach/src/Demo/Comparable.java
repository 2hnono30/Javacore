package Demo;


    // A Java program to demonstrate use of Comparable
import java.util.*;

    // A class 'Movie' that implements Comparable
    class MoVie implements Comparable<MoVie>
    {
        private double rating;
        private String name;
        private int year;

        // Used to sort movies by year
        public int compareTo(MoVie m)
        {
            return this.year - m.year;
        }

        // Constructor
        public MoVie(String nm, double rt, int yr)
        {
            this.name = nm;
            this.rating = rt;
            this.year = yr;
        }

        // Getter methods for accessing private data
        public double getRating() { return rating; }
        public String getName() { return name; }
        public int getYear()	 { return year; }
    }

    // Driver class
    class main
    {
        public static void main(String[] args)
        {
            ArrayList<MoVie> list = new ArrayList<MoVie>();
            list.add(new MoVie("Force Awakens", 8.3, 2015));
            list.add(new MoVie("Star Wars", 8.7, 1977));
            list.add(new MoVie("Empire Strikes Back", 8.8, 1980));
            list.add(new MoVie("Return of the Jedi", 8.4, 1983));

            Collections.sort(list);

            System.out.println("Movies after sorting : ");
            for (MoVie movie: list)
            {
                System.out.println(movie.getName() + " " +
                        movie.getRating() + " " +
                        movie.getYear());
            }
        }
    }
