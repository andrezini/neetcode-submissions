class MyStack {
        ArrayList<Integer> n;
    public MyStack() {
        this.n = new ArrayList<>();
    }
    
    public void push(int x) {
        n.add(x);
    }
    
    public int pop() {
        
        return n.remove(n.size() - 1);

    }
    
    public int top() {
       return n.get(n.size()-1);
    }
    
    public boolean empty() {
        return n.size()==0;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */