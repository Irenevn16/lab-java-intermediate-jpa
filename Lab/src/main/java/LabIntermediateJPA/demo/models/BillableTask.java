package LabIntermediateJPA.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

import java.time.LocalDate;

@Entity
public class BillableTask extends Task {

    private double hourlyRate;

    public BillableTask() {
    }

    public BillableTask(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public BillableTask(String title, LocalDate dueDate, boolean status, int hourlyRate) {
        super(title, dueDate, status);
        this.hourlyRate = hourlyRate;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public String toString() {
        return super.toString() + ", hourlyRate=" + hourlyRate + " }";
    }
}
