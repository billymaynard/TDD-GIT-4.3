import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZappingTest {
    @Test
    @DisplayName("Test canal origen: 0 canal destino 0: Salida: 0")
    public void test1(){
        //Assemble
        Zapping newZap = new Zapping(99);
        int respuesta;

        //Act
        respuesta = newZap.ClicksHasta(0,0);

        //Assert
        assertEquals(0,respuesta);
    }

    @Test
    @DisplayName("Test canal origen: 1 canal destino 2: Salida: 1")
    public void test2(){
        //Assemble
        Zapping newZap = new Zapping(99);
        int respuesta;

        //Act
        respuesta = newZap.ClicksHasta(1,2);

        //Assert
        assertEquals(1,respuesta);
    }

}