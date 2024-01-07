package lk.ac.uov.VehicleReservationManagement.Model;

	import java.util.List;

	import javax.persistence.Entity;
	import javax.persistence.Id;
	import javax.persistence.OneToMany;

	@Entity
	public class Department {
		@Id
		private String DepartmentName;
		
		@OneToMany(mappedBy = "department")
		private  List<Applicant>applicant;
		
		@OneToMany(mappedBy = "depart")
		private List<Passenger>passenger;

		public Department(String departmentName, List<Applicant> applicant, List<Passenger> passenger) {
			super();
			DepartmentName = departmentName;
			this.applicant = applicant;
			this.passenger = passenger;
		}

		public String getDepartmentName() {
			return DepartmentName;
		}

		public void setDepartmentName(String departmentName) {
			DepartmentName = departmentName;
		}

		public List<Applicant> getApplicant() {
			return applicant;
		}

		public void setApplicant(List<Applicant> applicant) {
			this.applicant = applicant;
		}

		public List<Passenger> getPassenger() {
			return passenger;
		}

		public void setPassenger(List<Passenger> passenger) {
			this.passenger = passenger;
		}

		
		
		
}
