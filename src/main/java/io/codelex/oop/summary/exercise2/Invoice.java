package io.codelex.oop.summary.exercise2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class Invoice {

    private List<Item> order = new ArrayList<>();
    private final int INVOICE_NUMBER;
    private InvoiceStatus invoiceStatus;
    private final BigDecimal VAT = new BigDecimal("0.21");
    private BigDecimal priceWithoutVAT;
    private BigDecimal priceWithVAT;

    public Invoice(Order order, int invoiceNumber) {
        this.order = order.getOrder();
        this.INVOICE_NUMBER = invoiceNumber;
        this.invoiceStatus = InvoiceStatus.APPROVED;
        this.priceWithoutVAT = calculateSum();
        this.priceWithVAT = calculateVAT(priceWithoutVAT);
    }

    public void send() {
        this.invoiceStatus = InvoiceStatus.SENT;
    }

    private BigDecimal calculateSum() {
        BigDecimal sum = BigDecimal.ZERO;
        for (Item item : order) {
            sum = sum.add(item.getPrice());
        }
        return sum.setScale(2, RoundingMode.HALF_UP);
    }

    private BigDecimal calculateVAT(BigDecimal priceWithoutVAT) {

        return priceWithoutVAT.add(priceWithoutVAT.multiply(VAT).setScale(2, RoundingMode.HALF_UP));
    }

    public String getInvoice() {
        StringBuilder result = new StringBuilder("===================================================\n");
        result.append(formatLine("INVOICE NUMBER: INV" + INVOICE_NUMBER)).append("\n");
        result.append(formatLine("STATUS: " + invoiceStatus)).append("\n");
        addAllItems(result);
        result.append(formatLine("SUM: " + priceWithoutVAT + " EUR")).append('\n');
        result.append(formatLine("VAT (" + VAT.multiply(new BigDecimal(100)) + "%)"
                + priceWithVAT.subtract(priceWithoutVAT) + " EUR")).append('\n');
        result.append(formatLine("TOTAL: " + priceWithVAT + " EUR")).append('\n');
        result.append("===================================================");
        return result.toString();
    }

    private void addAllItems(StringBuilder builder) {
        for (int i = 0; i < order.size(); i++) {
            builder.append(formatLine((i + 1) + ". " + order.get(i).fullInfo())).append("\n");
        }
    }

    private String formatLine(String text) {
        final int LENGTH = 49;
        StringBuilder result = new StringBuilder("= ").append(text);
        if (text.length() < LENGTH - 3) {
            for (int i = 1; i < LENGTH - text.length(); i++) {
                result.append(" ");
            }
        }
        return result.append("=").toString();
    }

}
