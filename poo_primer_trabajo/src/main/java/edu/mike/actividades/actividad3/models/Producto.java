package edu.mike.actividades.actividad3.models;

public class Producto {

    private String descripcion;
    private int codigo;
    private String tipo;
    private Double costo;
    private Double impuesto;


    /**
     * 
     * @param codigo del producto
     * @param costo del producto no que puede ser menor o igual a 0
     * @param descripcion del producto
     * @param impuesto del producto que no puede ser menor o igual a 0
     * @param tipo de producto
     */
    public Producto(int codigo, Double costo, String descripcion, Double impuesto, String tipo) {
        setCodigo(codigo);
        setCosto(costo);
        setDescripcion(descripcion);
        setImpuesto(impuesto);
        setTipo(tipo);
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        if (descripcion.isEmpty()){
            throw new IllegalArgumentException("La descripcion no puede estar vacia");
        }
        else{
            this.descripcion = descripcion;
        }
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        if (codigo < 0){
            throw new IllegalArgumentException("El codigo no puede ser menor que 0");
        }
        else{
            this.codigo = codigo;
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo.isEmpty()){
            throw new IllegalArgumentException("El tipo no puede estar vacio");
        }
        else{
            this.tipo = tipo;
        }
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        if (costo <= 0){
            throw new IllegalArgumentException("El costo no puede ser menor o igual a 0");
        }
        else{
            this.costo = costo;
        }
    }

    public Double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(Double impuesto) {
        if (impuesto <= 0){
            throw new IllegalArgumentException("El impuesto no puede ser menor o igual a 0 ");
        }
        else{
            this.impuesto = impuesto;
        }
        
    }

}
