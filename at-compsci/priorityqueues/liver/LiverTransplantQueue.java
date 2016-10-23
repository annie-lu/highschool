package liver;

import java.util.ArrayList;
public class LiverTransplantQueue {

	private ArrayList<Patient> patients;

	public boolean isEmpty() {
		return patients.size() == 0;
	}

	public Patient poll() {

		return patients.remove(0);
	}

	public Object peek() {
		if (patients == null)
			return null;
		else
			return patients.get(0);
	}

	public LiverTransplantQueue() {
		patients = new ArrayList<Patient>();
	}

	public void add(Patient patient) {
		int x = 0;
		int priority = patient.getPriority();
		if (patients.size() == 0) {
			patients.add(patient);
		} else {
			while (x < patients.size()) {

				if (patients.get(x).getPriority() > priority) {
					patients.add(x, patient);
					return;
				}
				x++;
			}
			patients.add(patients.size(), patient);
		}
	}

	public int size() {

		return patients.size();
	}

	public String toString() {
		int x = 0;
		String output = "";
		while (x < patients.size()) {
			output += patients.get(x) + " ";
			x++;
		}
		return output;
	}

}
