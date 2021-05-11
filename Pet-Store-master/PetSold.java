/**
 * @author lukelmiller
 */

public class PetSold extends ItemSold{
    
    private boolean vaccinated;
    private boolean neutered;
    private boolean houseBroken;

    public boolean isVaccinated() {
        return vaccinated;
    }

    public boolean isNeutered() {
        return neutered;
    }

    public boolean isHouseBroken() {
        return houseBroken;
    }

    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }

    public void setNeutered(boolean neutered) {
        this.neutered = neutered;
    }

    public void setHouseBroken(boolean houseBroken) {
        this.houseBroken = houseBroken;
    }
    
    
    
}
