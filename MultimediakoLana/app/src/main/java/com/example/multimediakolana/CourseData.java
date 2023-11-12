    package com.example.multimediakolana;

    import java.util.ArrayList;
    import java.util.List;

    public class CourseData {
        private static ArrayList<Ekipoak> courseModelArrayList = new ArrayList<>();
        public static void addCourse(Ekipoak courseModel) {
            courseModelArrayList.add(courseModel);
        }

        public static ArrayList<Ekipoak> getCourseList() {
            return courseModelArrayList;
        }

        public static void initializeCourseList() {
            Ekipoak betis = new Ekipoak("Betis", R.mipmap.betis ,"El Real Betis Balompié, también conocido como Real Betis o simplemente Betis, es una entidad polideportiva con sede en Sevilla (España). Se fundó en septiembre de 1907 para la práctica del fútbol, aunque sus orígenes datan de 1907 y así consta como fecha fundacional por el propio club, y oficialmente se registró el 1 de febrero de 1908." );
            betis.addPlayer(new Jokalariak("Claudio Bravo", R.mipmap.bravo));
            betis.addPlayer(new Jokalariak("Nabil Fekir", R.mipmap.fekir));
            betis.addPlayer(new Jokalariak("William Carvalho", R.mipmap.carvaloh));
            betis.addPlayer(new Jokalariak("Hector Bellerin", R.mipmap.hector));
            betis.addPlayer(new Jokalariak("Marc Bartra", R.mipmap.markbartra));
            betis.addPlayer(new Jokalariak("Isco", R.mipmap.isco));
            betis.addPlayer(new Jokalariak("Ez abde", R.mipmap.ezabde));
            Ekipoak realsociedad = new Ekipoak("REAL SOCIEDAD", R.mipmap.real, "La Real Sociedad de Fútbol, más conocido como la Real Sociedad o simplemente la Real, es un club de fútbol español con sede en San Sebastián, Guipúzcoa. Fue fundado el 7 de septiembre de 1909 si bien sus orígenes datan del año 1904 con la antigua sociedad donostiarra Recreation Club, de la cual varios integrantes pasaron a conformar en 1907 el San Sebastián Foot-Ball Club que daría después con la fundación del club bajo su denominación de Sociedad de Foot-Ball de San Sebastián.");
            realsociedad.addPlayer(new Jokalariak("Remiro", R.mipmap.remiro));
            realsociedad.addPlayer(new Jokalariak("Take Kubo", R.mipmap.take));
            realsociedad.addPlayer(new Jokalariak("Mikel Merino", R.mipmap.mikelmerino));
            realsociedad.addPlayer(new Jokalariak("Robin le normand", R.mipmap.robin));
            realsociedad.addPlayer(new Jokalariak("Mikel Oyarzabal", R.mipmap.oyarzabal));
            realsociedad.addPlayer(new Jokalariak("Ander Barrenetxea", R.mipmap.barrene));
            realsociedad.addPlayer(new Jokalariak("Momo Cho", R.mipmap.momocho));
            courseModelArrayList.add(betis);
            courseModelArrayList.add(realsociedad);
        }


        public int getImageResource() {
            return  getImageResource();
        }

        public int getName() {
            return  getName();
        }

        public List<Ekipoak> get() {
            return get();
        }
    }
