class Node{
    int data;
    Node next;
    Node(int a){
        data=a;
        next=null; 
    }
    public void getData(){
        System.out.println(data);
    }
    public static void main(String[] args){
        System.out.println("hill");
        Node a= new Node(100);
        System.out.println(a);
        a.getData();
        Node b= new Node(200);
        b.getData();
        Node c= new Node(300);
        c.getData();
        
        
        
    }
}
