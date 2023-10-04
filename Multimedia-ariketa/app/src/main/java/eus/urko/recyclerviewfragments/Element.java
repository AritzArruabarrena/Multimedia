package eus.urko.recyclerviewfragments;

public class Element {
        String name;
        String description;

        String dorsal;
        int image;

        public Element(int image, String name,String dorsal ,String description) {
            this.name = name;
            this.dorsal = dorsal;
            this.description = description;
            this.image=image;
    }
}
