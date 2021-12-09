package com.bilgeadam.hayvanlaralemi;

public class GenelOzellikler {
	protected String ureme;
	protected String tuketim;
	protected String hareket;
	protected String adi;
	
	public GenelOzellikler() {
		// TODO Auto-generated constructor stub
	}
	
	public GenelOzellikler(String ureme, String tuketim, String hareket,String adi) {
		super();
		this.ureme = ureme;
		this.tuketim = tuketim;
		this.hareket = hareket;
		this.adi=adi;
	}
	

	
	@Override
	public String toString() {
		return "GenelOzellikler [ureme=" + ureme + ", tuketim=" + tuketim + ", hareket=" + hareket + ", adi=" + adi
				+ "]";
	}

	public String getUreme() {
		return ureme;
	}
	
	public void setUreme(String ureme) {
		this.ureme = ureme;
	}
	
	public String getTuketim() {
		return tuketim;
	}
	
	public void setTuketim(String tuketim) {
		this.tuketim = tuketim;
	}
	
	public String getHareket() {
		return hareket;
	}
	
	public void setHareket(String hareket) {
		this.hareket = hareket;
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}
	
}
