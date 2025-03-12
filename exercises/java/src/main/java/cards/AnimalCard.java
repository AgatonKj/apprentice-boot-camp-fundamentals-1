package cards;

public class AnimalCard extends Card{

    private final Animal animal;

    public AnimalCard(Animal animal) {
        this.animal = animal;
    }

    @Override
    public boolean snap( Card otherCard ){
        return otherCard != null && this.animal.equals( ((AnimalCard)otherCard).animal);
    }

    @Override
    public String toString() {
        return animal.toString();
    }
}
