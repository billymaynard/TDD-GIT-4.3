public class Zapping {
    private int numberofchannels;

    public Zapping(int newnumberofchannels){
        this.numberofchannels = newnumberofchannels;
    }
    public int ClicksHasta(int canalactual, int canaldestino){
        if (canalactual==canaldestino || canalactual == 0 || canaldestino == 0 || canalactual>numberofchannels || canaldestino>numberofchannels){
            return 0;
        }else if (canaldestino==99){
            return canalactual;
        }else {
            return canaldestino-canalactual;
        }

    }
}