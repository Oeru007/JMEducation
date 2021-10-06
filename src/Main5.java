public class Main5 {
    public static void main(String[] args) {
        ComplexNumber complexNumber = new ComplexNumber(1.1, 1.2);
        ComplexNumber complexNumber1 = new ComplexNumber(1.2, 1.1);
        System.out.println(complexNumber.equals(complexNumber1));
        System.out.println(complexNumber.hashCode());
        System.out.println(complexNumber1.hashCode());

    }

    public static class ComplexNumber {
        private double re;
        private double im;

        public ComplexNumber() {
        }

        public ComplexNumber(double re, double im) {
            this.re = re;
            this.im = im;
        }

        public double getRe() {
            return re;
        }

        public double getIm() {
            return im;
        }
        @Override
        public int hashCode(){
            return 37*Double.hashCode(re) + Double.hashCode(im);
        }
        @Override
        public boolean equals(Object o){
            if (this == o){
                return true;
            }
            if ((o == null) || (this.getClass() != o.getClass())){
                return false;
            }
            ComplexNumber complexNumber = (ComplexNumber) o;
            return (re == complexNumber.getRe()) && (im == complexNumber.getIm());
        }
    }

}
