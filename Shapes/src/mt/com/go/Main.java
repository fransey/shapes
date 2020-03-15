package mt.com.go;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Array <Shape> shapes = new Array[10]();
    int user_input;

    do {
      printMenu();
      user_input = readUserChoice();
      chooseOptions(user_input, shapes);
    } while (user_input != 5);
  }

  public static void printMenu() {

    System.out.println("Menu");
    System.out.println("1. Enter block");
    System.out.println("2. Enter sphere");
    System.out.println("3. Enter pyramid");
    System.out.println("4. Show data");
    System.out.println("5. Exit");
  }

  public static void chooseOptions(int userChoice, ArrayList<Shape> shapes) {

    switch (userChoice) {
      case 1:
        System.out.println("Enter block length, width and height");
        Block block = new Block();
        block.setLength(readUserInput());
        block.setWidth(readUserInput());
        block.setHeight(readUserInput());
        shapes.add(block);
        break;

      case 2:
        System.out.println("Enter sphere radius");
        Sphere sphere = new Sphere();
        sphere.setRadius(readUserInput());
        shapes.add(sphere);
        break;

      case 3:
        System.out.println("Enter pyramid length, width and height");
        Pyramid pyramid = new Pyramid();
        pyramid.setLength(readUserInput());
        pyramid.setWidth(readUserInput());
        pyramid.setHeight(readUserInput());
        shapes.add(pyramid);
        break;

      case 4:
        showData(shapes);
        break;

      case 5:
        System.out.println("Exiting");
        break;
    }
  }

  private static double readUserInput() {
    Scanner user_input = new Scanner(System.in);
    return user_input.nextDouble();
  }

  private static int readUserChoice() {
    Scanner user_choice = new Scanner(System.in);
    return user_choice.nextInt();
  }

  public static void showData(ArrayList<Shape> shapes) {
    for (int i = 0; i < shapes.size(); i++) {
      System.out.println(
          "Volume of Shape "
              + shapes.get(i).getClass().getSimpleName()
              + " is "
              + shapes.get(i).getVolume());
    }
  }
}
