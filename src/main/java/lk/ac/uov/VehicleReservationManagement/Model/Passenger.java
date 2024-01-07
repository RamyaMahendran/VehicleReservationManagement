package lk.ac.uov.VehicleReservationManagement.Model;


	import javax.persistence.Entity;
	import javax.persistence.Id;
	import javax.persistence.JoinColumn;
	import javax.persistence.ManyToOne;

	@Entity
	public class Passenger {
		@Id
		private String PassengerID;
		private String PassengerName;
		
		@ManyToOne
		@JoinColumn(name="applicantId",referencedColumnName="ApplicantID")
		private Applicant applicant;
		
		@ManyToOne
		@JoinColumn(name="deptName",referencedColumnName="DepartmentName")
		private Department depart;

		public Passenger(String passengerID, String passengerName, Applicant applicant, Department depart) {
			super();
			PassengerID = passengerID;
			PassengerName = passengerName;
			this.applicant = applicant;
			this.depart = depart;
		}

		public String getPassengerID() {
			return PassengerID;
		}

		public void setPassengerID(String passengerID) {
			PassengerID = passengerID;
		}

		public String getPassengerName() {
			return PassengerName;
		}

		public void setPassengerName(String passengerName) {
			PassengerName = passengerName;
		}

		public Applicant getApplicant() {
			return applicant;
		}

		public void setApplicant(Applicant applicant) {
			this.applicant = applicant;
		}

		public Department getDepart() {
			return depart;
		}

		public void setDepart(Department depart) {
			this.depart = depart;
		}
		
		

}



