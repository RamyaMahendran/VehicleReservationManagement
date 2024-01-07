package lk.ac.uov.VehicleReservationManagement.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Applicant {
	
		@Id
		private String ApplicantID;
		private String ApplicantName;
		private String Designation;
		private String ContactNumber;
		private String Purpose;
		
		@ManyToOne
		@JoinColumn(name="deptName",referencedColumnName="DepartmentName")
		private Department department;
		
		@OneToMany(mappedBy = "applicant")
		private List<Passenger>passenger;
		
		@ManyToOne
		@JoinColumn(name="Admin",referencedColumnName="AdminID")
		private Admin admin;
		
		@OneToMany(mappedBy = "appli")
		private List<Itinerary>itinerary;

		public Applicant(String applicantID, String applicantName, String designation, String contactNumber,
				String purpose, Department department, List<Passenger> passenger, Admin admin,
				List<Itinerary> itinerary) {
			super();
			ApplicantID = applicantID;
			ApplicantName = applicantName;
			Designation = designation;
			ContactNumber = contactNumber;
			Purpose = purpose;
			this.department = department;
			this.passenger = passenger;
			this.admin = admin;
			this.itinerary = itinerary;
		}

		public String getApplicantID() {
			return ApplicantID;
		}

		public void setApplicantID(String applicantID) {
			ApplicantID = applicantID;
		}

		public String getApplicantName() {
			return ApplicantName;
		}

		public void setApplicantName(String applicantName) {
			ApplicantName = applicantName;
		}

		public String getDesignation() {
			return Designation;
		}

		public void setDesignation(String designation) {
			Designation = designation;
		}

		public String getContactNumber() {
			return ContactNumber;
		}

		public void setContactNumber(String contactNumber) {
			ContactNumber = contactNumber;
		}

		public String getPurpose() {
			return Purpose;
		}

		public void setPurpose(String purpose) {
			Purpose = purpose;
		}

		public Department getDepartment() {
			return department;
		}

		public void setDepartment(Department department) {
			this.department = department;
		}

		public List<Passenger> getPassenger() {
			return passenger;
		}

		public void setPassenger(List<Passenger> passenger) {
			this.passenger = passenger;
		}

		public Admin getAdmin() {
			return admin;
		}

		public void setAdmin(Admin admin) {
			this.admin = admin;
		}

		public List<Itinerary> getItinerary() {
			return itinerary;
		}

		public void setItinerary(List<Itinerary> itinerary) {
			this.itinerary = itinerary;
		}
		
		
}
