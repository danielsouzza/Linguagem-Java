package Training.Livro.registrosDeSaúde;

import javax.swing.JOptionPane;

public class HealthMain {
    public static void main(String[] args) {
        HealthProfile patient_1 = 
            new HealthProfile("Daneil", "Souza", new int[]{20, 03, 2003}, 'M', 1.65, 52.0);
    
        patientToDisplay(patient_1);
    }

    public static void patientToDisplay(HealthProfile p){
        String patient_data = 
            String.format("Name: %s | Idade: %d | Sex: %c\nAtura: %.2f  |  Peso: %.2f\nFCM: %d | FCA: %.2f | IMC: %.2f",
            p.getAllName(), p.age(), p.getSex(), p.getHeight(), p.getWeight(),p.heartRateMax(), p.targetHeartRate(), p.Imc());
        System.out.println(patient_data);
        // JOptionPane.showMessageDialog(null, patient_data);
    }
}
