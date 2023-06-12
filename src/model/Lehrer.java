package model;

/**
 * Created by Jean-Pierre on 10.05.2017.
 */
public class Lehrer extends Schulperson{

    //Attribute

    protected String besoldungsGruppe;

    //Referenzen
    private Unterrichtsfach[] faecherDesLehrers = new Unterrichtsfach[0];

    /**
     * Ein Objekt der Klasse Lehrer wird erstellt.
     * @param name
     * @param alter
     * @param besoldungsGruppe    Gehaltsstufen von Lehrern
     */
    public Lehrer(String name, int alter, String besoldungsGruppe) {
        super(name, alter);
        this.besoldungsGruppe = besoldungsGruppe;
    }


    public String getBesoldungsGruppe() {
        return besoldungsGruppe;
    }

    public void setBesoldungsGruppe(String besoldungsGruppe) {
        this.besoldungsGruppe = besoldungsGruppe;
    }

    /**
     * Ein Kurs wird der Menge der Kurse hinzugefügt.
     * Da wir auf der Datenstruktur Array arbeiten und diese eine statische Größe hat, müssen wir tricksen.
     * Überlegt euch etwas kluges!
     * Sobald das Array erweitert wurde, muss dem Kurs noch mitgeteilt werden, dass dieser Lehrer den Kurs übernimmt.
     * @param neuerKurs
     */


    /**
     * Ein Fach wird der Menge der unterrichtenden Fächer hinzugefügt.
     * Da wir auf der Datenstruktur Array arbeiten und diese eine statische Größe hat, müssen wir tricksen.
     * Überlegt euch etwas kluges!
     * @param neuesFach
     */
    public void addFach(Unterrichtsfach neuesFach){
        //TODO Hinzufügen eines Faches, das ein Lehrer unterrichten kann.
        Unterrichtsfach[] neueUnterrichtsfaecher = new Unterrichtsfach[faecherDesLehrers.length+1];
        for (int i = 0; i < faecherDesLehrers.length; i++)
            neueUnterrichtsfaecher[i] = faecherDesLehrers[i];
        neueUnterrichtsfaecher[faecherDesLehrers.length] = neuesFach;
        faecherDesLehrers = neueUnterrichtsfaecher;
    }

    /**
     * Methode erstellt aus den Informationen zum Lehrer (Name, Alter, Besoldungsgruppe, Kurse, Fächer) eine kompakte Information
     * und gibt diese als String zurück.
     * @return
     */
    public String getInfo(){
        String info = "Name = " + getName() + "Alter = " + getAlter() + "Besoldungsgruppe = " + getBesoldungsGruppe() + "Wie viele fächer = " + faecherDesLehrers.length;
        //TODO Kompakte Zeichenkette zu den Informationen einer Lehrkraft - gut lesbar!
        return info;
    }
}
