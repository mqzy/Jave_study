public class Enum {
    enum Constance {
        one(1),two(2);

        public int getI() {
            return i;
        }

        private int i;
        private Constance(int i){
            this.i = i;
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < Constance.values().length ; i++) {
            System.out.println(Constance.values()[i]+": "+Constance.values()[i].getI());
        }
    }
}
