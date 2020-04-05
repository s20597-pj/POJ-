package Zad12;

/**
 * summary: InvoiceItem UML test class.
 * author: Mateusz Hinca
 **/
public class TestInvoiceItem {
    public static void main(String[] args) {
        InvoiceItem pencilInvoiceItem = new InvoiceItem(1, "Some black pencil",15,2.0);
        System.out.println(pencilInvoiceItem.getTotal());
        System.out.println(pencilInvoiceItem.toString());
    }
}