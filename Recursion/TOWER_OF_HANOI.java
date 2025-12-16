class tower_of_hanoi
{
    public static void recursion(int n,String source,String helper,String dest)
    {
        if(n == 1)
        {
            System.out.println("transfer disk " + n + "from " + source + " to " + dest);
            return;
        }
        recursion(n-1, source, dest, helper);
        System.out.println("transfer disk " + n + "from " + source + " to " + dest);
        recursion(n-1, helper, source, dest);
    }
    public static void main(String[] args)
    {
        int n = 3;
        recursion(n,"s", "h","d");

    }
}