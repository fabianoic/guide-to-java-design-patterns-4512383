package com.example;

import java.util.HashMap;
import java.util.function.Supplier;

public class FactoryMaker {

  private static final HashMap<String, Supplier<ColorFactory>> colorMap = new HashMap<>();

  static {
    colorMap.put("BLUE", UserBlueFactory::new);
    colorMap.put("RED", UserRedFactory::new);
  }

  public static ColorFactory userMaker(String color) {
    if (colorMap
        .get(color) != null) {
      return colorMap
          .get(color).get();
    }
    throw new IllegalArgumentException("The color is invalid.");
  }
}
