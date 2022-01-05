package design.pattern.decorator;

import design.pattern.AssuranceVoiture;

public abstract class AssuranceDecorator extends AssuranceVoiture{
    protected AssuranceVoiture assuranceVoiture;

    public abstract double cout();
    public abstract void description();

}
