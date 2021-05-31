
public class Test {

	@Test
	public void testQueVerificaQueSeCreoLaFactura() {
	Factura factura01 = new Factura(...);
		
	assertEquals("numerofactura" , .getNumerodefactura);	
	}

	
	
	@Test
	public void testQueVerificaQueSeAgregaUnItem(){
	Factura factura01 = new Factura(...);
	factura01.agregarItems(new ( ......);
			       
		
	assertEquals(1 , .getCantidaddeItems( size del array));	
		
	}
			       
	@Test
	public void testQueVerificaQueSePuedeAgregarMasDeUnItem(){
	Factura factura01 = new Factura(...);
	factura01.agregarItems(new ( ......);
	factura01.agregarItems(new ( ......);
	factura01.agregarItems(new ( ......);
			       
		
	assertEquals(3 , .getCantidaddeItems( size del array));

	}
	
	
	@Test
	public void testQueVerificaQueSeAgregueElImpuestoCorrespondienteSegunElTipo(){
	Factura factura01 = new Factura(...);
	factura01.agregarItems(new ( ......); (perfume)
	factura01.agregarItems(new ( ......); (normal)
				       
		
	assertEquals((el precio del perfume*cantidad + iva especial ++++ el precio de normal* cantidad + iva, .gettotalde factura );
	}

}
