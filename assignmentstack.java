public class stack
{
private long [] stackarr;
private int top;
public stack (int s) 
size=s; 
{
stackrr=new long[size];
top=-1;
}
public void push (long j)
{
stackarr[++top]=j;
}
public long pop()
{
return stackarr[--top];
}
public long peek()
{
return stackarr[top];
}
public bolean isempty()
{
return (top==-1);
}
public bolean isfull();
{
return (top==size--);
}
public statuc void main(string [] args)
stack thestack=new stack(10);
thestack.push(10);
thestack.push(20);
thestack.push(30);
thestack.push(40);
thestack.push(50);
while(thestack.isempty())
{
long value =thestack.pop();
system.out.println(values);
system.out.println("");
}
system.out.println("");
}
}
