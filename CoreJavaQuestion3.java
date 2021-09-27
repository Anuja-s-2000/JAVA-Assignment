class Data{
    private int data;
    public Data(int data){
        this.data=data;
    }
    public synchronized int process(){
        return this.data*2;
    }
    public synchronized int fetch(){
        return this.data;
    }
}
class FetchData extends Thread{
    private Data data;
    public FetchData(Data d){
      this.data=d;
    }
    @Override
	public void run() {
            
        try{
            System.out.println(Thread.currentThread().getName());
            System.out.println("Data:"+data.fetch()); 
            Thread.sleep(5000);
        }
        catch(Exception e){
            System.out.println(e);
        }
}
}
class ProcessData implements Runnable{
    private Data data;
    public ProcessData(Data d){
      //Thread.setName("Process data Thread");
      this.data=d;
    }
    @Override
	public void run() {   
        try{ 
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName());
            System.out.println("Processed Data:"+data.process());   
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }
}


public class CoreJavaQuestion3 {
    public static void main(String[] args){
    Data data=new Data(5);
    FetchData t1=new FetchData(data);
    t1.setName("Fetch Data Thread");
    Thread t2=new Thread(new ProcessData(data));
    t2.setName("Process Data Thread");
    try{
    t1.start();
    t1.join();
    t2.start();
    }
    catch(InterruptedException e){
        System.out.println("\nTHREADS INTERRUPTED!");
    }
   
}
}