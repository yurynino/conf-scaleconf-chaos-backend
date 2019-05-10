package co.scaleconf.services.dashboard.controller;

import co.scaleconf.services.dashboard.client.SmartTransactionClient;
import co.scaleconf.services.dashboard.client.TransactionClient;
import co.scaleconf.services.dashboard.model.Dashboard;
import co.scaleconf.services.dashboard.model.SmartTransaction;
import co.scaleconf.services.dashboard.model.Transaction;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dashboard")
public class DashboardController {

    @Autowired
    TransactionClient transactionClient;

    @Autowired
    SmartTransactionClient smartTransactionClient;

    @GetMapping("/{customer}")
    public Dashboard getDashboard(@PathVariable("customer") Integer customer) {
        List<Transaction> transactions = transactionClient.findByCustomer(customer);
        List<SmartTransaction> smartTransactions = smartTransactionClient.findByCustomer(customer);

        Dashboard dashboard = new Dashboard();
        dashboard.setCustomer(customer);
        dashboard.setTransactions(transactions);
        dashboard.setSmartTransactions(smartTransactions);

        return dashboard;
    }

}
