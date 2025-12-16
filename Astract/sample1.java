abstract class parent //if in the class has abstract method then class has also abstract class.
{
    void hello()
    {
        System.out.println("hello this is parent class");
    }
    abstract public void namastey(int no);//abstract method
}
class child extends parent
{
    @Override
    public void namastey(int no)//it can override namastey method of parent class
    {
        System.out.println("hello this is child class function");
    }

}
class sample1
{
    public static void main(String[] args)
    {
        child c = new child();
        c.namastey(10);
        c.hello();
    }
}