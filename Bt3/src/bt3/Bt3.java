/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bt3;
import java.util.Random;

/**
 *
 * @author Smalldevil
 */
public class Bt3 {

    /**
     * @param args the command line arguments
     */
    
    //kiểm tra số nguyên tố
    static int ktsongto(int a)
    {
        if ((a==1)||(a==0)) return 0;
        for (int i=2;i<a;i++)
        {
            if(a%i==0) return 0;
        }
        return 1;
    }

    public static void main(String[] args)
    {
        int n=30;
        Random rn=new Random();
        int x=rn.nextInt(100);
        
        int arr[]=new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i]=rn.nextInt(100);
            //System.out.print(arr[i]+" ")
        }
        System.out.println();
        
        //tìm phần tử có giá trị x
        int tinh=0;
        for (int i=0;i<n;i++)
        {
            if (x==arr[i])
            {
                System.out.println("Tim thay gia tri x="+x+" tai phan tu thu "+(i+1)+" cua mang");
                tinh++;
            }
        }
        if (tinh==0)
            System.out.println("Khong tim thay gia tri x="+x+" trong mang");
        
        //sắp xếp mảng tăng dần
        for (int i=0;i<n-1;i++)
            for (int j=i;j<n;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        //System.out.print("Mang duoc xep tang dan: ")
        for (int i=0;i<n;i++)
        {
            //System.out.print(arr[i]+" ")
        }
        System.out.println();
        
        //tìm min, max
        int min=arr[0];
        int max=arr[0];
        for (int i=1; i<n;i++)
        {
            if (arr[i]>max)
                max=arr[i];
        }
        for (int i=1; i<n;i++)
        {
            if (arr[i]<min)
                min=arr[i];
        }
        System.out.println("Phan tu nho nhat trong mang: "+min);
        System.out.println("Phan tu lon nhat trong mang: "+max);
        
        //tính số chẵn
        int dem=0;
        System.out.print("Cac so chan trong day la: ");
        for (int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
                System.out.print(arr[i]+" ");
                dem++;
            }
        }
        System.out.println();
        System.out.println("So so chan trong mang la: "+dem);
        
        //tìm số nguyên tố
        int count=0;
        for (int i=0;i<n;i++)
        {
            if(ktsongto(arr[i])==1) count++;
        }
        if (count>0)
        {
            System.out.print("Cac so nguyen to la: ");
            for (int i=0;i<n;i++)
            {
                if(ktsongto(arr[i])==1)
                    System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        System.out.println("So so nguyen to la: "+count);
        
    }
}
