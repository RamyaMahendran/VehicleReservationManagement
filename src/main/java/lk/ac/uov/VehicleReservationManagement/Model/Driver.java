package lk.ac.uov.VehicleReservationManagement.Model;

	import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
	@Entity
	public class Driver {
		@Id
		private String DriverID;
		private String DriverName;
		private String Mileage;
		private String Reports;
		
		@ManyToMany(mappedBy = "dri")
		private List<Vehicle> vehicle;


		@ManyToOne
		@JoinColumn(name="Admin",referencedColumnName="AdminID")
		private Admin admi;
		
		@ManyToMany
		@JoinTable(name="Itinerary_Driver",
		joinColumns = {@JoinColumn(name="drive",referencedColumnName="DriverID")},
				inverseJoinColumns = {@JoinColumn(name="itinerary",referencedColumnName="ItineraryID")}
		)
		private List<Itinerary> Iti;

		public Driver(String driverID, String driverName, String mileage, String reports, List<Vehicle> vehicle,
				Admin admi, List<Itinerary> iti) {
			super();
			DriverID = driverID;
			DriverName = driverName;
			Mileage = mileage;
			Reports = reports;
			this.vehicle = vehicle;
			this.admi = admi;
			Iti = iti;
		}

		public String getDriverID() {
			return DriverID;
		}

		public void setDriverID(String driverID) {
			DriverID = driverID;
		}

		public String getDriverName() {
			return DriverName;
		}

		public void setDriverName(String driverName) {
			DriverName = driverName;
		}

		public String getMileage() {
			return Mileage;
		}

		public void setMileage(String mileage) {
			Mileage = mileage;
		}

		public String getReports() {
			return Reports;
		}

		public void setReports(String reports) {
			Reports = reports;
		}

		public List<Vehicle> getVehicle() {
			return vehicle;
		}

		public void setVehicle(List<Vehicle> vehicle) {
			this.vehicle = vehicle;
		}

		public Admin getAdmi() {
			return admi;
		}

		public void setAdmi(Admin admi) {
			this.admi = admi;
		}

		public List<Itinerary> getIti() {
			return Iti;
		}

		public void setIti(List<Itinerary> iti) {
			Iti = iti;
		}
		
		
	
}
