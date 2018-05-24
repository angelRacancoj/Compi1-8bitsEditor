/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageneditor.backEnd.AuxObjects;

import imageneditor.backEnd.Objects.variable;
import java.util.LinkedList;

/**
 *
 * @author angel
 */
public class auxPaintToFile {

    LinkedList<auxPaintList> lienzoInstructions = new LinkedList<>();
    LinkedList<variable> listVaribles = new LinkedList<>();

    public auxPaintToFile() {
    }

    public void addVar(String name, int value) {
        listVaribles.add(new variable(name, value));
    }

    public variable getVar(int index) {
        return listVaribles.get(index);
    }

    public auxPaintList getPaintIstruction(String owner) {
        for (auxPaintList lienzoInstruction : lienzoInstructions) {
            if (lienzoInstruction.getOwner().equals(owner)) {
                return lienzoInstruction;
            }
        }
        return null;
    }

    public void addPaintIstruction(String owner, String nameColor, int posX, int posXend, int posY, int posYend) {
        lienzoInstructions.add(new auxPaintList(owner));
        getPaintIstruction(owner).addAuxPaint(nameColor, posX, posXend, posY, posYend);
    }

    public LinkedList<auxPaintList> getLienzoInstructions() {
        return lienzoInstructions;
    }

    public void setLienzoInstructions(LinkedList<auxPaintList> lienzoInstructions) {
        this.lienzoInstructions = lienzoInstructions;
    }

    public LinkedList<variable> getListVaribles() {
        return listVaribles;
    }

    public void setListVaribles(LinkedList<variable> listVaribles) {
        this.listVaribles = listVaribles;
    }

}
