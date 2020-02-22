package com.example.fragment;

public class Dog {

    private String breed;
    private String origin;
    private int image;

    public Dog(String breed, String origin, int image){
        this.breed = breed;
        this.origin = origin;
        this.image = image;
    }

    // Creating the array of dogs
    public static final Dog[] dogs = {
            new Dog("German Shepherd", "Germany", R.drawable.german_shepherd),
            new Dog("Golden Retriever", "England", R.drawable.golden_retriever),
            new Dog("Corgi", "Wales", R.drawable.corgi),
            new Dog("Shiba Inu", "Japan", R.drawable.shiba),
            new Dog("Jack Russell Terrier", "England", R.drawable.jack_russell),
            new Dog("Pomeranian", "Germany/Poland", R.drawable.pomeranian),
            new Dog("Pug", "China", R.drawable.pug),
            new Dog("Husky", "Siberia", R.drawable.husky),
            new Dog("Poodle", "Germany/France", R.drawable.poodle)
    };

    /* Getters */

    public String getBreed() {
        return breed;
    }

    public String getOrigin() {
        return origin;
    }

    public int getImage() {
        return image;
    }
}
