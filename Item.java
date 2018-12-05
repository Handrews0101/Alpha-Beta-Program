/******************************************************************************
 * File:    Item.java
 * Author: Andrews, Hannah 
 * Class:   COP3003
 *******************************************************************************/

import java.util.Date;

/**
 * Interface that contains the functions all items must have.
 *
 * @author Andrews, Hannah
 */
public interface Item {

  public final String manufacturer = "OracleProduction";

  /**
   * Sets the production number of the item.
   *
   * @param productionNumber The production number. Must be an int.
   */
  public void setProductionNumber(int productionNumber);

  /**
   * Sets the name of the item.
   *
   * @param name The name of the item.
   */
  public void setName(String name);

  /**
   * Gets the name of the item.
   *
   * @return Can return a String.
   */
  public String getName();

  /**
   * Gets the manufacture date of the item.
   *
   * @return Returns a Date.
   */
  public Date getManufactureDate();

  /**
   * Gets the serial number of the item.
   *
   * @return Returns an int.
   */
  public int getSerialNumber();

}
