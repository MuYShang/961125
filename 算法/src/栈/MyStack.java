package 栈;

public class MyStack {
    private int[] elements;
    public MyStack() {
        elements = new int[0];
    }

    //压栈
    public void push(int element){
        int newArr[] = new int[elements.length+1];
        for (int i = 0;i < elements.length;i++){
            newArr[i] = elements[i];
        }
        newArr[elements.length] = element;
        elements = newArr;
    }
    //取出栈顶元素
    public int pop(){
        if(elements.length == 0){
            throw new RuntimeException("栈为空");
        }
        int element = elements[elements.length - 1];
        int newArr [] = new int[elements.length - 1];
        for (int i = 0;i< newArr.length;i++){
            newArr[i] = elements[i];
        }
        elements = newArr;
        return element;
    }
    //查看栈顶元素
    public  int peek(){
        return  elements[elements.length-1];
    }

}
