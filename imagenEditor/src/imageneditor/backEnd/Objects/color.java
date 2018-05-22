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
public class color {

    int red;
    int green;
    int blue;
    String hexa;

    public color(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public color(String hexa) {
        this.hexa = hexa;
        this.red = DefaultValue.NO_INICIO_DIMENSION;
        this.green = DefaultValue.NO_INICIO_DIMENSION;
        this.blue = DefaultValue.NO_INICIO_DIMENSION;
    }

    public color() {
    }

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }

    public String getHexa() {
        return hexa;
    }

    public void setHexa(String hexa) {
        this.hexa = hexa;
    }

}
