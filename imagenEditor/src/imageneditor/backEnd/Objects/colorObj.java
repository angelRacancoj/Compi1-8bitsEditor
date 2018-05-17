/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageneditor.backEnd.Objects;

import java.util.LinkedList;

/**
 *
 * @author angel
 */
public class colorObj {

    lienzoObj owner;
    LinkedList<colorMaker> colorList = new LinkedList<>();

    public colorObj(lienzoObj owner) {
        this.owner = owner;
    }

    public colorObj() {
    }

    /**
     * this method add an color element inside of the colors list
     *
     * @param colorToAdd
     */
    public void addColor(colorMaker colorToAdd) {
        colorList.add(colorToAdd);
    }

    /**
     * this method add all elements inside of entry list into de colors list
     *
     * @param entryColors
     */
    public void addColor(LinkedList<colorMaker> entryColors) {
        colorList.addAll(colorList);
    }

    public boolean isColorListEmpty() {
        return colorList.isEmpty();
    }

    public int colorListSize() {
        return colorList.size();
    }

    public void clearColorList() {
        colorList.clear();
    }

    public lienzoObj getOwner() {
        return owner;
    }

    public void setOwner(lienzoObj owner) {
        this.owner = owner;
    }

    public LinkedList<colorMaker> getColorList() {
        return colorList;
    }

    public void setColorList(LinkedList<colorMaker> colorList) {
        this.colorList = colorList;
    }

}
