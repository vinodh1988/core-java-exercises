package com.sterling.samples;

public class Sample {
       public Sample() {
    	   System.out.printf("\n This instance is up...%x",hashCode());
       }
       
       public void show(String ref) {
    	   System.out.printf("\n This refererence  %s is holding %x",ref,hashCode());
       }

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.printf("\n Deleted ...%x",hashCode());
	}
       
       
}
