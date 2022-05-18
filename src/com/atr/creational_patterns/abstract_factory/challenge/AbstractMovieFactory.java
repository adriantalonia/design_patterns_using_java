package com.atr.creational_patterns.abstract_factory.challenge;

public abstract class AbstractMovieFactory {
    abstract Hollywood getHollywoodMovie(String type);
    abstract Bollywood getBollywoodMovie(String type);
}

class HollywoodFactory extends AbstractMovieFactory {

    @Override
    Hollywood getHollywoodMovie(String type) {
        if (type == null) {
            return null;
        }

        switch (type) {
            case "COMEDY":
                return new HollywoodComedyMovie();
            case "ACTION":
                return new HollywoodActionMovie();
            default:
                throw new IllegalArgumentException("Unknown type " + type);
        }
    }

    @Override
    Bollywood getBollywoodMovie(String type) {
        return null;
    }
}

class BollywoodFactory extends AbstractMovieFactory {

    @Override
    Hollywood getHollywoodMovie(String type) {
        return null;
    }

    @Override
    Bollywood getBollywoodMovie(String type) {
        if (type == null) {
            return null;
        }

        switch (type) {
            case "COMEDY":
                return new BollywoodComedyMovie();
            case "ACTION":
                return new BollywoodActionMovie();
            default:
                throw new IllegalArgumentException("Unknown type " + type);
        }
    }
}

class ActionMovieFactory extends AbstractMovieFactory {

    @Override
    Hollywood getHollywoodMovie(String type) {
        return new HollywoodActionMovie();
    }

    @Override
    Bollywood getBollywoodMovie(String type) {
        return new BollywoodActionMovie();
    }
}

class ComedyMovieFactory extends AbstractMovieFactory {

    @Override
    Hollywood getHollywoodMovie(String type) {
        return new HollywoodComedyMovie();
    }

    @Override
    Bollywood getBollywoodMovie(String type) {
        return new BollywoodComedyMovie();
    }
}