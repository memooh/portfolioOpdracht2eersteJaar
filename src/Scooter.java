class Scooter extends Voertuig {
    private Integer torquePower;
    private Integer cilinder;

    public Scooter(String voertuigName, Integer torquePower, Integer cilinder) {
        super(voertuigName);
        this.cilinder = cilinder;
        this.torquePower = torquePower;
    }

    @Override
    public void startEngine() {
        System.out.println(this.getVoertuigName() + " starts engine");
    }

    public Integer getTorquePower() {
        return torquePower;
    }

    public void setTorquePower(Integer torquePower) {
        this.torquePower = torquePower;
    }

    public Integer getCilinder() {
        return cilinder;
    }

    public void setCilinder(Integer cilinder) {
        this.cilinder = cilinder;
    }

    @Override
    public void Opslag() {
        System.out.println("Scooter heeft merk "+ this.getVoertuigName() + ".");
        System.out.println("Heeft zoveel " + this.getCilinder() + " cilinders,");
        System.out.println("en heeft zoveel " + this.getTorquePower() + " torque.");
    }


}