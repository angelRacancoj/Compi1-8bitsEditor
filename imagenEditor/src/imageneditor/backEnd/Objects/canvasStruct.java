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
public class canvasStruct {

    String path;
    LinkedList<lienzoObj> lienzos = new LinkedList<>();

    public canvasStruct(String path) {
        this.path = path;
    }

    public void clear() {
        path = "";
        lienzos.clear();
    }

    public canvasStruct() {
    }

    /**
     * check at the lienzos list using the ID
     *
     * if don't find a coincidence return null
     *
     * @param id
     * @return lienzoOj
     */
    public lienzoObj findLienzo(String id) {
        for (lienzoObj lienzo : lienzos) {
            if (lienzo.getId().equals(id)) {
                return lienzo;
            }
        }
        return null;
    }

    /**
     * use the entry Id to verify if already exist the lienzo if it exist at the
     * list return true
     *
     * @param id
     * @return true
     */
    public boolean existLienzo(String id) {
        for (lienzoObj lienzo : lienzos) {
            if (lienzo.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    /**
     * This method add an element "lienzo" into de list of "lienzos"
     *
     * @param lienzoToAdd
     */
    public void addlienzoObj(lienzoObj lienzoToAdd) {
        lienzos.add(lienzoToAdd);
    }

    /**
     * This method add all elements inside of a list of "lienzos"
     *
     * @param entryList
     */
    public void addLienzoObj(LinkedList<lienzoObj> entryList) {
        lienzos.addAll(lienzos);
    }

    public int lienzosListSize() {
        return lienzos.size();
    }

    public boolean lienzosListEmpty() {
        return lienzos.isEmpty();
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public LinkedList<lienzoObj> getLienzos() {
        return lienzos;
    }

    public void setLienzos(LinkedList<lienzoObj> lienzos) {
        this.lienzos = lienzos;
    }

}
