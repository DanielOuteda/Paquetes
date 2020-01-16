/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplopaquetes;

import com.dani.circulo.AreaCirculo;
import triangulo.AreaTriangulo;
import triangulo.PerimetroTriangulo;
import rectangulo.*;
import com.dani.circulo.*;
import validacions.validar;

/**
 *
 * @author doutedasolla
 */
public class ExemploPaquetes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AreaTriangulo tri = new AreaTriangulo();
        tri.AreaTriangulo(6f, 2f);

        PerimetroTriangulo per = new PerimetroTriangulo();
        per.PerimetroTrianguloIsosceles(6, 2);

        AreaCirculo areaC = new AreaCirculo();
        areaC.AreaCirculo(3);

        MeusMetodos aux = new MeusMetodos();
        float base = aux.validaFloatPositivo();
        float altura = aux.validaFloatPositivo();

        Area rec = new Area();
        rec.AreaRectangulo(base, altura);

        //static
        float b = MeusMetodos.darValor();
        float alt = MeusMetodos.darValor();
        rec.AreaRectangulo(b, alt);

        //simplificando
        rec.AreaRectangulo(MeusMetodos.darValor(), MeusMetodos.darValor());
        rec

    }

}
