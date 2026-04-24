public enum TipoProducto {
    COCACOLA ("CocaCola", 1000),
    FANTA ("Fanta", 1000),
    SPRITE ("Sprite", 1000),
    SUPER8 ("Super8", 300),
    SNICKERS ("Snickers", 400);
    private final String nombre;
    private final int precio;
    TipoProducto(String nombre, int precio){
        this.nombre=nombre;
        this.precio=precio;
    }
    public String getNombre(){
        return nombre;
    }
    public int getPrecio(){
        return precio;
    }
}