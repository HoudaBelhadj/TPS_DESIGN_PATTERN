package design.pattern.decorator;

import design.pattern.AssuranceVoiture;

public class DammageAndCollision extends AssuranceDecorator{

    public DammageAndCollision(AssuranceVoiture assuranceVoiture){
        this.assuranceVoiture = assuranceVoiture;
    }

    @Override
    public double cout() {
        return this.assuranceVoiture.cout() + 500;
    }

    @Override
    public void description() {
        System.out.println("Une Assurance Decorator du dommage et Collision");
    }
}
