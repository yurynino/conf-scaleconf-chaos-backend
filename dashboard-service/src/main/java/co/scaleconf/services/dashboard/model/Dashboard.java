package co.scaleconf.services.dashboard.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "dashboard")
public class Dashboard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer customer;

    @Transient
    private List<Transaction> transactions;

    @Transient
    private List<SmartTransaction> smartTransactions;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCustomer() {
        return customer;
    }

    public void setCustomer(Integer customer) {
        this.customer = customer;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(
        List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public List<SmartTransaction> getSmartTransactions() {
        return smartTransactions;
    }

    public void setSmartTransactions(
        List<SmartTransaction> smartTransactions) {
        this.smartTransactions = smartTransactions;
    }

}
