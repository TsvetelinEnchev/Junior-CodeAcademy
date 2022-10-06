package Exercises_From_StartIt.homework_1.exercise_CarFactory;

public enum EngineType {
  DIESEL("diesel"), PETROL("petrol"), HYBRID("hybrid"), ELECTRICAL("electrical");
  String typeEngine;
  EngineType(String typeEngine) {
    this.typeEngine = typeEngine;
  }

  public String getTypeEngine() {
    return typeEngine;
  }

  public void setTypeEngine(String typeEngine) {
    this.typeEngine = typeEngine;
  }
}
