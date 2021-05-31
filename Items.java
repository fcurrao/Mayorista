Public class Items implements BebidasyPerfumes {
  
  private TipoDeItem tipoItem;
  private Double precioUnitario
  private Integer cantidadUnidades;
  private Double iva;
    
  public Items(Double precioUnitario, TipoDeItem TipoDeItem, Double iva){
  this.precioUnitario=precioUnitario;
  this.TipoDeItem=TipoDeItem;
  this.iva=iva;
  
   public Double calcularsubtotalPrecioDelItem(Items item, Integer cantidadUnidades){
   Double subtotalxArticulo = items.precioUnitario*;
     return subtotalxArticulo;
   }
    
   
 
    
  @Override 
  public Double calcularEInformarImpuestos(TipoDeItem TipoDeItem){
  Double iva= 1.21;
  if ( TipoDeItem != Comun){
    Double iva=1.36
  } 
   return iva;
  }
   
       
  public Double calcularTotalPrecioDelItem(Items item){
   Double totalxArticulo = subtotalxArticulo*iva;
    return titaxArticulo;
   }
      
    
    
 }
}
  
