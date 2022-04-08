import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class lutaTest {

    @Test
    public void deveRetornarLutadores() {
        Luta luta = new Luta();
        luta.inscrever("Brock Lesnar", "Peso Pesado", 90);
        luta.inscrever("Jon Jones", "Peso Pesado", 90);
        luta.inscrever("Marreta", "Peso Pesado", 90);
        luta.inscrever("Chico", "Peso Pena", 55);

        List<String> saida = Arrays.asList(
                "Lutador{nome='Brock Lesnar', categoria='Peso Pesado', peso='90'}",
                "Lutador{nome='Jon Jones', categoria='Peso Pesado', peso='90'}",
                "Lutador{nome='Marreta', categoria='Peso Pesado', peso='90'}",
                "Lutador{nome='Chico', categoria='Peso Pena', peso='55'}");

        assertEquals(saida, luta.obterLutadores());
    }
    @Test
    public void deveRetornarTotalCategorias() {
        Luta luta = new Luta();
        luta.inscrever("Brock Lesnar", "Peso Pesado", 90);
        luta.inscrever("Jon Jones", "Peso Pesado", 90);
        luta.inscrever("Marreta", "Peso Pesado", 90);
        luta.inscrever("Chico", "Peso Pena", 55);

        assertEquals(2, CategoriaFactory.getTotalCategorias());
    }
}
