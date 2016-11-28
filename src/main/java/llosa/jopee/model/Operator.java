package llosa.jopee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "operator")
public class Operator {
	
	@Id
	@Column(name = "operatorid")
	private int opratorId;
	
	@Column(name = "firstname")
	private String firstName;
	
	@Column(name = "lastname")
	private String lastName;
	
	@Column(name = "cityortownaddress")
	private String cityOrTownAddress;
	
	@Column(name = "streetaddress")
	private String streetAddress;
	
	@Column(name = "barangayaddress")
	private String barangayAddress;
	
	@Column(name = "locationDetails")
	private String locationDetails;

	public Operator() {
		
	}	
	public int getOpratorId() {
		return opratorId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getCityOrTownAddress() {
		return cityOrTownAddress;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public String getBarangayAddress() {
		return barangayAddress;
	}

	public String getLocationDetails() {
		return locationDetails;
	}

	public void setOpratorId(int opratorId) {
		this.opratorId = opratorId;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setCityOrTownAddress(String cityOrTownAddress) {
		this.cityOrTownAddress = cityOrTownAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public void setBarangayAddress(String barangayAddress) {
		this.barangayAddress = barangayAddress;
	}

	public void setLocationDetails(String locationDetails) {
		this.locationDetails = locationDetails;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((barangayAddress == null) ? 0 : barangayAddress.hashCode());
		result = prime * result + ((cityOrTownAddress == null) ? 0 : cityOrTownAddress.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((locationDetails == null) ? 0 : locationDetails.hashCode());
		result = prime * result + opratorId;
		result = prime * result + ((streetAddress == null) ? 0 : streetAddress.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Operator other = (Operator) obj;
		if (barangayAddress == null) {
			if (other.barangayAddress != null)
				return false;
		} else if (!barangayAddress.equals(other.barangayAddress))
			return false;
		if (cityOrTownAddress == null) {
			if (other.cityOrTownAddress != null)
				return false;
		} else if (!cityOrTownAddress.equals(other.cityOrTownAddress))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (locationDetails == null) {
			if (other.locationDetails != null)
				return false;
		} else if (!locationDetails.equals(other.locationDetails))
			return false;
		if (opratorId != other.opratorId)
			return false;
		if (streetAddress == null) {
			if (other.streetAddress != null)
				return false;
		} else if (!streetAddress.equals(other.streetAddress))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Operator [opratorId=" + opratorId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", cityOrTownAddress=" + cityOrTownAddress + ", streetAddress=" + streetAddress + ", barangayAddress="
				+ barangayAddress + ", locationDetails=" + locationDetails + "]";
	}
}
