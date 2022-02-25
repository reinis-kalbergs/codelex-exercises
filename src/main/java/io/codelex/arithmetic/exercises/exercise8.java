package io.codelex.arithmetic.exercises;

public class exercise8 {
    public static void main(String[] args) {
        calculatePay("Employee1",7.5,35);
        calculatePay("Employee2",8.2,47);
        calculatePay("Employee3",10,73);
    }

    public static void calculatePay(String employee, double basePay,int hoursWorked){

        if(basePay<8){

            System.out.println("Error. "+ employee+"'s base pay is less than the minimum wage.");
        }else if (hoursWorked>60){
            System.out.println("Error. "+ employee+" worked over 60 hours.");
        } else{
            double totalPay;
            if (hoursWorked<=40){
                totalPay=hoursWorked*basePay;
            }else{
                totalPay=40*basePay+(hoursWorked-40)*1.5*basePay;
            }
            System.out.println("Total pay for "+employee+" is "+String.format("%.2f",totalPay)+"$");
        }

    }
}
