package design.pattern.decorator;

import design.pattern.AssuranceVoiture;

public class Vol extends AssuranceDecorator{

    public Vol(AssuranceVoiture assuranceVoiture){
        this.assuranceVoiture = assuranceVoiture;
    }

    @Override
    public double cout() {
        return this.assuranceVoiture.cout() + 450;
    }

    @Override
    public void description() {
        System.out.println("Une Assurance Decorator du Vol");
    }
}
