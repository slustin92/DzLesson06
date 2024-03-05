package dz;


import java.util.Map;
import java.util.Objects;

public class Notebook {
    private int ram;
    private int hddCapacity;
    private String opSystem;
    private String color;

    public Notebook(int ram, int hddCapacity, String opSystem, String color) {

        this.ram = ram;
        this.hddCapacity = hddCapacity;
        this.opSystem = opSystem;
        this.color = color;
    }

    public int getRam() {
        return ram;
    }

    public int getHddCapacity() {
        return hddCapacity;
    }
    public String getOpSystem(){
        return opSystem;
    }

    public String getColor() {
        return color;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setHddCapacity(int hddCapacity) {
        this.hddCapacity = hddCapacity;
    }

    public void setOpSystem(String opSystem){
        this.opSystem = opSystem;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ram, hddCapacity);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        Notebook notebook = (Notebook) obj;

        return ram == notebook.ram &&
               hddCapacity == notebook.hddCapacity && 
               opSystem.equals(notebook.opSystem) &&
               color.equals(notebook.color);
    }

    @Override
    public String toString() {
        return "Оперативка: " + ram + ", " +
                "Жесткий диск: " + hddCapacity + ", " +
                "система: " + opSystem + ", " +
                "Цвет: " + color;

    }
}
