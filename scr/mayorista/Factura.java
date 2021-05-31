package mayorista;

import java.util.ArrayList;
import java.util.List;

public class Factura extends Mayorista {
	

	
	private Integer numeroFactura;
	 private List <Items> items;
	 private Double sumandoAFactura = 0.0 ;

	  public Factura(String nombreMayorista, Integer numeroFactura){
		  super(nombreMayorista);
	  this.numeroFactura=numeroFactura;
		this.items=new ArrayList<>();

	   
	     
	   }
	    
	  
	  

	
	 
	  public void agregarItems(Items item){
		  	this.sumandoAFactura =+ item.getTotalxArticulo(item)*item.getCantidadUnidades();
		    this.items.add(item);
	  
	}
	  
	  public Double totalFactura() {
		return  this.sumandoAFactura;
	  }
	  
	  public Integer cantidadDeItemsEnLista(){
		 return items.size();
	  }
		
	  
	 
	  
	

	public List<Items> getListaitemsenfactura() {
			return items;
		}






		public void setListaitemsenfactura(List<Items> listaitemsenfactura) {
			this.items = listaitemsenfactura;
		}






		public Double getSumandoAFactura() {
			return sumandoAFactura;
		}






		public void setSumandoAFactura(Double sumandoAFactura) {
			this.sumandoAFactura = sumandoAFactura;
		}






	public Integer getNumeroFactura() {
		return numeroFactura;
	}


	public void setNumeroFactura(Integer numeroFactura) {
		this.numeroFactura = numeroFactura;
	}
	
	

}