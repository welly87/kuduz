package id.tobacamp.kuduz.model;

import org.springframework.data.annotation.Id;
import java.sql.Date;

public class Account
{
	@Id
	private long accountId;

	private long districtId;

	private String frequency;

	private Date date;

	public long getAccountId()
	{
		return accountId;
	}

	public void setAccountId(long accountId)
	{
		this.accountId = accountId;
	}

	public long getDistrictId()
	{
		return districtId;
	}

	public void setDistrictId(long districtId)
	{
		this.districtId = districtId;
	}

	public String getFrequency()
	{
		return frequency;
	}

	public void setFrequency(String frequency)
	{
		this.frequency = frequency;
	}

	public Date getDate()
	{
		return date;
	}

	public void setDate(Date date)
	{
		this.date = date;
	}

}
