public class Zapping {
    private int numberofchannels;

    public Zapping(int newnumberofchannels){
        this.numberofchannels = newnumberofchannels;
    }
    public int ClicksHasta(int canalactual, int canaldestino) {
        int clicks;
        if (canalactual == canaldestino || canalactual == 0 || canaldestino == 0 || canalactual > numberofchannels || canaldestino > numberofchannels) {
            clicks = 0;
        } else {
            if (canaldestino > canalactual) {
                clicks = Math.min(canaldestino - canalactual, canalactual + numberofchannels - canaldestino);
            } else {
                clicks = Math.min(canalactual - canaldestino, canaldestino + numberofchannels - canalactual);
            }
        }
        return clicks;
    }
}