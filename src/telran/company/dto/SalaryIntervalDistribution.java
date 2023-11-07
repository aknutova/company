package telran.company.dto;

import java.io.*;

public record SalaryIntervalDistribution(int salaryFrom, int salaryTo, long amount) implements Serializable {

}
