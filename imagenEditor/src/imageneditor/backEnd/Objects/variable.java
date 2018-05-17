/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageneditor.backEnd.Objects;

/**
 *
 * @author angel
 */
public class variable {

    String name;
    int value;

    public variable(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public variable(String name) {
        this.name = name;
        this.value = 0;
    }

    /**
     * this method modify the value of the variable, adding the "to Add" to the
     * actual value
     *
     * @param toAdd
     */
    public void addToValue(int toAdd) {
        value += toAdd;
    }

    /**
     * this method modify the value of the variable, lessing the "to Add" to the
     * actual value
     *
     * @param toLess
     */
    public void lessToValue(int toLess) {
        value -= toLess;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}
