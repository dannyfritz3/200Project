/*
 * File: LocationDescription.java
 */

import java.util.*;
/**
 * Put an appropriate class header here
 * 
 * @authors Danny Fritz and Nick Pegelow
 * @version April 20, 2017
 */
public class LocationDescription {
  
  /**
   * Creates a new planet description with the specified name and title.
   * 
   * @param name the name of the planet
   * @param visited whether or not the planet has been visited
   * @param hostile whether or not the planet is hostile
   * @param population the population of the planet
   * @param description the desciption of the planet
   * @param race the race native to the planet
   */
  
  private String name;
  private boolean visited;
  private boolean hostile;
  private int population;
  private String description;
  private String race;
  
  public LocationDescription(String name, boolean visited, boolean hostile, int population, String desctiption, String race) {
    
    this.name = name;
    this.visited = visited;
    this.hostile = hostile;
    this.population = population;
    this.description = description;
    this.race = race;
  }

  /**
   * A method that gets the name of the planet
   * 
   * @returns name the name of the planet
   */
  public String getName()
  {
    return this.name;
  }
  
  /**
   * A method that gets whether or not the planet has been visited
   * 
   * @returns true if the planet has been visited
   */
  public boolean isVisited()
  {
    return this.visited;
  }
  
  /**
   * A method that gets whether or not the planet is hostile
   * 
   * @returns true if the planet is hostile
   */
  public boolean isHostile()
  {
    return this.hostile;
  }
  
  /**
   * A method that gets the population of the planet
   * 
   * @returns date the population of the planet
   */
  public int getPopulation()
  {
    return this.population;
  }
  
  /**
   * A method that gets the native race of the planet
   * 
   * @returns the native race of the planet
   */
  public String getRace()
  {
    return this.race;
  }
  
  /**
   * A method that gets the description of the planet
   * 
   * @returns description the description of the planet
   */
  public String getDescription()
  {
    return this.description;
  }
  
  /**
   * A method that sets the description of the planet
   * 
   * @param description the new description of the planet
   */
  public void setDescription(String description)
  {
    this.description = description;
  }
  
  /**
   * A method that sets the population of the planet
   * 
   * @param population the new population of the planet
   */
  public void setPopulation(char population)
  {
    this.population = population;
  }
  
  public void setRace(String race)
  {
    this.race = race;
  }
  /**
   * A method that prints out the entire description of a planet
   * 
   * @returns String the entire description of the planet
   */
  public String toString()
  {
    return "Name: " + name + "\nVisited: " + visited + "\nHostile: " + hostile + "\nPopulation: " + population + "\nDescription" + description + "\nRace: " + race;
  }
  // add another constructor with takes in parameters for ALL class fields

  // Put in necessary get() and set() methods
  
}
