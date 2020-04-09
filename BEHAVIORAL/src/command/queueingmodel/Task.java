package command.queueingmodel;

public class Task {
	private int id;

	public Task(int id) {
		this.id = id;
	}

	public void solveProblem() {
		System.out.println("Solving problem for task id" + this.id);
	}

}
