package swColaborativo;

public class Fraction {

    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction() {
        this(1, 1);
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public double decimal() {
        return (double) numerator / denominator;
    }
    
    public void invert() {
        int numerator=this.numerator;
        this.numerator=this.getDenominator();
        this.denominator=numerator;
    }
    
    @Override
    public String toString(){
    	return(this.numerator+"/"+this.denominator);
    }
}
