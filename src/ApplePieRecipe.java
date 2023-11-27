public class ApplePieRecipe {

    public void printRecipe(){
        System.out.println("Doorloop de volgende stappen een voor een:");
        // We roepen hier telkens een andere methode aan. Elke methode print op zijn beurt een string uit.
        startOven();
        eggStuff();
        whaddupDoe();
        appleSugar();
        prepareFlower();
        mashUp();
        setitUp();
        topLayers();
        setLayers();
        bakeitUP();
    }
    public void startOven(){
        System.out.println("Verwarm de oven van te voren op 170 °C (boven en onderwarmte).");
    }

    public void eggStuff() {
        System.out.println( "Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de appeltaart.");
    }

    public void whaddupDoe() {
        System.out.println("Meng de boter, basterdsuiker, zelfrijzend bakmeel, een helft van het ei, vanillesuiker en een snufje zout tot een stevig deeg en verdeel in 3 gelijke delen.");
    }

    public void appleSugar() {
        System.out.println("Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker met het kaneel.");
    }

    public void prepareFlower() {
        System.out.println("Vet de springvorm in en bestuif het met bloem.");
    }

    public void mashUp() {
        System.out.println("Gebruik één deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om je randen te bekleden. Strooi het paneermeel op de bodem van de beklede vorm. De paneermeel neemt het vocht van de appels op.");
    }

    public void setitUp() {
        System.out.println("Doe de helft van de appels in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel overheen.");
    }

    public void topLayers(){
        System.out.println("Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1cm breed.");
    }

    public void setLayers(){
        System.out.println("Leg de stroken kruislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af. Gebruik het halve ei om de stroken in te smeren.");
    }

    public void bakeitUP(){
        System.out.println("Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 °C (boven en onderwarmte) gaar en goudbruin.");
    }
    /*public static void main(String[] args) {



            String step1 = "Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de appeltaart.";
            String step2 = "Meng de boter, bastard suiker, zelfrijzend bakmeel, een helft van het ei, vanille suiker en een snufje zout tot een stevig deeg en verdeel deze in 3 gelijke delen.";
            String step3 = "Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel.";
            String step4 = "Vet de springvorm in en bestrooi deze met bloem";
            String step5 = "Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om de rand van de springvorm te bekleden. Strooi het paneermeel op de bodem van de beklede vorm. De paneermeel neemt het vocht van de appels op.";
            String step6 = "Doe de heft van de appels in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel overheen. Meng de ander helft van de appels met het overgebleven kaneel-suiker mengsel en leg deze in de vorm.";
            String step7 = "Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed.";
            String step8 = "Leg de stroken kuislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken";
            String step9 = "Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden Celsius (boven en onderwarmte) gaar en goudbruin.";
            String[] mySteps = {step1,step2,step3,step4,step5,step6,step7,step8,step9};
            cycleStrings(mySteps);
        }
        public static void cycleStrings(String[] mySteps) {
            for (String steps : mySteps) {
                System.out.println(steps);*/
    Ingredients butter = new Ingredients(200, "gram", "ongezouten roomboter" );
    Ingredients sugar = new Ingredients(200, "gram", "witte bastard suiker" );
    Ingredients bakingSoda = new Ingredients(400, "gram", "zelfrijzend bakmeel" );
    Ingredients egg = new Ingredients(1, "stuks", "ei" );
    Ingredients vanillaSugar = new Ingredients(8, "gram", "vanillesuiker" );
    Ingredients salt = new Ingredients(1, "snuf", "zout" );
    Ingredients apple = new Ingredients(1.5, "kilo", "zoetzure appels" );
    Ingredients cristalSugar = new Ingredients(75, "gram", "kristal suiker" );
    Ingredients cinnamon = new Ingredients(3, "theelepels", "kaneel" );
    Ingredients breadCrumbs = new Ingredients(15, "gram", "paneermeel" );

    public void printIngredients() {
        System.out.println("Ingredienten nodig voor dit recept: ");

        System.out.println(butter.getAmount() + " " + butter.getUnit() + " " + butter.getName());
        System.out.println(sugar.getAmount() + " " + sugar.getUnit() + " " + sugar.getName());
        System.out.println(bakingSoda.getAmount() + " " + bakingSoda.getUnit() + " " + bakingSoda.getName());
        System.out.println(egg.getAmount() + " " + egg.getUnit() + " " + egg.getName());
        System.out.println(vanillaSugar.getAmount() + " " + vanillaSugar.getUnit() + " " + vanillaSugar.getName());
        System.out.println(salt.getAmount() + " " + salt.getUnit() + " " + salt.getName());
        System.out.println(apple.getAmount() + " " + apple.getUnit() + " " + apple.getName());
        System.out.println(cristalSugar.getAmount() + " " + cristalSugar.getUnit() + " " + cristalSugar.getName());
        System.out.println(cinnamon.getAmount() + " " + cinnamon.getUnit() + " " + cinnamon.getName());
        System.out.println(breadCrumbs.getAmount() + " " + breadCrumbs.getUnit() + " " + breadCrumbs.getName());
    }



}