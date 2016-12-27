package com.company;


class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie {
    public Jaws() {
        super("Jaws"); //setting movie name for Jaws class
    }

    public String plot() {
        return "A shark eats lots of people";
    }
}//jaws

class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("IndependenceDay"); //setting movie name for IndependenceDay class
    }

    public String plot() {
        return "Aliens attempt to take over planet earth";
    }
}

class MazeRunner extends Movie {
    public MazeRunner() {
        super("MazeRunner"); //setting movie name for MazeRunner class
    }

    public String plot() {
        return "Kids try and escape a maze";
    }
}

class StarWars extends Movie {
    public StarWars() {
        super("StarWars"); //setting movie name for StarWars class
    }

    public String plot() {
        return "Imperial Forces try to take over the Universe";
    }
}

class ForgetableMovie extends Movie {
    public ForgetableMovie() {
        super("ForgetableMovie"); //setting movie name for ForgetableMovie class
    }
}



public class Main {

    public static void main(String[] args) {
	// write your code here

        for (int i = 0; i < 11; i++) {
            Movie movie = randomMovie();
            System.out.println("\nMovie # " + (i + 1) + " : " + movie.getName() + "\nPlot: " + movie.plot());
        }

    }

    //return type of Movie class
    public static Movie randomMovie() { //get random movie method of the Movie class
        int randomNumber = (int) (Math.random() * 5 ) + 1; //default a double
//        System.out.println("Random number generated was " + randomNumber);

        switch (randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars ();
            case 5:
                return new ForgetableMovie ();
        }
        return null;
    }
}
