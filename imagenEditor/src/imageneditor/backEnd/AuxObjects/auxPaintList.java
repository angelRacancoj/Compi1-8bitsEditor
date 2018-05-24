/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageneditor.backEnd.AuxObjects;

import java.util.LinkedList;

/**
 *
 * @author angel
 */
public class auxPaintList {

    String owner;
    LinkedList<AuxPaint> paintList = new LinkedList<>();

    public auxPaintList(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void addAuxPaint(String colorName, int posX, int posXend, int posY, int posYend) {
        paintList.add(new AuxPaint(colorName, posX, posXend, posY, posYend));
    }

    public AuxPaint getAuxPaint(int index) {
        return paintList.get(index);
    }

    public LinkedList<AuxPaint> getPaintList() {
        return paintList;
    }

    public void setPaintList(LinkedList<AuxPaint> paintList) {
        this.paintList = paintList;
    }

}
