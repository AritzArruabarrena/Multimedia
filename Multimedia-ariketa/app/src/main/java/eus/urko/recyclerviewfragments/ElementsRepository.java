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
        elements.add(new Element(R.mipmap.remiro, "Álvaro Odriozola","2","\n" + "\n" + "Álvaro Odriozola Arzallus (Donostia, Gipuzkoa, 1995eko abenduaren 14a) Espainiako Lehen Mailako Realean jokatzen duen futbolaria da.\n"));
        elements.add(new Element(R.mipmap.remiro, "Aihen Muñoz","3","\n" + "\n" + "Aihen Muñoz Capellan (Echauri, Nafarroa, 1997ko abuztuaren 16a) espainiar futbolaria da. Defentsan jokatzen du eta bere taldea Espainiako Lehen Mailako Real Sociedad de Fútbol da.\n"));
        elements.add(new Element(R.mipmap.remiro, "Igor Zubeldia","5","\n" + "\n" + "\n" + "Igor Zubeldia Elorza (Azkoitia, Gipuzkoa, 1997ko martxoaren 30a) futbolari espainiarra da. Erdilari edo defentsa gisa jokatzen du eta bere taldea Espainiako Lehen Mailako Real Sociedad de Fútbol da.\n" + "\n"));
        elements.add(new Element(R.mipmap.remiro, "Aritz Elustondo","6","\n" + "\n" + "\n" + "Aritz Elustondo Irribarria (Beasain, Gipuzkoa, 1994ko martxoaren 28a) futbolari espainiarra da. Defentsan jokatzen du eta bere taldea Espainiako Lehen Mailako Real Sociedad de Fútbol da.\n"));
        elements.add(new Element(R.mipmap.remiro, "Kieran Tierney","17","\n" + "\n" + "\n" + "Kieran Tierney (Douglas, Man uhartea, Erresuma Batua, 1997ko ekainaren 5a) Espainiako Lehen Mailako Real Sociedad futbol taldean jokatzen duen futbolaria da.\n"));
        elements.add(new Element(R.mipmap.remiro, "Hamaori Traore","18","\n" + "\n" + "\n" + "Kieran Tierney (Douglas, Man uhartea, Erresuma Batua, 1997ko ekainaren 5a) Espainiako Lehen Mailako Real Sociedad futbol taldean jokatzen duen futbolaria da.\n"));
        elements.add(new Element(R.mipmap.remiro, "Kieran Tierney","17","\n" + "\n" + "\n" + "Kieran Tierney (Douglas, Man uhartea, Erresuma Batua, 1997ko ekainaren 5a) Espainiako Lehen Mailako Real Sociedad futbol taldean jokatzen duen futbolaria da.\n"));
        elements.add(new Element(R.mipmap.remiro, "Kieran Tierney","17","\n" + "\n" + "\n" + "Kieran Tierney (Douglas, Man uhartea, Erresuma Batua, 1997ko ekainaren 5a) Espainiako Lehen Mailako Real Sociedad futbol taldean jokatzen duen futbolaria da.\n"));
        elements.add(new Element(R.mipmap.remiro, "Kieran Tierney","17","\n" + "\n" + "\n" + "Kieran Tierney (Douglas, Man uhartea, Erresuma Batua, 1997ko ekainaren 5a) Espainiako Lehen Mailako Real Sociedad futbol taldean jokatzen duen futbolaria da.\n"));
        elements.add(new Element(R.mipmap.remiro, "Kieran Tierney","17","\n" + "\n" + "\n" + "Kieran Tierney (Douglas, Man uhartea, Erresuma Batua, 1997ko ekainaren 5a) Espainiako Lehen Mailako Real Sociedad futbol taldean jokatzen duen futbolaria da.\n"));
        elements.add(new Element(R.mipmap.remiro, "Kieran Tierney","17","\n" + "\n" + "\n" + "Kieran Tierney (Douglas, Man uhartea, Erresuma Batua, 1997ko ekainaren 5a) Espainiako Lehen Mailako Real Sociedad futbol taldean jokatzen duen futbolaria da.\n"));
        elements.add(new Element(R.mipmap.remiro, "Kieran Tierney","17","\n" + "\n" + "\n" + "Kieran Tierney (Douglas, Man uhartea, Erresuma Batua, 1997ko ekainaren 5a) Espainiako Lehen Mailako Real Sociedad futbol taldean jokatzen duen futbolaria da.\n"));


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
