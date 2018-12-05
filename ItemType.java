/******************************************************************************
 * File:    ItemType.java
 * Author:  Andrews, Hannah 
 * Class:   COP3003; 201809; 80601
 * Purpose: Enum that stores the 4 pre-set types of items
 * Source:  Code written based on specifications provided in Oracle Academy's
 *          OraclProduction document. All rights for the document and
 *          specifications belong to Oracle.
 *******************************************************************************/

/**
 * Enum that defines the 4 types of items.
 *
 * @author Andrews, Hannah
 */
public enum ItemType {

  AUDIO("AU"),
  VISUAL("VI"),
  AUDIO_MOBILE("AM"),
  VISUAL_MOBILE("VM");

  public final String code;

  /**
   * The enum constructor that takes a String and assigns it to a field.
   *
   * @param code String parameter that is assigned to the field code
   */
  ItemType(String code) {
    this.code = code;
  }
}
