public class DatatypesOutLine {
    public static void main(String[] args){
       
        // String - for patient name and diagnosed disease
        String name = "Ananya Rao";
        String disease = "Diabetes";
       
        // Long - to store patient phone number and patientID
        long patientID = 4356546876L;
        long phoneno = 9567358254L;
       
        // char - for storing gender of the patient
        char gender = 'F';
       
        // double - for storing BMI of the patient
        double bmi = 23.6534;
       
        //int - age and room number
        int age = 39;
        int roono = 763;
       
        //float - sugar reading
        float diabetes = 23.5f;
       
        // Boolean
        boolean hasInsurance = false;
       
        // Display useful formatted output
        System.out.println("🏥 HOSPITAL PATIENT RECORD");
        System.out.println("------------------------------------");
        System.out.println("Patient Name: " + name);
        System.out.println("Medical Record No: " + patientID);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Room Number: " + roono);
        System.out.println("Contact: +91 " + phoneno);
        System.out.println("Diagnosis: " + disease);
        System.out.println("Fasting Sugar Level: " + diabetes + " mg/dL");
        System.out.println("BMI: " + bmi);
       
         if(hasInsurance) {
            System.out.println("Insurance Status: ✔ Covered");
        } else {
            System.out.println("Insurance Status: ❌ Not Covered");
        }

       
    }
}
