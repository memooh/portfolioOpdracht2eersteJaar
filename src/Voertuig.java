abstract class Voertuig{
    private String name;
    private Dealership has;


    public abstract void Opslag();

    public Voertuig(String name) {
        this.name = name;
    }

    public String getVoertuigName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dealership getHas() {
        return has;
    }

    public void setHas(Dealership has) {
        this.has = has;
    }

    public void startEngine() {
        System.out.println("starting engine....");
    }
}