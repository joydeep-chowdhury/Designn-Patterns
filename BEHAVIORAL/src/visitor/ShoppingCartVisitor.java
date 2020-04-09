package visitor;

public interface ShoppingCartVisitor {
  public abstract double visit(Table table);
  public abstract double visit(Chair chair);
}
