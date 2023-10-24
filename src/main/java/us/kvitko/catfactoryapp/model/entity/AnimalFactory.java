package us.kvitko.catfactoryapp.model.entity;

public class AnimalFactory {

    private static AnimalFactory instance = null;

    public static AnimalFactory getInstance() {
        if (instance == null) {
            instance = new AnimalFactory();
        }
        return instance;
    }

    public AnimalFactory() {
    }
}

