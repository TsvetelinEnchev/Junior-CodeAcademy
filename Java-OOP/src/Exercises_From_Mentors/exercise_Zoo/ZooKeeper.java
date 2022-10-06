package Exercises_From_Mentors.exercise_Zoo;

import java.util.List;

public class ZooKeeper {

  private List<Animal> animalList;

  public List<Animal> getAnimalList() {
    return animalList;
  }

  public void setAnimalList(List<Animal> animalList) {
    this.animalList = animalList;
  }

  public void feedAnimal(String name) {

    for (Animal animal : animalList
    ) {
      if (animal.getName().equals(name)) {
        animal.eat();
      }
    }
  }

}