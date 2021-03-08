class team{
    public static int counter;
	public int id;
	public String name;
	static {
	    counter=0;
	}
	public team(){
	   id=++counter;
	}
	public void output(){
	    System.out.println("id:"+id+"Name:"+name);
		System.out.println("共有"+counter+"名成員");
	}
}
public class java9{
    public static void main(String[] args){
	   team t1 = new team();
	   t1.name = "A";
	   t1.output();
	   team t2 = new team();
	   t2.name = "B";
       t2.output();
    }
}
