package SortingPgm;

import java.util.Objects;

public class Record {
    private String status;
    private double amount;

    public Record(String status, double amount) {
        this.status = status;
        this.amount = amount;
    }

    // Getters and setters
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    // Overriding equals method to compare Record objects


    @Override
    public String toString() {
        return "Record{" +
                "status='" + status + '\'' +
                ", amount=" + amount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Record record = (Record) o;
        return Double.compare(amount, record.amount) == 0 && Objects.equals(status, record.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, amount);
    }
}

