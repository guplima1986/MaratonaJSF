package br.com.maratonajsf.devdojo.bean;

import br.com.maratonajsf.devdojo.model.Estudante;

import javax.inject.Named;
import java.io.Serializable;
import java.util.*;

@Named
public class EstudanteRegistarBean implements Serializable {

    private Estudante estudante = new Estudante();

    private String[] arrayNomes = {"Gustavo", "Pereira", "De", "Lima"};

    private List<String> listNomes = Arrays.asList("Estuda", "Seu", "Danado");

    private Set<String> nomesSet = new HashSet<>(Arrays.asList("E Não funciona","Vamos", "Testar", "o", "Set", "De Novo"));

    private Map<String, String> nomesMaps =  new HashMap<>();

    {
        nomesMaps.put("Gustavo", "O estudante");
        nomesMaps.put("Willian", "O professor");
        nomesMaps.put("Conhecimento", "O bem mais valioso");
    }


    public Map<String, String> getNomesMaps() {
        return nomesMaps;
    }

    public void setNomesMaps(Map<String, String> nomesMaps) {
        this.nomesMaps = nomesMaps;
    }

    public Set<String> getNomesSet() {
        return nomesSet;
    }

    public void setNomesSet(Set<String> nomesSet) {
        this.nomesSet = nomesSet;
    }

    public List<String> getListNomes() {
        return listNomes;
    }

    public void setListNomes(List<String> listNomes) {
        this.listNomes = listNomes;
    }

    public String[] getArrayNomes() {
        return arrayNomes;
    }

    public void setArrayNomes(String[] arrayNomes) {
        this.arrayNomes = arrayNomes;
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }
}
