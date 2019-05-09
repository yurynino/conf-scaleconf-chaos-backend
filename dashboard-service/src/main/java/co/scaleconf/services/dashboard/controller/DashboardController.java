package co.scaleconf.services.dashboard.controller;

import co.scaleconf.services.dashboard.client.SmartTransactionClient;
import co.scaleconf.services.dashboard.client.TransactionClient;
import co.scaleconf.services.dashboard.model.Dashboard;
import co.scaleconf.services.dashboard.model.SmartTransaction;
import co.scaleconf.services.dashboard.model.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dashboard")
public class DashboardController {

    @Autowired
    SmartTransactionClient smartTransactionClient;

    @GetMapping("/{id}")
    public Dashboard getDashboard(@PathVariable("customerId") Integer customerId) {
        Dashboard dashboard = new Dashboard();
        return dashboard;
    }

}
