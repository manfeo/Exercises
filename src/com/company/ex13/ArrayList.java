package com.company.ex13;

public class ArrayList<T> {
    private Object[] array;

    ArrayList(){
    }

    ArrayList(int n){
        array = new Object[n];
    }

    public void add(T value){
        Object[] tempArray = new Object[(array == null ? 1 : array.length + 1)];
        if (array != null)
            System.arraycopy(array, 0, tempArray, 0, array.length);
        tempArray[tempArray.length - 1] = value;
        array = tempArray.clone();
    }

    public void add(int index, T value){
        if (array == null ? true : index >= array.length){
            Object[] newArray = new Object[index + 1];
            if (array != null)
                System.arraycopy(array,0,newArray,0,array.length);
            newArray[index] = value;
            array = new Object[newArray.length];
            array = newArray.clone();
        }
        array[index] = value;
    }

    @Override
    public String toString(){
        if (array != null){
            if (array.length > 0) {
                String strToReturn = "[ ";
                for (int i = 0; i < array.length; i++) {
                    strToReturn += (i != 0 ? ", " + array[i] : array[i]);
                }
                return strToReturn + " ]";
            }
        }
        return "[]";
    }

    public boolean contains(T value){
        if (array != null)
            for (Object iterator : array)
                if (iterator == value)
                    return true;
        return false;
    }

    public Object get(int index){
        if (array != null)
            return (index > array.length ? null : array[index]);
        return null;
    }

    public boolean isEmpty(){
        return array == null;
    }

    public void remove(int index){
        if (array != null)
            if (array.length > index) {
                Object[] tempArray = new Object[array.length - 1];
                System.arraycopy(array, 0, tempArray, 0, index);
                System.arraycopy(array, index + 1, tempArray, index, array.length - 1 - index);
                array = new Object[array.length - 1];
                array = tempArray.clone();
                return;
            }
        System.out.println("Нельзя убрать этот элемент");
    }

    public void clear(){
        array = null;
    }

    public int size(){
        return (array == null ? 0 : array.length);
    }
}
