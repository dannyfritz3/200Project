/*
 * File: GameLayout.java
 */

import java.util.*;
import java.io.*;

/**
 * This is a class that sets up the layout of the game
 * 
 * @authors Danny Fritz and Nick Pegelow
 * @version April 22, 2017
 */
public class GameLayout {
  
  /**
   * @attribute connections the connections to other planets
   * @attribute descriptions the descriptions of the planet
   */
  private Map<String, Set<String>> connections;
  private Map<String, LocationDescription> descriptions;
  
  /**
   * This counstructs a new GameLayout based off given text files of data
   *
   * @param fileDescriptions the text file for the planet descriptions
   * @param fileConnections the text file for the planet connections
   * @throws FileNotFoundException
   */
  public GameLayout(String fileDescriptions, String fileConnections)
  {
    try {
      Scanner scanner1 = new Scanner(new File(fileDescriptions));
      Scanner scanner2 = new Scanner(new File(fileConnections));
      
      while(scanner1.hasNext())
      {
        String value1 = scanner1.nextLine();
        while(!value1.equals("_"))
        {
          String name = scanner1.nextLine();
          boolean visited = scanner1.nextBoolean();
          boolean hostile = scanner1.nextBoolean();
          int population = Integer.parseInt(scanner1.nextLine());
          String description = scanner1.nextLine();
          String race = scanner1.nextLine();
          value1 = scanner1.nextLine();
          LocationDescription ld = new LocationDescription(name, visited, hostile, population, description, race);
          this.descriptions = new HashMap<String, LocationDescription>();
          this.descriptions.put(name, ld);
        }
      }
      
      while(scanner2.hasNext())
      {
        String locationName = scanner2.nextLine();
        int connections = Integer.parseInt(scanner2.nextLine());
        TreeSet<String> locations = new TreeSet<String>();
        String value2 = scanner1.nextLine();
        while(!value2.equals("_"))
        {
          locations.add(value2);
          value2 = scanner1.nextLine();
        }
        this.connections = new HashMap<String, Set<String>>();
        this.connections.put(locationName, locations);
      }
    }
    catch (FileNotFoundException fnfe) {
      System.err.println("File not found");
    }
  }
}