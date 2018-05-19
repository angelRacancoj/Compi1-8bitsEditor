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
public class paintStruct {

    String path;
    LinkedList<variable> variablesList = new LinkedList<>();
    LinkedList<instruccionsP> instruccionList = new LinkedList<>();

    public paintStruct(String path) {
        this.path = path;
    }

    /**
     * verify if already exist an instruction searching by the lienzo's name
     *
     * @param owner
     * @return
     */
    public instruccionsP findIsntruccionsP(String owner) {
        for (instruccionsP instruccionList1 : instruccionList) {
            if (instruccionList1.getOwner().getId().equals(owner)) {
                return instruccionList1;
            }
        }
        return null;
    }

    /**
     * verify if the variable exist in the variables list and return de variable
     *
     * @param name
     * @return variable
     */
    public variable findVariable(String name) {
        for (variable variablesList1 : variablesList) {
            if (variablesList1.getName().equals(name)) {
                return variablesList1;
            }
        }
        return null;
    }

    /**
     * verify if the variable exist in the variables list
     *
     * @param name
     * @return true
     */
    public boolean existVariable(String name) {
        if (!variablesList.isEmpty()) {
            for (int i = 0; i < variablesList.size(); i++) {
                if (variablesList.get(i).name.equals(name)) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * this method return the variable value, but it don't recognize if it
     * exist, because return 0 if don't find something
     *
     * @param name
     * @return
     */
    public int getVaribleValue(String name) {
        if (!variablesList.isEmpty()) {
            for (int i = 0; i < variablesList.size(); i++) {
                if (variablesList.get(i).name.equals(name)) {
                    return variablesList.get(i).getValue();
                }
            }
        }
        return 0;
    }

    /**
     * this method add an variable to the variableList
     *
     * @param newVar
     */
    public void addVariable(variable newVar) {
        variablesList.add(newVar);
    }

    /**
     * this method add the complete entry list of variables into variables list
     *
     * @param newVariableEntry
     */
    public void addVariable(LinkedList<variable> newVariableEntry) {
        variablesList.addAll(newVariableEntry);
    }

    /**
     * this method add an instruction to the instructionList
     *
     * @param instructToAdd
     */
    public void addInstruccion(instruccionsP instructToAdd) {
        instruccionList.add(instructToAdd);
    }

    /**
     * this method add the complete entry list of instructionList into
     * instructionList list
     *
     * @param entryInstruccions
     */
    public void addInstrccion(LinkedList<instruccionsP> entryInstruccions) {
        instruccionList.addAll(instruccionList);
    }

    public LinkedList<variable> getVariablesList() {
        return variablesList;
    }

    public void setVariablesList(LinkedList<variable> variablesList) {
        this.variablesList = variablesList;
    }

    public LinkedList<instruccionsP> getInstruccionList() {
        return instruccionList;
    }

    public void setInstruccionList(LinkedList<instruccionsP> instruccionList) {
        this.instruccionList = instruccionList;
    }

}
