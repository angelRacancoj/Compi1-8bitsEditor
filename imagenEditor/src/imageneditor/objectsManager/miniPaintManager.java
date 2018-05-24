/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageneditor.objectsManager;

import imageneditor.backEnd.AuxObjects.AuxPaint;

/**
 *
 * @author angel
 */
public class miniPaintManager {

    AuxPaint auxPaint;

    public miniPaintManager(AuxPaint auxPaint) {
        this.auxPaint = auxPaint;
    }

    public AuxPaint getAuxPaint() {
        return auxPaint;
    }

    public void setAuxPaint(AuxPaint auxPaint) {
        this.auxPaint = auxPaint;
    }

}
