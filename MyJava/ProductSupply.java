import java.util.*;

class Supplier
{
    int supplierID;
    String supplierName;
    List<Product> supplierSpecificProduct=new ArrayList<>();

    public Supplier(int supplierID,String supplierName,List<Product> list)
    {
        this.supplierID=supplierID;
        this.supplierName=supplierName;
        this.supplierSpecificProduct=list;
    }

    @Override
    public String toString() 
	{
        StringBuilder stb=new StringBuilder("");
        for(int i=0;i<supplierSpecificProduct.size();i++)
        {
            if(stb.length() > 0)
            {
                stb.append(", ");
            }
            stb.append("[").append(supplierSpecificProduct.get(i).productId).append(", ").append(supplierSpecificProduct.get(i).productName).append("]");
        }
        return 
                "Supplier ID=" + supplierID +
                ", Supplier Name='" + supplierName + '\'' +
                ", Supplier's Product which they sell=" + stb ;
    }
}

class Product
{
    int productId;
    String productName;
    List<Supplier> productSoldBySuppliers=new ArrayList<>();

    public Product(int productId,String productName,List<Supplier> list)
    {
        this.productId=productId;
        this.productName=productName;
        this.productSoldBySuppliers=list;
    }

    @Override
    public String toString() 
	{
        StringBuilder stb=new StringBuilder("");
        for(int i=0;i<productSoldBySuppliers.size();i++)
        {
            if(stb.length() > 0)
            {
                stb.append(", ");
            }
            stb.append("[").append(productSoldBySuppliers.get(i).supplierID).append(", ").append(productSoldBySuppliers.get(i).supplierName).append("]");
        }

        return 
                "Product Id=" + productId +
                ", Product Name='" + productName + '\'' +
                ", Product List Sold By different Seller=" + stb ;
    }
}

public class ProductSupply 
{
    public static void main(String[] args) 
	{

        List<Product> productList=new ArrayList<>();
        List<Supplier> supplierList=new ArrayList<>();

        List<Supplier> supplierHasProductOne=new ArrayList<>();
        List<Supplier> supplierHasProductTwo=new ArrayList<>();
        List<Supplier> supplierHasProductThree=new ArrayList<>();
        List<Supplier> supplierHasProductFour=new ArrayList<>();
        List<Supplier> supplierHasProductFive=new ArrayList<>();


        List<Product> productListBySellerOne=new ArrayList<>();
        List<Product> productListBySellerTwo=new ArrayList<>();

        Product p1=new Product(101,"Bag",supplierHasProductOne);
        Product p2=new Product(102,"Laptop",supplierHasProductTwo);
        Product p3=new Product(103,"Suit",supplierHasProductThree);
        Product p4=new Product(104,"Shoes",supplierHasProductFour);
        Product p5=new Product(105,"Watch",supplierHasProductFive);

        productListBySellerOne.add(p1);
        productListBySellerOne.add(p2);
        productListBySellerOne.add(p3);
        productListBySellerOne.add(p5);

        productListBySellerTwo.add(p3);
        productListBySellerTwo.add(p4);
        productListBySellerTwo.add(p5);



        Supplier s1=new Supplier(1,"Amazon",productListBySellerOne);
        Supplier s2=new Supplier(2,"Flipkart",productListBySellerTwo);

        supplierHasProductOne.add(s1);
        supplierHasProductTwo.add(s1);
        supplierHasProductThree.add(s1);
		supplierHasProductFour.add(s1);
		supplierHasProductFive.add(s1);
		
        supplierHasProductThree.add(s2);
        supplierHasProductFour.add(s2);
        supplierHasProductFive.add(s2);
		
        productList.add(p1);
        productList.add(p2);
        productList.add(p3);
        productList.add(p4);
        productList.add(p5);

        supplierList.add(s1);
        supplierList.add(s2);

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Valid Product Id: ");
        int productId=sc.nextInt();

        if(productId == 101 || productId == 102 ||productId == 103 ||productId == 104 ||productId == 105)
        {
            for(int i=0;i<productList.size();i++)
            {
                if(productId == productList.get(i).productId)
                {
                    System.out.println(productList.get(i));
                }
            }
        }
        else
            System.out.println("Not A valid Product Id\n");

        System.out.println("\nEnter the Valid Supplier Id: ");
        int supplierId=sc.nextInt();

        if(supplierId == 1 || supplierId == 2)
        {
            for(int i=0;i<supplierList.size();i++)
            {
                if(supplierId == supplierList.get(i).supplierID)
                {
                    System.out.println(supplierList.get(i));
                }
            }
        }
        else
            System.out.println("Not A valid Supplier Id");



    }
}
