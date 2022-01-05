import design.pattern.AssuranceVoiture;
import design.pattern.ResponsabiliteCivile;
import design.pattern.decorator.DammageAndCollision;
import design.pattern.decorator.Vol;

public class App {

    public static void main(String[] args) {
        AssuranceVoiture responsabiliteCivile =  new ResponsabiliteCivile();

        System.out.println(responsabiliteCivile.cout());
        responsabiliteCivile.description();

        responsabiliteCivile = new Vol(responsabiliteCivile);
        System.out.println(responsabiliteCivile.cout());
        responsabiliteCivile.description();

        responsabiliteCivile = new DammageAndCollision(responsabiliteCivile);
        System.out.println(responsabiliteCivile.cout());
        responsabiliteCivile.description();
    }
}
