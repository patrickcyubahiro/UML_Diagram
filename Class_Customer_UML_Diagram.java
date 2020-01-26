/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Patrick CYUBAHIRO
 */
public class Customer {
    private int ID;
    private String Name;
    private char Gender;
public Customer (int newID, String newName, char newGender)
{
this.ID = newID;
this.Name = newName;
this.Gender = newGender;
}
public void setID(int newID)
{
this.ID = newID;
}
public void SetName(String newName)
{
this.Name = newName;
}
public void SetGender(char newGender)
{
this.Gender = newGender;
}
public int GetID()
{
return ID;
}
public String GetName()
{
return Name;
}
public char Gender()
{
return Gender;
}
}
