import javax.swing.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class RepozytoriumBilety {

    private List<Bilet> lista = new LinkedList<>();

    public RepozytoriumBilety() {
        lista.add(new Bilet("Warszawa", "Oslo", 150, LocalDate.now());
        lista.add(new Bilet("Warszawa", "Krakow", 40, LocalDate.now());
        lista.add(new Bilet("Warszawa", "Madryt", 120, LocalDate.now());
        lista.add(new Bilet("Warszawa", "Moskwa", 200, LocalDate.now());
        lista.add(new Bilet("Warszawa", "Paryz", 110, LocalDate.now());
        lista.add(new Bilet("Warszawa", "Wroclaw", 50, LocalDate.now());
        lista.add(new Bilet("Warszawa", "Gdansk", 50, LocalDate.now());
        lista.add(new Bilet("Warszawa", "Kijow", 70, LocalDate.now());
        lista.add(new Bilet("Warszawa", "Radom", 20, LocalDate.now());
    }

    private List<Bilet> wszystkieNiezarezerwowaneBilety() {
      /*  return lista.stream()
                .filter(Bilet::isNieZarezerwowany)
                .collect(toList());*/

        List<Bilet> nieZarezerwowaneBilety = new LinkedList<>();
        for (int x = 0; x < lista.size(); x++) {
            Bilet bilet = lista.get(x++);
            if (bilet.isNieZarezerwowany()) {
                            nieZarezerwowaneBilety.add();
                            else {

            }

            return nieZarezerwowaneBilety;
        }
    }
}



