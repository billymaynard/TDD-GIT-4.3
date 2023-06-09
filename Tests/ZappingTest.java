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
    @Test
    @DisplayName("Test canal origen: 10 canal destino 30: Salida: 20")
    public void test3(){
        //Assemble
        Zapping newZap = new Zapping(99);
        int respuesta;

        //Act
        respuesta = newZap.ClicksHasta(10,30);

        //Assert
        assertEquals(20,respuesta);
    }
    @Test
    @DisplayName("Test canal origen: 2 canal destino 99: Salida: 2")
    public void test4(){
        //Assemble
        Zapping newZap = new Zapping(99);
        int respuesta;

        //Act
        respuesta = newZap.ClicksHasta(2,99);

        //Assert
        assertEquals(2,respuesta);
    }
    @Test
    @DisplayName("Test canal origen: 5 canal destino 63: Salida: 41")
    public void test5(){
        //Assemble
        Zapping newZap = new Zapping(99);
        int respuesta;

        //Act
        respuesta = newZap.ClicksHasta(5,63);

        //Assert
        assertEquals(41,respuesta);
    }
    @Test
    @DisplayName("Test canal origen: 63 canal destino 5: Salida: 41")
    public void test6(){
        //Assemble
        Zapping newZap = new Zapping(99);
        int respuesta;

        //Act
        respuesta = newZap.ClicksHasta(63,5);

        //Assert
        assertEquals(41,respuesta);
    }
    @Test
    @DisplayName("Test canal origen: 1 canal destino 51: Salida: 49")
    public void test7(){
        //Assemble
        Zapping newZap = new Zapping(99);
        int respuesta;

        //Act
        respuesta = newZap.ClicksHasta(1,51);

        //Assert
        assertEquals(49,respuesta);
    }
}