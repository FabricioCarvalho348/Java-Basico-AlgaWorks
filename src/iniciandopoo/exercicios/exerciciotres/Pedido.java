package iniciandopoo.exercicios.exerciciotres;

public class Pedido {
    private Integer codigo;
    private Integer subtotal;
    private Integer desconto;
//    private Integer total;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getSubtotal() {
        return subtotal - desconto;
    }

    public void setSubtotal(Integer subtotal) {
        this.subtotal = subtotal;
    }

    public Integer getDesconto() {
        return desconto;
    }

    public void setDesconto(Integer desconto) {
        this.desconto = desconto;
    }

//    public Integer getTotal() {
//        return total;
//    }
//
//    public void setTotal(Integer total) {
//        this.total = total;
//    }
}
