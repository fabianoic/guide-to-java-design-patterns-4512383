package com.example;

public class CoachRoom extends RoomDecorator {

  public CoachRoom(Room room) {
    super(room);
  }

  @Override
  public void printFurniture() {
    super.printFurniture();
    System.out.println("couch");
  }
}
