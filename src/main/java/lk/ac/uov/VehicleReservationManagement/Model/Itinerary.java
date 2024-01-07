package lk.ac.uov.VehicleReservationManagement.Model;

	import java.util.Date;
	import java.util.List;

	import javax.persistence.Entity;
	import javax.persistence.Id;
	import javax.persistence.JoinColumn;
	import javax.persistence.ManyToMany;
	import javax.persistence.ManyToOne;

	@Entity
	public class Itinerary {
		@Id
		private String ItineraryID;
		private String DepartureLocation;
		private String ArivalLocation;
		private Date DepartureDate;
		private Date returnDate;
		private String DepartureTime;
		private String ReturnTime;
		private String VisitingPlaces;
		
		@ManyToOne
		@JoinColumn(name="Applicant",referencedColumnName="ApplicantID")
		private Applicant appli;
		
		@ManyToMany(mappedBy = "Iti")
		private List<Driver> drive;

		public Itinerary(String itineraryID, String departureLocation, String arivalLocation, Date departureDate,
				Date returnDate, String departureTime, String returnTime, String visitingPlaces, Applicant appli,
				List<Driver> drive) {
			super();
			ItineraryID = itineraryID;
			DepartureLocation = departureLocation;
			ArivalLocation = arivalLocation;
			DepartureDate = departureDate;
			this.returnDate = returnDate;
			DepartureTime = departureTime;
			ReturnTime = returnTime;
			VisitingPlaces = visitingPlaces;
			this.appli = appli;
			this.drive = drive;
		}

		public String getItineraryID() {
			return ItineraryID;
		}

		public void setItineraryID(String itineraryID) {
			ItineraryID = itineraryID;
		}

		public String getDepartureLocation() {
			return DepartureLocation;
		}

		public void setDepartureLocation(String departureLocation) {
			DepartureLocation = departureLocation;
		}

		public String getArivalLocation() {
			return ArivalLocation;
		}

		public void setArivalLocation(String arivalLocation) {
			ArivalLocation = arivalLocation;
		}

		public Date getDepartureDate() {
			return DepartureDate;
		}

		public void setDepartureDate(Date departureDate) {
			DepartureDate = departureDate;
		}

		public Date getReturnDate() {
			return returnDate;
		}

		public void setReturnDate(Date returnDate) {
			this.returnDate = returnDate;
		}

		public String getDepartureTime() {
			return DepartureTime;
		}

		public void setDepartureTime(String departureTime) {
			DepartureTime = departureTime;
		}

		public String getReturnTime() {
			return ReturnTime;
		}

		public void setReturnTime(String returnTime) {
			ReturnTime = returnTime;
		}

		public String getVisitingPlaces() {
			return VisitingPlaces;
		}

		public void setVisitingPlaces(String visitingPlaces) {
			VisitingPlaces = visitingPlaces;
		}

		public Applicant getAppli() {
			return appli;
		}

		public void setAppli(Applicant appli) {
			this.appli = appli;
		}

		public List<Driver> getDrive() {
			return drive;
		}

		public void setDrive(List<Driver> drive) {
			this.drive = drive;
		}
		
		


}
