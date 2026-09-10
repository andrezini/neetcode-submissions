class MinStack {
    ArrayList<Integer> l;
    ArrayList<Integer> ml;


    public MinStack() {
       
        this.l = new ArrayList<Integer>();
        this.ml = new ArrayList<Integer>();
    }
    
    public void push(int val) {
        this.l.add(val);
        if(ml.isEmpty()){
            ml.add(val);
        }else{
            ml.add(Math.min(this.ml.getLast(), val));
        }
    }
    
    public void pop() {
        this.l.removeLast();
        this.ml.removeLast();
    }
    
    public int top() {
       return l.getLast();
    }
    
    public int getMin() {
        return this.ml.getLast();
    }
}
