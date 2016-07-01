package spittr;

import java.util.Date;

public class Spittle
{
	private final Long id;
	private final String message;
	private final Date time;
	private Double latitude;
	private Double longitude;
	
	
	
	
	public Spittle(String message, Date time)
	{
		
		this(message, time, null, null);
	}



	public Spittle(String message, Date time, Double latitude, Double longtitude)
	{
	
		this.id = null;
		this.message = message;
		this.time = time;
		this.latitude = latitude;
		this.longitude = longtitude;
	}

	


	public Double getLatitude()
	{
		return latitude;
	}




	public void setLatitude(Double latitude)
	{
		this.latitude = latitude;
	}




	public Double getLongtitude()
	{
		return longitude;
	}




	public void setLongtitude(Double longtitude)
	{
		this.longitude = longtitude;
	}




	public Long getId()
	{
		return id;
	}




	public String getMessage()
	{
		return message;
	}




	public Date getTime()
	{
		return time;
	}



	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((latitude == null) ? 0 : latitude.hashCode());
		result = prime * result + ((longitude == null) ? 0 : longitude.hashCode());
		result = prime * result + ((message == null) ? 0 : message.hashCode());
		result = prime * result + ((time == null) ? 0 : time.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj)
	{
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Spittle other = (Spittle) obj;
		if (id == null)
		{
			if (other.id != null) return false;
		}
		else
			if (!id.equals(other.id)) return false;
		if (latitude == null)
		{
			if (other.latitude != null) return false;
		}
		else
			if (!latitude.equals(other.latitude)) return false;
		if (longitude == null)
		{
			if (other.longitude != null) return false;
		}
		else
			if (!longitude.equals(other.longitude)) return false;
		if (message == null)
		{
			if (other.message != null) return false;
		}
		else
			if (!message.equals(other.message)) return false;
		if (time == null)
		{
			if (other.time != null) return false;
		}
		else
			if (!time.equals(other.time)) return false;
		return true;
	}






	


	
	
	
}
