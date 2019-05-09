package co.scaleconf.services.dashboard.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "dashboard")
public class Dashboard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer customerId;

    private List<SmartTransaction> smartTransactions;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public List<SmartTransaction> getSmartTransactions() {
        return smartTransactions;
    }

    public void setSmartTransactions(List<SmartTransaction> smartTransactions) {
        this.smartTransactions = smartTransactions;
    }

}
