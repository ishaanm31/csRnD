// Check handling of parameter case (Should reflect back to the caller)

public class Main {
	public static Node A;
	public static void main(String[] args) {
		Node B = new Node(); // <internal,0>
        Node C = new Node(); // <internal,8>
		foo(B);
        bar(B);
        func(B);
	}

	public static void foo(Node p1){
        Node D = new Node();
		bar(D);
		A = p1;
		p1.n = D;
	}

	public static void bar(Node p2) {
		Node F = new Node(); // <internal,0>
		//p2 = F;
	}

    public static void func(Node p3){
        //Node G = new Node();
        bar(p3);
    }
	
}