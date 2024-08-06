
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] Speeds = {{128, 135, 139}, {155, 129, 175}, {129, 130, 185}, {195,155,221}};
		String [] cities = {"JHB", "DBN", "CTN", "PE"};
		
		System.out.println("*******************************************************************************");
		System.out.println("SPEEDING FINES REPORT");
		System.out.println("*******************************************************************************");
		
		System.out.println("\t\t"+"JAN"+"\t\t"+"FEB"+"\t\t"+"MAR");
		for (int i = 0; i<Speeds.length; i++) {	
			 System.out.print(cities[i]+"\t\t");
		    for (int j = 0; j<Speeds[i].length; j++) {	
		        System.out.print(Speeds[i][j]+"km"+ "\t\t");
		    }
		    System.out.println();
		}
		System.out.println("*******************************************************************************");
		System.out.println("SPEEDING FINES STATISTICS");
		System.out.println("*******************************************************************************");
		
		System.out.println("Maximum speed captured: "+ getMaxValue(Speeds)+"km");
		System.out.println("Minimum speed captured: "+ getMinValue(Speeds)+"km");
		
		System.out.println("*******************************************************************************");
		
	}
	
	   public static int getMaxValue(int[][] Speeds) {
	        int maxValue = Speeds[0][0];
	        for (int j = 0; j < Speeds.length; j++) {
	            for (int i = 0; i < Speeds[j].length; i++) {
	                if (Speeds[j][i] > maxValue) {
	                    maxValue = Speeds[j][i];
	                }
	            }
	        }
	        return maxValue;
	    }

	    public static int getMinValue(int[][] Speeds) {
	        int minValue = Speeds[0][0];
	        for (int j = 0; j < Speeds.length; j++) {
	            for (int i = 0; i < Speeds[j].length; i++) {
	                if (Speeds[j][i] < minValue ) {
	                    minValue = Speeds[j][i];
	                }
	            }
	        }
	        return minValue ;
	    }

}
