package week03.lecture;
public Class Example{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number : ");
        double number = sc.nextDouble();
        sc.close();
        double check01 = (number * 100)%100;
        int check02 = (int) number;
        System.out.print(number + " is the ");
        if(number > 0){
            System.out.print("negative ");
        }
        else{
            System.out.print("positive ");
        }
        if(check02%2 == 0){
            System.out.print("even ");
        }
        else{
            System.out.print("odd ");
        }
        if(check01 != 0){
            System.out.println("real number.");
        }else{
            System.out.print("integer number.");
        }
    }
}
