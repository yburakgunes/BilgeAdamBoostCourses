package com.bilgeadam.computer.ram;

import com.bilgeadam.computer.CommonVariables;

public class Ram extends CommonVariables {
	protected int frequency;
	protected int delay;
	protected int memory;
	
	public Ram() {
		
	}
	
	public Ram(String model, int frequency, int delay, int memory) {
		super(model);
		
		this.frequency = frequency;
		this.delay = delay;
		this.memory = memory;
		
	}
	
	@Override
	public String toString() {
		return "Ram [frequency=" + frequency + ", delay=" + delay + ", memory=" + memory + ", model=" + model + "]";
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