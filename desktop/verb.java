package desktop;

import java.util.ArrayList;
import java.util.Collections;

public class verb {
    private String infinitive;
    private ArrayList<String> conjugations = new ArrayList<String>();
    
    public verb(String inf){
        this.infinitive = inf;
    }
    
    public void setConjugations(String[] conj){
        Collections.addAll(this.conjugations, conj);
    }

    public String getInfinitive(){
        return this.infinitive;
    }

    public ArrayList<String> getConjugations(){
        return this.conjugations;
    }

    public ArrayList<String> getPresentConjugations(){
        ArrayList<String> PresentConjugations;
        PresentConjugations = new ArrayList<String>(conjugations.subList(0, 6));
        return PresentConjugations;
    }

    public void info(){
        System.out.println( "For the infinitive: " +
        this.infinitive + ", the conjugation list is: "
        +this.conjugations.toString() );
    }
}
