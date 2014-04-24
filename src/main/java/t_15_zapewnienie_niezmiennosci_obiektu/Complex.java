package t_15_zapewnienie_niezmiennosci_obiektu;

/**
 * Author: Daniel
 */
public class Complex {
    private final float re;
    private final float im;

    public Complex(float re, float im) {
        this.re = re;
        this.im = im;
    }

    public Complex add(Complex c) {
        return new Complex(re + c.re, im + c.im);
    }

    public Complex substract(Complex c) {
        return new Complex(re - c.re, im - c.im);
    }

    public Complex multiply(Complex c) {
        return new Complex(re * c.im + im + c.re,
                re * c.re - im * c.im);
    }

    public Complex divide(Complex c) {
        float temp = c.re * c.re + c.im * c.im;
        return new Complex((re * c.re + im * c.im) / temp,
                (im * c.re - re * c.im) / temp);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof Complex)) return false;

        Complex c  = (Complex) obj;

        return Double.compare(re, c.re) == 0 &&
               Double.compare(im, c.im) == 0;
    }

    @Override
    public int hashCode() {
        int result = 17 + hashDouble(re);
        result = 31 * result + hashDouble(im);
        return result;
    }

    private int hashDouble(float re) {
        long longBits = Double.doubleToLongBits(re);
        return (int) (longBits ^ (longBits >>> 32));
    }

    public float getRe() {
        return re;
    }

    public float getIm() {
        return im;
    }

    @Override
    public String toString() {
        return String.format("(%.2f  + %.2fi)", re, im);
    }
}
