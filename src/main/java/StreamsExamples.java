import org.omg.IOP.ServiceContextHelper;
import scala.reflect.runtime.TwoWayCache;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamsExamples {

    public static void main(String[] args) {


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

        System.out.println(
                Stream.of(1, 2, 3, 4, 5, 6)
                        .map(x -> x * x)
                        .filter(x -> x != 9)
                        .map(x -> x - 3)
                        .peek(System.out::println)
                        .count()
        );


        Optional<String> maybeString = Optional.of("Foo")
                .filter(x->!x.isEmpty())
                .map(x->x.toLowerCase());




        class Point {
            int x;
            int y;

            public Point(int x, int y) {
                this.x = x;
                this.y = y;
            }
        }


        List<Point> points = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                points.add(new Point(i,j));
            }
        }

        List<Integer> list = new ArrayList<>();
        List<Integer> listFoo = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.set(i,list.get(i)*list.get(i));
            list.set(i,list.get(i)-3);
            System.out.println(list.get(i));
        }


        // Ich würde auch eher sagen A aber so ein Stream kann sehr kurz sein.


        // Übersetzung
        // "yield" - ergeben, liefern, hervorbringen
        // "comprehension" - Einbeziehung, Umfassung, Verständnis; Begreifen
    }


}
