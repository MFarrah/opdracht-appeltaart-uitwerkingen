public class Ingredients {


    private double amount;
    private String unit;
    private String name;


    public Ingredients() {
    }

    public Ingredients(double amount, String unit, String name) {
        // De 3 parameters gebruiken we om de 3 class variables hierboven een waarde te geven.
        this.amount = amount;
        this.unit = unit;
        this.name = name;
    }


    public double getAmount() {
        return amount;
    }

    public String getUnit() {
        return unit;
    }

    public String getName() {
        return name;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void setName(String name) {
        this.name = name;
    }
}