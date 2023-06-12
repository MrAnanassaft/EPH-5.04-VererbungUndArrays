package model;

import control.MainController;

/**
 * Created by Jean-Pierre on 10.05.2017.
 */
public class Schueler extends Schulperson{

    //Attribute


    //Referenzen

    private Tadel[] tadelDesSchuelers = new Tadel[0];

    /**
     * Ein Objekt der Klasse Schüler.
     * @param name
     * @param alter
     */
    public Schueler(String name, int alter) {
        super(name, alter);
    }



    /**
     * Ein Kurs wird der Menge der Kurse hinzugefügt.
     * Da wir auf der Datenstruktur Array arbeiten und diese eine statische Größe hat, müssen wir tricksen.
     * Überlegt euch etwas kluges!
     * @param neuerKurs
     */


    /**
     * Ein Tadel wird der Menge der Tadel hinzugefügt.
     * Da wir auf der Datenstruktur Array arbeiten und diese eine statische Größe hat, müssen wir tricksen.
     * Überlegt euch etwas kluges!
     * @param neuerTadel
     */
    private void addTadel(Tadel neuerTadel){
        //TODO Hinzufügen eins Tadels für den Schüler.
        Tadel[] neueTadel = new Tadel[tadelDesSchuelers.length+1];
        for (int i = 0; i < tadelDesSchuelers.length; i++)
            neueTadel[i] = tadelDesSchuelers[i];
        neueTadel[kurse.length] = neuerTadel;
        tadelDesSchuelers = neueTadel;
    }

    /**
     * Methode erstellt aus den Informationen zum Schüler (Name, Alter, Kurse, Tadel) eine kompakte Information
     * und gibt diese als String zurück.
     * @return
     */
    public String getInfo(){
        String info = getName() + ", " + getAlter() + ", Tadel: " + tadelDesSchuelers.length + ", Kurse: " + kurse.length;
        //TODO Kompakte Zeichenkette zu den Informationen eines Schülers - gut lesbar!
        return info;
    }
}
