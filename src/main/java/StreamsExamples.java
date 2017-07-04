import java.util.Arrays;
import java.util.List;

public class StreamsExamples {

    public static void main(String[] args){


        // Wer hat in Java schon mit Streams gearbeitet?
        // Wer hat in JavaScript schon mit Streams gearbeitet?


        //Warum heißen Streams "Streams"?
        // A: Strom von Elementen auf dem Operationen ausgeführt werden
        //
        // * In JavaScript findet man hier häufig den Hinweis auf unendliche Streams
        //   * Kefir.js
        //   * http://highlandjs.org/
        //   * cycle.js.
        //
        // B: Strom von Operationen die aneinander gereiht werden
        //   * Naja wohl eher nicht aber:
        //        Option(al) Beispiel
        //          TODO
        //  https://bugs.openjdk.java.net/browse/JDK-8050820
        
        // (C: ja halt beides irgendwie ... )

        Arrays.asList(1, 2, 3, 4, 5, 6).stream()
                .map(x->x*x)
                .filter(x->x!=9)
                .map(x->x-3)
                .peek(System.out::println)
                .count();

        // Ich würde auch eher sagen A aber so ein Stream kann sehr kurz sein.


        // Übersetzung
        // "yield" - ergeben, liefern, hervorbringen
        // "comprehension" - Einbeziehung, Umfassung, Verständnis; Begreifen
    }




}
