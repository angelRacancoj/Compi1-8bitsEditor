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
public class colorMaker {

    String name;
    color itsColor;

    public colorMaker(String name, color itsColor) {
        this.name = name;
        this.itsColor = itsColor;
    }

    public colorMaker() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public color getItsColor() {
        return itsColor;
    }

    public void setItsColor(color itsColor) {
        this.itsColor = itsColor;
    }

}
