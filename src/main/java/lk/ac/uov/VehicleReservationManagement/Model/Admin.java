package lk.ac.uov.VehicleReservationManagement.Model;

	import java.util.List;

	import javax.persistence.Entity;
	import javax.persistence.Id;
	import javax.persistence.OneToMany;

	@Entity
	public class Admin {
		@Id
		private String AdminID;
		private String AdminName;
		private String Approval;
		private String Reccomendation;
		
		@OneToMany(mappedBy = "admin")
		private  List<Applicant>applicant;
		
		@OneToMany(mappedBy = "admit")
		private  List<Vehicle>vehicle;
		
		@OneToMany(mappedBy = "admi")
		private  List<Driver>driver;

		public Admin(String adminID, String adminName, String approval, String reccomendation,
				List<Applicant> applicant, List<Vehicle> vehicle, List<Driver> driver) {
			super();
			AdminID = adminID;
			AdminName = adminName;
			Approval = approval;
			Reccomendation = reccomendation;
			this.applicant = applicant;
			this.vehicle = vehicle;
			this.driver = driver;
		}

		public String getAdminID() {
			return AdminID;
		}

		public void setAdminID(String adminID) {
			AdminID = adminID;
		}

		public String getAdminName() {
			return AdminName;
		}

		public void setAdminName(String adminName) {
			AdminName = adminName;
		}

		public String getApproval() {
			return Approval;
		}

		public void setApproval(String approval) {
			Approval = approval;
		}

		public String getReccomendation() {
			return Reccomendation;
		}

		public void setReccomendation(String reccomendation) {
			Reccomendation = reccomendation;
		}

		public List<Applicant> getApplicant() {
			return applicant;
		}

		public void setApplicant(List<Applicant> applicant) {
			this.applicant = applicant;
		}

		public List<Vehicle> getVehicle() {
			return vehicle;
		}

		public void setVehicle(List<Vehicle> vehicle) {
			this.vehicle = vehicle;
		}

		public List<Driver> getDriver() {
			return driver;
		}

		public void setDriver(List<Driver> driver) {
			this.driver = driver;
		}
		
		

		
}

