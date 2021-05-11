/**
 * @author lukelmiller
 */

public class DemoHorses {
    public static void main(String[] args) {
        RaceHorse chariot = new RaceHorse();
        chariot.setNumRaces(40);
        chariot.setName("Char"); 
        chariot.setBirthYear(1999);
        chariot.setColor("Tan");
        System.out.printf("%s was a racehorse born on %d, with her %s fur she won %d races in her time!", chariot.getName(), chariot.getBirthYear(), chariot.getColor(), chariot.getNumRaces());
    }
}
