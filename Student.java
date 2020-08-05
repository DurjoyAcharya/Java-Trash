/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package object.oriented.programming;

/**
 *
 * @author Durjoy_Acharya<da-durjoy@outlook.com>
 */
import java.util.Date;
public class Student {
private int id;
private String name;
public Student(int ssn,String newName){
id=ssn;
name=newName;
}
public int getId(){
return id;
}
public String getName(){
return name;
}
}

