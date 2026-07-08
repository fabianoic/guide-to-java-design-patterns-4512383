package com.example;

import java.util.ArrayList;
import java.util.List;

public class LightExecutor {

  private List<LightOperation> lightOperations = new ArrayList<>();

  public void addLightOperation(LightOperation lightOperation) {
    lightOperations.add(lightOperation);
  }

  public void executeAll() {
    lightOperations.forEach(LightOperation::execute);
  }
}
