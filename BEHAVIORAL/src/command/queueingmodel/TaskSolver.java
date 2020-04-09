package command.queueingmodel;

public class TaskSolver implements Command
      {
          private Task task;

		public TaskSolver(Task task) {
			super();
			this.task = task;
		}

		@Override
		public void execute() {
			this.task.solveProblem();
		}
          
      }
