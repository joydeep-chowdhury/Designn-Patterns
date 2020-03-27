package factory;

public class AlgorithmFactory {
    public  static final int SHORTEST_PATH=0;
    public  static final int SPANNING_TREE=1;
    public static Algorithm getAlgo(int algoNum)
    {
    	switch(algoNum)
    	{
    	case SHORTEST_PATH: return new ShortestPathAlgo();
    	case SPANNING_TREE: return new SpanningTreeAlgo();
    	default:return null;
    	}
    }
}
