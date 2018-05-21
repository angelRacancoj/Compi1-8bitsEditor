/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageneditor.backEnd.Objects;

import imageneditor.DefaultValue;

/**
 *
 * @author angel
 */
public class auxColor {

    String name;
    int red;
    int blue;
    int green;
    String hexa;

    public auxColor(String name, int red, int blue, int green) {
        this.name = name;
        this.red = red;
        this.blue = blue;
        this.green = green;
    }

    public auxColor(String name, String hexa) {
        this.name = name;
        this.hexa = hexa;
        this.red = DefaultValue.noInicioDimension;
        this.green = DefaultValue.noInicioDimension;
        this.blue = DefaultValue.noInicioDimension;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }

    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public String getHexa() {
        return hexa;
    }

    public void setHexa(String hexa) {
        this.hexa = hexa;
    }

}
