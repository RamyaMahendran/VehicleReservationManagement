package lk.ac.uov.VehicleReservationManagement.Model;



	import java.util.List;

	import javax.persistence.Entity;
	import javax.persistence.Id;
	import javax.persistence.JoinColumn;
	import javax.persistence.JoinTable;
	import javax.persistence.ManyToMany;
	import javax.persistence.ManyToOne;

		@Entity
		public class Vehicle {
			@Id
			private String VehicleNumber;
			private String VehicleType;
			private String ConditionReport;
			
			@ManyToMany
			@JoinTable(name="Vehicle_Driver",
			joinColumns = {@JoinColumn(name="vehicle",referencedColumnName="VehicleNumber")},
					inverseJoinColumns = {@JoinColumn(name="driver",referencedColumnName="DriverID")}
			)
			private List<Driver> dri;
			
			@ManyToOne
			@JoinColumn(name="Admin",referencedColumnName="AdminID")
			private Admin admit;

			public Vehicle(String vehicleNumber, String vehicleType, String conditionReport, List<Driver> dri,
					Admin admit) {
				super();
				VehicleNumber = vehicleNumber;
				VehicleType = vehicleType;
				ConditionReport = conditionReport;
				this.dri = dri;
				this.admit = admit;
			}

			public String getVehicleNumber() {
				return VehicleNumber;
			}

			public void setVehicleNumber(String vehicleNumber) {
				VehicleNumber = vehicleNumber;
			}

			public String getVehicleType() {
				return VehicleType;
			}

			public void setVehicleType(String vehicleType) {
				VehicleType = vehicleType;
			}

			public String getConditionReport() {
				return ConditionReport;
			}

			public void setConditionReport(String conditionReport) {
				ConditionReport = conditionReport;
			}

			public List<Driver> getDri() {
				return dri;
			}

			public void setDri(List<Driver> dri) {
				this.dri = dri;
			}

			public Admin getAdmit() {
				return admit;
			}

			public void setAdmit(Admin admit) {
				this.admit = admit;
			}
		
		
}



