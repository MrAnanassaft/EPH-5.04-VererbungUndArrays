package model;

public class Schulperson {
    protected String name;
    protected int alter;
    protected Kurs[] kurse;

    public Schulperson(String name, int alter){
        this.name = name;
        this.alter = alter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public void addKurs(Kurs neuerKurs) {
        //TODO Hinzufügen eines Kurses, den ein Schüler aufsuchen muss.
        Kurs[] neueKurse = new Kurs[kurse.length+1];
        for (int i = 0; i < kurse.length; i++)
            neueKurse[i] = kurse[i];
        neueKurse[kurse.length] = neuerKurs;
        kurse = neueKurse;
    }

}
