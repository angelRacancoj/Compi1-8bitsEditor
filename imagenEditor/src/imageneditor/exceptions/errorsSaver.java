/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageneditor.exceptions;

import java.util.LinkedList;

/**
 *
 * @author angel
 */
public class errorsSaver {

    String canvasPath;
    LinkedList<String> canvasError;
    String colorsPath;
    LinkedList<String> colorError;
    String paintPath;
    LinkedList<String> paintError;

    public errorsSaver(String canvasPath, LinkedList<String> canvasError, String colorsPath, LinkedList<String> colorError, String paintPath, LinkedList<String> paintError) {
        this.canvasPath = canvasPath;
        this.canvasError = canvasError;
        this.colorsPath = colorsPath;
        this.colorError = colorError;
        this.paintPath = paintPath;
        this.paintError = paintError;
    }

    public void clearList() {
        canvasError.clear();
        colorError.clear();
        paintError.clear();
    }

    public errorsSaver() {
    }

    public String getCanvasPath() {
        return canvasPath;
    }

    public void setCanvasPath(String canvasPath) {
        this.canvasPath = canvasPath;
    }

    public void addCanvasError(String error) {
        canvasError.addLast(error);
    }

    public String getCanvasError(int index) {
        return canvasError.get(index);
    }

    public LinkedList<String> getCanvasError() {
        return canvasError;
    }

    public void setCanvasError(LinkedList<String> canvasError) {
        this.canvasError = canvasError;
    }

    public String getColorsPath() {
        return colorsPath;
    }

    public void setColorsPath(String colorsPath) {
        this.colorsPath = colorsPath;
    }

    public void addColorError(String error) {
        colorError.addLast(error);
    }

    public String getColorError(int index) {
        return colorError.get(index);
    }

    public LinkedList<String> getColorError() {
        return colorError;
    }

    public void setColorError(LinkedList<String> colorError) {
        this.colorError = colorError;
    }

    public String getPaintPath() {
        return paintPath;
    }

    public void setPaintPath(String paintPath) {
        this.paintPath = paintPath;
    }

    public void addPaintError(String error) {
        paintError.addLast(error);
    }

    public String getPaintError(int index) {
        return paintError.get(index);
    }

    public LinkedList<String> getPaintError() {
        return paintError;
    }

    public void setPaintError(LinkedList<String> paintError) {
        this.paintError = paintError;
    }

}
