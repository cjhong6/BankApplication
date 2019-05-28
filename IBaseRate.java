package bacnkaccountapp;

public interface IBaseRate {
	//Write method that return base rate 
	default double getBaseRate() {
		return 2.5;
	}
}
