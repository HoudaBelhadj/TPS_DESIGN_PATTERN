package design.pattern;

public class ResponsabiliteCivile extends AssuranceVoiture{
    @Override
    public double cout() {
        return 1000;
    }

    @Override
    public void description() {
        System.out.println("Une Assurance de la responsabilite civile");
    }
}
