package mayorista;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;


public class TestMayoristaa {

	@Test
	public void testQueVerificaQueSeCreoLaFactura() {
	Factura factura01 = new Factura("Makro", 120);
	
		
	assertEquals((Integer)120, factura01.getNumeroFactura());	
	}

	
	
	@Test
	public void testQueVerificaQueSeAgregaUnItem(){
		Factura factura01 = new Factura("Makro", 120);
		Items pera = new Items(99.00, TipoDeItem.Comun,2);
		
		factura01.agregarItems(pera);

		
	assertEquals(1 , factura01.cantidadDeItemsEnLista());	
		
	}
			       
	@Test
	public void testQueVerificaQueSePuedeAgregarMasDeUnItem(){
	Factura factura01 = new Factura("Makro", 120);
	Items banana = new Items(12.50, TipoDeItem.Comun,3);
	Items pera = new Items(99.00, TipoDeItem.Comun,4);
	Items perfume = new Items(10.00, TipoDeItem.Perfume,2);
	
	factura01.agregarItems(banana);
	factura01.agregarItems(pera);		       
	factura01.agregarItems(perfume);	
	
	assertEquals(3 , factura01.cantidadDeItemsEnLista());	

	}
	
	
	@Test
	public void testQueVerificaQueSeAgregueElImpuestoCorrespondienteSegunElTipo(){
		Factura factura01 = new Factura("Makro", 120);
		Items banana = new Items(12.00, TipoDeItem.Comun,1);
		Items pera = new Items(50.00, TipoDeItem.Comun,1);
		Items perfume = new Items(10.00, TipoDeItem.Perfume,1);
		
		factura01.agregarItems(banana);
		factura01.agregarItems(pera);		       
		factura01.agregarItems(perfume);	
				       
		
	assertEquals(88.62, factura01.totalFactura());
	}

}
