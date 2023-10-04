package eus.urko.recyclerviewfragments;

import java.util.ArrayList;
import java.util.List;

public class ElementsRepository {

    List<Element> elements = new ArrayList<>();

    public interface Callback {
        void whenFinish(List<Element> elements);
    }
    ElementsRepository(){
        elements.add(new Element(R.mipmap.remiro, "Álex Remiro","1","\n" + "Alejandro Remiro Gargallo (Cascante, Nafarroa, 1995eko martxoaren 24a) Espainiako Lehen Mailako Real Sociedad de Futbol taldean atezain jokatzen duen futbolaria da.\n"));
        elements.add(new Element(R.mipmap.odriozola, "Álvaro Odriozola","2","\n" + "\n" + "Álvaro Odriozola Arzallus (Donostia, Gipuzkoa, 1995eko abenduaren 14a) Espainiako Lehen Mailako Realean jokatzen duen futbolaria da.\n"));
        elements.add(new Element(R.mipmap.aihen, "Aihen Muñoz","3","\n" + "\n" + "Aihen Muñoz Capellan (Echauri, Nafarroa, 1997ko abuztuaren 16a) espainiar futbolaria da. Defentsan jokatzen du eta bere taldea Espainiako Lehen Mailako Real Sociedad de Fútbol da.\n"));
        elements.add(new Element(R.mipmap.igorzubeldia, "Igor Zubeldia","5","\n" + "\n" + "\n" + "Igor Zubeldia Elorza (Azkoitia, Gipuzkoa, 1997ko martxoaren 30a) futbolari espainiarra da. Erdilari edo defentsa gisa jokatzen du eta bere taldea Espainiako Lehen Mailako Real Sociedad de Fútbol da.\n" + "\n"));
        elements.add(new Element(R.mipmap.aritzelustondo, "Aritz Elustondo","6","\n" + "\n" + "\n" + "Aritz Elustondo Irribarria (Beasain, Gipuzkoa, 1994ko martxoaren 28a) futbolari espainiarra da. Defentsan jokatzen du eta bere taldea Espainiako Lehen Mailako Real Sociedad de Fútbol da.\n"));
        elements.add(new Element(R.mipmap.tierney, "Kieran Tierney","17","\n" + "\n" + "\n" + "Kieran Tierney (Douglas, Man uhartea, Erresuma Batua, 1997ko ekainaren 5a) Espainiako Lehen Mailako Real Sociedad futbol taldean jokatzen duen futbolaria da.\n"));
        elements.add(new Element(R.mipmap.traore, "Hamaori Traore","18","\n" + "\n" + "\n" + "\n" + "Hamari Traoré (Bamako, Maliko, 1992ko urtarrilaren 27a) Espainiako Lehen Mailako Errealean defentsa jokatzen duen Maliko futbolaria da.\n"));
        elements.add(new Element(R.mipmap.jonpacheco, "Jon Pacheco","20","\n" + "\n" + "\n" + "\n" + "Jon Pacheco Dozagarat (Elizondo, Espainia, 2001eko urtarrilaren 8a) Espainiako Lehen Mailako Realarentzat defentsa jokatzen duen futbolari espainiarra da.\n"));
        elements.add(new Element(R.mipmap.robinlenormand, "Robin Le Normand","24","\n" + "\n" + "\n" + "\n" + "Robin Aime Robert Le Normand (Pabu, Costa de Armor, Frantzia, 1996ko azaroaren 11) frantziar futbolaria da. Defentsan jokatzen du eta bere taldea Espainiako Lehen Mailako Reala da.\n"));
        elements.add(new Element(R.mipmap.zubimendi, "Martin Zubimendi","4","\n" + "\n" + "\n" + "\n" + "Martín Zubimendi Ibáñez (Donostia, 1999ko otsailaren 2a) futbolari espainiarra da. Erdilari postuan jokatzen du eta bere taldea Espainiako Lehen Mailako Reala da\n"));
        elements.add(new Element(R.mipmap.mikelmerino, "Mikel Merino","8","\n" + "\n" + "\n" + "\n" + "Mikel Merino Zazón (Iruñea, Nafarroa, 1996ko ekainaren 22a) futbolari espainiarra da. Erdilari gisa jokatzen du eta bere taldea Espainiako Lehen Mailako Reala da.\n"));
        elements.add(new Element(R.mipmap.zakharian, "Arsen Zhakaryan","12","\n" + "\n" + "\n" + "\n" + "Arsen Norayrovich Zakharyan (Samara, Errusia, 2003ko maiatzaren 26a) errusiar futbolaria da, Espainiako Lehen Mailako Errealean jokatzen duena. Internazionala da Errusiako futbol selekzioarekin.\n"));
        elements.add(new Element(R.mipmap.olasagasti, "Jon Ander Olasagasti","16","\n" + "\n" + "\n" + "\n" + "Jon Ander Olasagasti Imizcoz (Donostia, Gipuzkoa, 2000ko abuztuaren 16a) futbolari espainiarra da, Real Sociedad B taldean jokatzen duena.\n"));
        elements.add(new Element(R.mipmap.turrientes, "Beñat Turrientes","22","\n" + "\n" + "\n" + "\n" + "\n" + "Beñat Turrientes Imaz (Beasain, Gipuzkoa, 2002ko urtarrilaren 31) Espainiako Lehen Mailako Errealean jokatzen duen futbolari espainiarra da.\n"));
        elements.add(new Element(R.mipmap.braismendez, "Brais Méndez","23","\n" + "\n" + "\n" + "\n" + "\n" + "Brais Méndez Portela (Mos, Pontevedra, 1997ko urtarrilaren 7a), Brais Méndez bezala ezagunagoa, Espainiako Lehen Mailako Errealean jokatzen duen futbolari espainiarra da.\n"));
        elements.add(new Element(R.mipmap.barrenetxea, "Ander Barrenetxea","7","\n" + "\n" + "\n" + "\n" + "\n" + "Ander Barrenetxea Muguruza (Donostia, Espainia, 2001eko abenduaren 27a) Espainiako Lehen Mailako Real Sociedad de Futbol taldean jokatzen duen futbolaria da.\n"));
        elements.add(new Element(R.mipmap.carlosfernandez, "Carloz Fernandez","9","\n" + "\n" + "\n" + "\n" + "\n" + "Carlos Fernández Luna (Castilleja de Guzmán, Sevilla, Espainia, 1996ko maiatzaren 22a) futbolari espainiarra da, Espainiako Lehen Mailako Real Sociedad taldean aurrelari gisa jokatzen duena.\n"));
        elements.add(new Element(R.mipmap.oyarzabal, "Mikel Oyarzabal","10","\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "Mikel Oyarzabal Ugarte (Ibar, Gipuzkoa, 1997ko apirilaren 21a) espainiar futbol jokalaria da, Espainiako Lehen Mailako Realean erdilari lanetan aritzen dena.\n"));
        elements.add(new Element(R.mipmap.mohamedcho, "Mohamed-Ali Cho","11","\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "Mohamed-Ali Cho (Stains, 2004ko urtarrilaren 19a), Momo Cho bezala ezagunagoa, Espainiako Lehen Mailako Real Sociedad taldean aurrelari bezala jokatzen duen futbolari frantziar bat da.\n"));
        elements.add(new Element(R.mipmap.takefusakubo, "Takefusa Kubo","14","\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "Takefusa Kubo (japonieraz Kubo Takefusa; Kawasaki, Kanagawa, Japonia, 2001eko ekainaren 4a) Espainiako Lehen Mailako Errealean jokatzen duen futbolari japoniarra da.\n"));
        elements.add(new Element(R.mipmap.sadiqumar, "Sadiq Umar","19","\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "Sadiq Umar Mesbah (Kaduna, 1997ko otsailaren 2a), Umar Sadiq bezala ezagunagoa, Espainiako Lehen Mailako Errealean aurrelari bezala jokatzen duen nigeriar futbolaria da.\n"));
        elements.add(new Element(R.mipmap.andresilva, "Andre Silva","21","\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "André Miguel Valente Silva (Gondomar, Oporto, Portugal, 1995eko azaroaren 6a) portugaldar futbolaria da eta Espainiako Lehen Mailako Realean jokatzen du.\n"));
        elements.add(new Element(R.mipmap.imanolalguacil, "Imanol Alguacil","","\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "Imanol Alguacil Barrenetxea (Orio, Gipuzkoa, 1971ko uztailaren 4a) futbolari ohi eta entrenatzaile espainiarra da, eta gaur egun Realeko lehen taldea zuzentzen du. Imanol bezala ezagutu zuten. 1990eko hamarkadan Real Sociedad eta Villarreal CF taldeetan eskuin hegaleko postuan jokatu zuen. Bi talde horiekin 121 partida jokatu zituen guztira Espainiako Lehen Mailan 9 denboralditan zehar\n"));


    }
    public List<Element> get() {
        return elements;
    }

    public void insert(Element element, Callback callback) {
        elements.add(element);
        callback.whenFinish(elements);
    }

    public void delete(Element element, Callback callback) {
        elements.remove(element);
        callback.whenFinish(elements);
    }


}
