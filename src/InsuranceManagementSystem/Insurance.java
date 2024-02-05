package InsuranceManagementSystem;

import java.awt.desktop.AboutEvent;
import java.util.Date;

public abstract class Insurance {

    private String insuranceName;
    private double insuranceFee;
    private Date startDate;
    private Date endDate;

    public Insurance(String insuranceName, double insuranceFee, Date startDate, Date endDate) {
        this.insuranceName = insuranceName;
        this.insuranceFee = insuranceFee;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getInsuranceName() {
        return insuranceName;
    }

    public double getInsuranceFee() {
        return insuranceFee;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public abstract void calculate();

}
