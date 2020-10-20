class SortedArray
{
    public static void main(String args[])
    {
        double a[]=new double[args.length];
        for(int i=0;i<args.length;i++)
        {
                a[i]=Double.parseDouble(args[i]);
        }
        System.out.println("original array:");
        for(int i=0;i<a.length;i++)
        {
                System.out.print(a[i]+"  ");
        }
        System.out.println();
        double temp=0.0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("sorted array:");
        for(int i=0;i<a.length;i++)
        {
                System.out.print(a[i]+"  ");
        }
    }
}
