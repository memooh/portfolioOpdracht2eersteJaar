import org.junit.Assert;
import org.junit.Test;

public class mainTest {

    // Test of je dealers kan toevoegen aan een dealership.
    @Test
    public void Test1() {
        Dealer dealer_1 = new Dealer("test","test","dd@test.nl",18);
        Dealership dealership_1 = new Dealership("dealership_1","locatie_1");
        dealership_1.addDealer(dealer_1);

        // Dealer wordt toegevoegd, waardoor dealership 1 dealer heeft namelijk .get(0) en hierop wordt de test uitegevoerd.
        Assert.assertEquals(dealer_1, dealership_1.getHasA().get(0));
    }

    // Test of je een dealer kan specificeren.
    @Test
    public void Test2() {
        Dealer dealer_1 = new Dealer("test","test","dd@test.nl",18);
        Dealer dealer_2 = new Dealer("test2","test2","dd@test.nl2",19);

        Assert.assertEquals("test", dealer_1.getVoornaam());
        Assert.assertEquals("test2", dealer_2.getVoornaam());
    }

    // Test of method overriding van extended abstract class werkt.
    @Test
    public void Test3() {
        // scooter de voertuigNaam komt vanuit abstract class Voertuig en hierbij testen we of het werkt.
        Scooter scooter_1 = new Scooter("scooter_1",20,10);
        Assert.assertEquals("scooter_1", scooter_1.getVoertuigName());

    }

    @Test
    public void getPrijs() {
            Prijs voertuig1 = new Prijs(1);
            Assert.assertEquals(13600, voertuig1.getPrijs(1), 0.01);
    }


}
