package Data;

public class Client {
	//private int id;
	double gain;
	private double[] time_lapse;
	double service_duration;
	
	public Client(){
		this.gain = 0;
		this.time_lapse = new double[2];
		this.time_lapse[0] = 0;
		this.time_lapse[1] = 0;
		this.service_duration = 0;
	}
	public Client(double gain, double[] time_lapse, double service_duration){
		this.gain = gain;
		this.time_lapse = time_lapse;
		this.service_duration = service_duration;	
	}
	//zwraca true jesli godzina przyjazdu miesci sie  w time_lapse
	boolean is_in_time_lapse(double time){
		if(time>=time_lapse[0] && time<=time_lapse[1])
			return true;
		return false;
	}
	public double[] get_time_lapse(){
		return this.time_lapse;
	}
	public double get_gain(){
		return this.gain;
	}
	public double get_ser_dur(){
		return this.service_duration;
	}
	public void mod_time_lapse(double[] time_lapse){
		this.time_lapse = time_lapse;
	}
	public void mod_gain(double gain){
		this.gain = gain;
	}
	public void mod_ser_dur(double ser_dur){
		this.service_duration = ser_dur;
	}
}
