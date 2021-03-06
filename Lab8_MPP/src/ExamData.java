import java.util.*;

public class ExamData {
	
	private String studentName;
	private double testScore;
	
	public ExamData(String  name, double score) {
		studentName = name;
		testScore = score;
	}
	
	public double getTestScore() {
		return testScore;
	}

	public static void main(String[] args) {
		List<ExamData> data = new ArrayList<ExamData>();
		
		data.add(new ExamData("George", 91.3));
		data.add(new ExamData("Tom", 88.9));
		data.add(new ExamData("Rick", 80));
		data.add(new ExamData("Harold", 90.8));
		data.add(new ExamData("Ignatius", 60.9));
		data.add(new ExamData("Anna", 87));
		data.add(new ExamData("Susan", 87.3));
		data.add(new ExamData("Phil", 99.1));
		data.add(new ExamData("Alex", 84));
		
		DoubleSummaryStatistics doubleSummaryStatistics = new DoubleSummaryStatistics();
		data.stream()
		.mapToDouble(ExamData::getTestScore)
		.forEach(doubleSummaryStatistics);
		
		System.out.println("Max: " + doubleSummaryStatistics.getMax());
		System.out.println("Lowest: " + doubleSummaryStatistics.getMin());
		System.out.println("Average: " + doubleSummaryStatistics.getAverage());

	}

}
