package com.kaa.Lecture2;

public class SecurityCheck2_1 {
    public static void main(String[] args) {
        String adm = "Alex|qwertY1|Administrator";
        int admPipe1 = adm.indexOf("|");
        int admPipe2 = adm.lastIndexOf("|");
        String serv = "Mark|ewq|Customer service";
        int servPipe1 = serv.indexOf("|");
        int servPipe2 = serv.lastIndexOf("|");
        String report = "Lesya|qazS|Analyst";
        int reportPipe1 = report.indexOf("|");
        int reportPipe2 = report.lastIndexOf("|");
        String cust = "Petro|1234|Customer";
        int custPipe1 = cust.indexOf("|");
        int custPipe2 = cust.lastIndexOf("|");
        String admPerm = " and you have all permissions.";
        String servPerm = " and you have Customer service specific permissions.";
        String reportPerm = " and you have reports permissions.";
        String custPerm = " and you have permissions to view and buy.";
        String username = args[0];
        String password = args[1];
        if (username.equals(adm.substring(0, admPipe1))) {
            if (password.equals(adm.substring(admPipe1 + 1, admPipe2))) {
                System.out.println("Welcome, " + username + "! Your group is " + adm.substring(admPipe2 + 1) + admPerm);
            } else {
                System.out.println("Login failed");
            }
        } else if (username.equals(serv.substring(0, servPipe1))) {
            if (password.equals(serv.substring(servPipe1 + 1, servPipe2))) {
                System.out.println("Welcome, " + username + "! Your group is " + serv.substring(servPipe2 + 1) + servPerm);
            } else {
                System.out.println("Login failed");
            }
        } else if (username.equals(report.substring(0, reportPipe1))) {
            if (password.equals(report.substring(reportPipe1 + 1, reportPipe2))) {
                System.out.println("Welcome, " + username + "! Your group is " + report.substring(reportPipe2 + 1) + reportPerm);
            } else {
                System.out.println("Login failed");
            }
        } else if (username.equals(cust.substring(0, custPipe1))) {
            if (password.equals(cust.substring(custPipe1 + 1, custPipe2))) {
                System.out.println("Welcome, " + username + "! Your group is " + cust.substring(custPipe2 + 1) + custPerm);
            } else {
                System.out.println("Login failed");
            }
        } else {
            System.out.println("Login failed");
        }
    }
}
