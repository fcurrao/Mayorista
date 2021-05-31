package mayorista;

public class Items implements BebidasyPerfumes  {


	private Integer cantidadUnidades;
	private Double totalxArticulo;
	private Double precioUnitario;
	private TipoDeItem TipoDeItem;


	public Items(Double precioUnitario, TipoDeItem TipoDeItem,Integer cantidadUnidades) {
		this.precioUnitario = precioUnitario;
		this.TipoDeItem = TipoDeItem;
		this.cantidadUnidades=cantidadUnidades;

	}

	
	
	
	
	
	
	
	
	
		
	


		public Double getTotalxArticulo(Items item) {
			Double iva= 1.21;
	     	if ( item.getTipoDeItem() != TipoDeItem.Comun){
	     	 iva=1.36;
	     	} else iva=1.21;
	     	
	     	totalxArticulo = item.getPrecioUnitario() * iva;
	     	return totalxArticulo;
			
		}

		
		
		public void setTotalxArticulo(Double totalxArticulo) {
			this.totalxArticulo = totalxArticulo;
		}

	public Double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(Double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	
	 
	  public Integer getCantidadUnidades() {
			return cantidadUnidades;
		}

		public void setCantidadUnidades(Integer cantidadUnidades) {
			this.cantidadUnidades = cantidadUnidades;
		}

	public TipoDeItem getTipoDeItem() {
		return TipoDeItem;
	}

	public void setTipoDeItem(TipoDeItem tipoDeItem) {
		TipoDeItem = tipoDeItem;
	}














	public Double getTotalxArticulo() {
		return totalxArticulo;
	}




}
