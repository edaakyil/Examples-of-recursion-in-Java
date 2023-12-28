public class Main
{
	public static void main(String[] args) {
        Sample.recursion01(3);
	    System.out.println(Sample.factorial(5));
	    Sample.countDown01(5);
	    Sample.countDown02(5);
	    System.out.println(Sample.fibonacci(7));
	    System.out.println(Sample.sum(10));
	    System.out.println(Sample.sum(5, 10));
	}
}

class Sample {
    public static void recursion01(int n)
    {
        if (n >= 1) {
            recursion01(n - 1);
            System.out.println("n = " + n);
        }
    }
    
    public static int factorial(int n)
    {
        return (n == 0) ? 1 : (n * factorial(n - 1));
    }
    
    public static void countDown01(int n)
    {
        System.out.printf("%d ", n);
        
        if (n == 1) {
            System.out.println();
            return;
        }
            
        countDown01(n - 1);
    }
    
    public static void countDown02(int n)
    {
        if (n > 0) {
            System.out.printf("%d ", n);
            countDown02(n - 1);
        } else 
            System.out.println();
    }
    
    // 0 1 1 2 3 5 8 13 21 34
    public static int fibonacci(int n)
    {
        return (n <= 1) ? n : (fibonacci(n - 1) + fibonacci(n - 2));
    }
    
    // public static void qickSort(int [] arr, int low, int high)
    // {
    //     if (low < high) {
    //         int pivotIndex = partition(arr, low, high);
    
    //         quickSort(arr, low, pivotIndex - 1);
    //         quickSort(arr, pivotIndex + 1, high);
    //     }
    // }
    
    public static int sum(int k) {
        return (k > 0) ? (k + sum(k - 1)) : 0;
    }
    
    public static int sum(int start, int end)
    {
        return (end > start) ? (end + sum(start, end - 1)) : end;
    }
    
    
    
}
