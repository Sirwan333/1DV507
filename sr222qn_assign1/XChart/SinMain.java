package sr222qn_assign1.XChart;

import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.XYChart;
import org.knowm.xchart.XYChartBuilder;

import java.util.ArrayList;

import java.util.List;
public class SinMain {

	public static void main(String[] args) {

		List<Double> xData = new ArrayList<Double>();
		List<Double> yData = new ArrayList<Double>();

		for(double x = 0; x < 2*Math.PI; x+=0.001){
			xData.add(x);
			yData.add((1 + x/Math.PI)*Math.cos(x)*Math.cos(40*x));
		}
		XYChart chart = new XYChartBuilder().xAxisTitle("X").yAxisTitle("Y").width(800).height(600).build();
        chart.getStyler().setMarkerSize(16);
        chart.getStyler().setHasAnnotations(true);

		chart.addSeries("the curve chart", xData, yData);
		new SwingWrapper<>(chart).displayChart();

	}

}
