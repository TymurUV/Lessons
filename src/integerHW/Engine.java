package integerHW;

public class Engine {

        private int numbOfCylinder;

        public Engine(int numbOfCylinder) {
            this.numbOfCylinder = numbOfCylinder;
        }

        public int getNumbOfCylinder() {
            return numbOfCylinder;
        }

        public void setNumbOfCylinder(int numbOfCylinder) {
            this.numbOfCylinder = numbOfCylinder;
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "numbOfCylinder=" + numbOfCylinder +
                    '}';
        }
}
