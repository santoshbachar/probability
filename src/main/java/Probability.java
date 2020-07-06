public class Probability {
    int value;

    public Probability(int value) {
        this.value= value;
    }

    public boolean compare(Probability p) {
        if (this.value == p.value) {
            return true;
        }
        return false;
    }
}
