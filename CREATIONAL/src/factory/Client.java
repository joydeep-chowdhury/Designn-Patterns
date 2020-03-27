package factory;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Algorithm algo=AlgorithmFactory.getAlgo(AlgorithmFactory.SHORTEST_PATH);
        algo.solve();
        Algorithm algo2=AlgorithmFactory.getAlgo(AlgorithmFactory.SPANNING_TREE);
        algo2.solve();
	}

}
