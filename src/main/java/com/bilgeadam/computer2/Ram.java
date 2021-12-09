package com.bilgeadam.computer2;

public class Ram extends CommonProperty {
	private int frequency;
	private int delay;
	private int memory;
	
	@Override
	public void deneme2() {
		// TODO Auto-generated method stub
		
	}
	
	public Ram() {
		// TODO Auto-generated constructor stub
	}
	
	public Ram(String model, String year, int frequency, int delay, int memory) {
		super(model, year);
		
		this.frequency = frequency;
		this.delay = delay;
		this.memory = memory;
	}
	
	@Override
	public String toString() {
		return "Ram [frequency=" + frequency + ", delay=" + delay + ", memory=" + memory + ", model=" + model
				+ ", year=" + year + "]";
	}
	
	public int getFrequency() {
		return frequency;
	}
	
	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}
	
	public int getDelay() {
		return delay;
	}
	
	public void setDelay(int delay) {
		this.delay = delay;
	}
	
	public int getMemory() {
		return memory;
	}
	
	public void setMemory(int memory) {
		this.memory = memory;
	}
	
}
