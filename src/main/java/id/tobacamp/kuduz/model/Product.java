package id.tobacamp.kuduz.model;

public class Product
{
	public Product(String productid, String name, String productnumber)
	{
		this.productid = productid;
		this.name = name;
		this.productnumber = productnumber;
	}

	public String getProductid()
	{
		return productid;
	}

	public void setProductid(String productid)
	{
		this.productid = productid;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getProductnumber()
	{
		return productnumber;
	}

	public void setProductnumber(String productnumber)
	{
		this.productnumber = productnumber;
	}
//
	private String productid;
	private String name;
	private String productnumber;

}
