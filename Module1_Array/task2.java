class Main {
    public static void main(String[] args) {

        int[] n = new int[10];
        int cz = 0;

        for (int i = 0; i < 5; i++) {
            n[i] = i + 1;
        }

        cz = 5;
        
        System.out.println(" total capacity is "+ n.length);
        
        System.out.println(" After initializing 5 values manually ");
        
        System.out.println(" current size is "+ cz);
        
        for (int i = 0; i < n.length; i++) {
            
            System.out.println(i + " index "+n[i]);  
        }
        // operation 1 (append)
        if (cz < n.length) {
            n[cz] = 100;   
            cz++;        
            
        }
        System.out.println(" _________After append: _______");

       
       System.out.println(" current size is "+ cz);
        
        for (int i = 0; i < n.length; i++) {
            
            System.out.println(i + " index "+n[i]);  
        }
        //operation 2 (pop)
        if (cz > 0) {
            n[cz-1]=0;
            cz--;          
                
            
        }
        System.out.println(" _________After pop: _______");

       
       System.out.println(" current size is "+ cz);
        
        for (int i = 0; i < n.length; i++) {
            
            System.out.println(i + " index "+n[i]);  
        }
        
        // insertion oparation
        
        //index where to insert our new value
        
        int postionOfIndex=2;
        int insertingVal =200;
        
        if((cz<n.length) && (postionOfIndex > 0) && (postionOfIndex < cz)){
        
        
        
        for(int i=cz; i>postionOfIndex;i--){
            n[i]=n[i-1];
        }
        
        n[postionOfIndex]=insertingVal;
        cz++;
        }
        else{
            System.out.println("array is full cann't perform insertion now or invalid index to insert");
        }
        
        System.out.println(" _________After Insertion: _______");

       
       System.out.println(" current size is "+ cz);
        
        for (int i = 0; i < n.length; i++) {
            
            System.out.println(i + " index "+n[i]);  
        }
        
        // deletion oparation
        
        // which index val to be deleted
        
        int postionOfIndexToDel=2;
        
        if((cz>0) && (postionOfIndex > 0) && (postionOfIndex < cz)){
            
            for(int i=postionOfIndexToDel;i<cz-1;i++ ){
                n[i]=n[i+1];
            }
            n[cz-1]=0 ;// option while class
            cz--;
            
        }
        else{
            System.out.println("array is empty cann't perform deletion now or invalid index to insert");
        }
        
        System.out.println(" _________After Deletion: _______");

       
       System.out.println(" current size is "+ cz);
        
        for (int i = 0; i < n.length; i++) {
            
            System.out.println(i + " index "+n[i]);  
        }
        
        
        
        



        
    }
}
