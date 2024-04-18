/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoologico;

/**
 *
 * @author Dell
 */
public class RegistroAlimentacion {
    private Animal animal;
    private String horario;
    private String alimento;
 
    public RegistroAlimentacion(Animal animal, String horario, String alimento) {
        this.animal = animal;
        this.horario = horario;
        this.alimento = alimento;
    }
 
    public Animal getAnimal() {
        return animal;
    }
 
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
 
    public String getHorario() {
        return horario;
    }
 
    public void setHorario(String horario) {
        this.horario = horario;
    }
 
    public String getAlimento() {
        return alimento;
    }
 
    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }
 
    public String toString() {
        return "Animal: " + animal.getNombre() + ", Horario: " + horario + ", Alimento: " + alimento;
    }
}