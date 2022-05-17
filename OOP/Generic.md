class AnimalList<T> {

    ArrayList<T> al = new ArrayList<T>();

 

    public static void cryingAnimalList(AnimalList<? extends LandAnimal> 
al) {

        LandAnimal la = al.get(0);

        la.crying();

    }

 

    void add(T animal) { al.add(animal); }

    T get(int index) { return al.get(index); }

    boolean remove(T animal) { return al.remove(animal); }

    int size() { return al.size(); }

}

 

public class Generic03 {

    public static void main(String[] args) {

        AnimalList<Cat> catList = new AnimalList<Cat>();

        catList.add(new Cat());

        AnimalList<Dog> dogList = new AnimalList<Dog>();

        dogList.add(new Dog());

 

        AnimalList.cryingAnimalList(catList);

        AnimalList.cryingAnimalList(dogList);

    }

}

