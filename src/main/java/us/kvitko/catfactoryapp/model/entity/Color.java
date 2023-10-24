package us.kvitko.catfactoryapp.model.entity;

public enum Color {
    GREY(20),
    BLACK(40),
    ORANGE(30),
    WHITE(10);

    private int popularity;

    Color(int popularity) {
        this.popularity = popularity;
    }

    public int getPopularity() {
        return popularity;
    }
}