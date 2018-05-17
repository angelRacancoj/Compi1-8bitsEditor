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
public class instruccionsP {

    lienzoObj owner;
    LinkedList<variable> variblesList = new LinkedList<>();
    LinkedList<paint> paintlist = new LinkedList<>();

    public instruccionsP(lienzoObj owner) {
        this.owner = owner;
    }

    /**
     * this method add an variable to the variableList
     *
     * @param newVar
     */
    public void addVariable(variable newVar) {
        variblesList.add(newVar);
    }

    /**
     * this method add the complete entry list of variables into variables list
     *
     * @param newVariableEntry
     */
    public void addVariable(LinkedList<variable> newVariableEntry) {
        variblesList.addAll(newVariableEntry);
    }

    /**
     * this method add a paint object into paints list
     *
     * @param newPaint
     */
    public void addPaint(paint newPaint) {
        paintlist.add(newPaint);
    }

    /**
     * this method add the complete entry list of paints into paints list
     *
     * @param newPaintList
     */
    public void addPaint(LinkedList<paint> newPaintList) {
        paintlist.addAll(newPaintList);
    }

    public lienzoObj getOwner() {
        return owner;
    }

    public void setOwner(lienzoObj owner) {
        this.owner = owner;
    }

    public LinkedList<variable> getVariblesList() {
        return variblesList;
    }

    public void setVariblesList(LinkedList<variable> variblesList) {
        this.variblesList = variblesList;
    }

    public LinkedList<paint> getPaintlist() {
        return paintlist;
    }

    public void setPaintlist(LinkedList<paint> paintlist) {
        this.paintlist = paintlist;
    }

}
