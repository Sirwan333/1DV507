package sr222qn_assign1.XChart;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import org.knowm.xchart.CategoryChart;
import org.knowm.xchart.CategoryChartBuilder;
import org.knowm.xchart.PieChart;
import org.knowm.xchart.PieChartBuilder;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.style.Styler.LegendPosition;

public class Histogram {

	public static void main(String[] args) {

		try {
			readFile("C:\\Users\\serwa\\eclipse-workspace\\java_courses\\1DV506\\src\\sr222qn_assign4\\Integers.txt");
			CategoryChart barChart = new CategoryChartBuilder().width(800).height(600).title("How many Integers").xAxisTitle("Integers").yAxisTitle("Quantity").build();
			barChart.getStyler().setLegendPosition(LegendPosition.InsideNW);
			barChart.getStyler().setHasAnnotations(true);
			barChart.addSeries("Quantity", Arrays.asList(new Integer[] { 1 - 10, 11 - 10, 21 - 30 , 31-40 , 41-50 , 51-60 , 61-70 , 71-80, 81-90 , 91-100 , }), Arrays.asList(new Integer[] { numbers[0], numbers[1], numbers[2], numbers[3] , numbers[4] , numbers[5] , numbers[6], numbers[7], numbers[8],numbers[9], }));
			new SwingWrapper<CategoryChart>(barChart).displayChart();

			PieChart chart = new PieChartBuilder().width(800).height(600).title("How many Integers").build();

			chart.addSeries("1   - 10   | ", numbers[0]);
			chart.addSeries("11   - 20   | ", numbers[1]);
			chart.addSeries("21   - 30   | ", numbers[2]);
			chart.addSeries("31   - 40   | ", numbers[3]);
			chart.addSeries("41   - 50   | ", numbers[4]);
			chart.addSeries("51   - 60   | ", numbers[5]);
			chart.addSeries("61   - 70   | ", numbers[6]);
			chart.addSeries("71   - 80   | ", numbers[7]);
			chart.addSeries("81   - 90   | ", numbers[8]);
			chart.addSeries("91   - 100   | ", numbers[9]);
			chart.addSeries("Others", others);			
			new SwingWrapper<PieChart>(chart).displayChart();
		} 

		catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	private static int[] numbers = new int[10];
	private static int others = 0;

	public static void readFile(String x) throws IOException {
		int rest = 0;
		File file = new File(x);
		Scanner sc = new Scanner(file);

		while (sc.hasNext()) 
		{
			int num = sc.nextInt();
			if ((num < 0)||(num > 100) ) 
			{ 
				rest++;
			}
			else 
			{	
				int n = ((num - 1) / 10);
				numbers[n]++;
			}
		}
		others = rest;
		sc.close();
	}
}
