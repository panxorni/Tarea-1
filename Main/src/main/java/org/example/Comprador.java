package org.example;

public class Comprador {
    private String consumido;
    private int vuelto;
    public Comprador(Moneda m,TipoProducto tipo,Expendedor exp) throws PagoIncorrectoException, PagoInsuficienteException, NoHayProductoException{
        Producto p= exp.comprarProducto(m, tipo);

        consumido=p.consumir();

        Moneda m_vuelto= exp.getVuelto();
        while (m_vuelto!=null){
            vuelto+=m_vuelto.getValor();
            m_vuelto= exp.getVuelto();
        }
    }
    public int cuantoVuelto(){
        return vuelto;
    }
    public String queConsumiste(){
        return consumido;
    }
}
