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
public class colorsStruct {

    String path;
    LinkedList<colorObj> listLienzosColors = new LinkedList<>();

    public colorsStruct(String path) {
        this.path = path;
    }

    public colorsStruct() {
    }

    /**
     * This method add an element into de Lienzo's colors list
     *
     * @param lienzoCl
     */
    public void addLienzoColor(colorObj lienzoCl) {
        listLienzosColors.add(lienzoCl);
    }

    /**
     * This method all elements inside of the lienzoColorList entry into de
     * Lienzo's colors list
     *
     * @param lienzoColorList
     */
    public void addLienzoColor(LinkedList<colorObj> lienzoColorList) {
        lienzoColorList.addAll(lienzoColorList);
    }

    public boolean LienzosColorsListIsEmpty() {
        return listLienzosColors.isEmpty();
    }

    public int LienzosColorsListSize() {
        return listLienzosColors.size();
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public LinkedList<colorObj> getListLienzosColors() {
        return listLienzosColors;
    }

    public void setListLienzosColors(LinkedList<colorObj> listLienzosColors) {
        this.listLienzosColors = listLienzosColors;
    }
}
