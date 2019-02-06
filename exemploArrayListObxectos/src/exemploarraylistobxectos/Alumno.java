/**
 * Gabriel P.
 * CPR Daniel Castelao
 * @author gpietrafesavieitez
 */

package exemploarraylistobxectos;

import java.util.Objects;

public class Alumno implements Comparable { // Implementamos interfaz Comparable
    private String nome, dni;
    private int nota;

    public Alumno() {
    }

    public Alumno(String nome, String dni, int nota) {
        this.nome = nome;
        this.dni = dni;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nome=" + nome + ", dni=" + dni + ", nota=" + nota + '}';
    }
    
    @Override
    public int compareTo(Object t){ 
        Alumno a = (Alumno)t; 
        if(this.nome.compareToIgnoreCase(a.nome) > 0){
            return 1;
        }else if(this.nome.compareToIgnoreCase(a.nome) < 0){
            return -1;
        }else{
            return 0;
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.nome);
        return hash;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }
}