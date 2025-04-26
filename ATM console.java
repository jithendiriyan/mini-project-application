
import java.net.PasswordAuthentication;
import java.util.Scanner;

class ATM {
    static int n;
    static int with;
    static int jeeva;
    static int v;
    static int z=50000;
    private static Scanner sc;
    static int arr[]={0,0,0,0};
    static String tarr[]={"0","0"};
    static int ary[]={0,0,0,0};
    static int Name;
    static int ab;
    static String username;
    static void back(){
        System.out.print("\033[H\033[2J");  
        System.out.flush();
        System.out.println("1. Loadamount");
        System.out.println("2. Showamount");
        System.out.println("3. Exit");
        ab=0;   
        boolean jd=true;
       
         do{
            ab=sc.nextInt();
            switch(ab){
                case 1:
                System.out.print("\033[H\033[2J");  
                System.out.flush();
                System.out.println("Enter the amountvalue");
                System.out.println("Enter no of 2000");
                int a1=sc.nextInt();
                System.out.println("Enter no of 500");
                int a2=sc.nextInt();
                System.out.println("Enter no of 200");
                int a3=sc.nextInt();
                System.out.println("Enter no of 100");
                int a4=sc.nextInt();
                arr[0]+=a1;
                arr[1]+=a2;
                arr[2]+=a3;
                arr[3]+=a4;
                int jp=sc.nextInt();
                if(jp==0){
                   jev=false; 
                }
                break;
               
                case 2:
                System.out.print("\033[H\033[2J");  
                System.out.flush(); 
                System.out.println("Balance amount");
                System.out.println("No.of.2000 rupees note:  "+arr[0]);
                System.out.println("No.of.500 rupees note:   "+arr[1]);
                System.out.println("No.of.200 rupees note:   "+arr[2]);
                System.out.println("No.of.100 rupees note:   "+arr[3]);
                int v=(((arr[0]*2000)+(arr[1]*500)+(arr[2]*200)+(arr[3]*100)));
                System.out.println("Balance Amount ="+v);
                
                     String jp1=sc.nextLine();
                     if(jp1.equals("")){
                         System.out.println("Press Enter to continue");
                         sc.nextLine();
                      back();
                     }
                     case 3:
                     break;
                }
                break; 
              
                
                
           
        }while(jd);
        
        
    }
    static void exit(){
        int ch=0;
        int password =0;
        int va=0;
        int cd=0;
        boolean jv=true;
        do{
            System.out.print("\033[H\033[2J");  
            System.out.flush();
            System.out.println("Hello...!Welcome Back to Bank...!");
            System.out.println("1. Admin Login");
            System.out.println("2. User Login");
            System.out.println("3. Exit");
            ch=sc.nextInt();
            
            int ab=0;
            sc.nextLine();
          
            switch(ch){
                case 1:
                System.out.print("\033[H\033[2J");  
                System.out.flush();
                System.out.println("Welcome Admin");
                System.out.println("1.Enter Adminname");
                username=sc.nextLine();
                System.out.println("2. Enter password");
                
                
                 password=sc.nextInt();
                sc.nextLine();
                if(username.equals("jiju") && password==1234){
                    System.out.print("\033[H\033[2J");  
                    System.out.flush();
                    System.out.println("1. Loadamount");
                    System.out.println("2. Showamount");
                    System.out.println("3. Exit");
                    ab=0;   
                    boolean jd=true;
                   
                     do{
                        ab=sc.nextInt();
                        switch(ab){
                            case 1:
                            System.out.print("\033[H\033[2J");  
                            System.out.flush();
                            System.out.println("Enter the value of Amount");
                            System.out.println("Enter.count.of 2000");
                            int a1=sc.nextInt();
                            System.out.println("Enter.count.of 500");
                            int a2=sc.nextInt();
                            System.out.println("Enter.count.of 200");
                            int a3=sc.nextInt();
                            System.out.println("Enter.count.of 100");
                            int a4=sc.nextInt();
                            arr[0]+=a1;
                            arr[1]+=a2;
                            arr[2]+=a3;
                            arr[3]+=a4;
                            System.out.println("Please enter to exit..!");
                                 String jp2=sc.nextLine();
                                 if(jp2.equals("")){
                                    back();
                                 }
                            break;
                           
                            case 2:
                            System.out.print("\033[H\033[2J");  
                            System.out.flush(); 
                            System.out.println("Balance amount");
                            System.out.println("No.of.2000 rupees :  "+arr[0]);
                            System.out.println("No.of.500 rupees :   "+arr[1]);
                            System.out.println("No.of.200 rupees :   "+arr[2]);
                            System.out.println("No.of.100 rupees :   "+arr[3]);
                            int v=((arr[0]*2000)+(arr[1]*500)+(arr[2]*200)+(arr[3]*100)-jeeva);
                            System.out.println("Balance amount ="+v);
                            sc.nextLine();   
                            if(arr[0]>ary[0]){
                                arr[0]-=ary[0];
                                System.out.println("No.of.2000 rupees:  "+arr[0]);
                            }
                            if(arr[1]>arr[1]){
                                arr[1]-=ary[1];
                                System.out.println("No.of.500 rupees:   "+arr[1]);
                            }
                            if(arr[2]>ary[2]){
                                arr[2]-=ary[2];
                                System.out.println("No.of.200 rupees:   "+arr[2]);
                            }
                            if(arr[3]>arr[3]){
                                arr[3]-=ary[3];
                                System.out.println("No.of.100 rupees:   "+arr[3]);
                            }
                            System.out.println("Please enter to exit..!");
                                 String jp1=sc.nextLine();
                                 if(jp1.equals("")){
                                    back();
                                 }
                                 break;
                                 case 3:
                                 String jp3=sc.nextLine();
                                 if(jp3.equals("")){
                                      exit();
                                 }
                                 break;   
                            }
                            
                              
                            
                       
                    }while(jd);
                    
                   
                }
                break;
                    
                case 2:
                System.out.print("\033[H\033[2J");  
                System.out.flush();
                System.out.println("Hello...!");
                System.out.println("Enter username");
                username=sc.nextLine();
               
                System.out.println("Enter your PIN");
                int av=sc.nextInt();


                sc.nextLine();
                boolean je=true;
                
                 if(username.equals("jeeva") && av==1234){
                    do{
                        System.out.print("\033[H\033[2J");  
                        System.out.flush();
                        System.out.println("1. check balance");
                        System.out.println("2. withdrawal");
                        System.out.println("3. Exit");
                        cd=sc.nextInt();
                        switch(cd){
                            case 1:
                           
                            System.out.println("Balance amount ="+z);
                            break;
                            case 2:
                            n=sc.nextInt();
                            jeeva=n;
                            z-=n;
                            if(n/2000==0 && n/500==0 && n/200==0 && n/100==0){
                                System.out.println("Invalid amount");
                                System.out.println("please contact bank branch for further details");
                                    }
                            if(n/2000!=0){
                               int with=n/2000;
                                 n=n%2000;
                                ary[0]+=with;
                               
                            }
                             if(n/500!=0){
                                int e=n/500;
                                  n=n%500;
                                 ary[1]+=e;
                                
                             }
                              if(n/200!=0){
                                int f=n/200;
                                 n=n%200;
                                 ary[2]+=f;
                                 
                             }
                              if(n/100!=0){
                                int g=n/100;
                                  n=n%100;
                                 ary[3]+=g;
                                
                             }
                             
                                for(int i=0;i<4;i++){
                                    System.out.println(ary[i]);
                                }
                           
                            break;
                            case 3:
                            je=false;
                            break;


                            
                             
                        }
                        
                       }while(je);
                    }
                }
            }while(jv);
                
    }
    public static void main(String ar[]){
         sc =new Scanner(System.in);
        int ch=0;
        int password =0;
        int va=0;
         int cd=0;
        do{
            System.out.print("\033[H\033[2J");  
            System.out.flush();
            System.out.println("Hello...! Welcome back to ATM...! ");
            System.out.println("1. Admin Login");
            System.out.println("2. User Login");
            System.out.println("3. Exit");

            System.out.println("Enter To continue");
            ch=sc.nextInt();
            
            int ab=0;
            sc.nextLine();
            switch(ch){
                case 1:
                System.out.print("\033[H\033[2J");  
                System.out.flush();
                System.out.println("Welcome Back...");
                System.out.println("1.Enter username");
                username=sc.nextLine();
                System.out.println("2. Enter password");
                
                
                 password=sc.nextInt();
                sc.nextLine();
                if(username.equals("jeeva") && password==1234){
                    System.out.print("\033[H\033[2J");  
                    System.out.flush();
                    System.out.println("1. Load Amount");
                    System.out.println("2. Show Amount");
                    System.out.println("3. Exit");
                    ab=0;   
                    boolean jd=true;
                    boolean jv1=true;
                   
                     do{
                        ab=sc.nextInt();
                        switch(ab){
                            case 1:
                            System.out.print("\033[H\033[2J");  
                            System.out.flush();
                            System.out.println("Enter the value of amount");
                            System.out.println("Enter no of 2000");
                            int a1=sc.nextInt();
                            System.out.println("Enter no of 500");
                            int a2=sc.nextInt();
                            System.out.println("Enter no of 200");
                            int a3=sc.nextInt();
                            System.out.println("Enter no of 100");
                            int a4=sc.nextInt();
                            arr[0]+=a1;
                            arr[1]+=a2;
                            arr[2]+=a3;
                            arr[3]+=a4;
                            System.out.println("Please enter to exit..!");
                                 String jp2=sc.nextLine();
                                 if(jp2.equals("")){
                                    back();
                                 }
                            break;
                              
                            case 2:
                            System.out.print("\033[H\033[2J");  
                            System.out.flush(); 
                            System.out.println("balance amount");
                            System.out.println("No.of.2000 rupees :  "+arr[0]);
                            System.out.println("No.of.500 rupees :   "+arr[1]);
                            System.out.println("No.of.200 rupees :   "+arr[2]);
                            System.out.println("No.of.100 rupees :   "+arr[3]);
                            int v=((arr[0]*2000)+(arr[1]*500)+(arr[2]*200)+(arr[3]*100));
                            System.out.println("Balance amount ="+v);
                            System.out.println("Please enter to exit..!");
                                 String jp1=sc.nextLine();
                                 if(jp1.equals("")){
                                    back();
                                 }
                                 break;
                                 case 3:
                                   String jp4=sc.nextLine();
                                    if( jp4.equals("")){
                                        exit();
                                    }
                                 
                                 break; 
                                  
                            }
                            
                            
                              
                            
                       
                    }while(jd);
                    
                   
                }
                break;
                    
                case 2:
                System.out.print("\033[H\033[2J");  
                System.out.flush();
                System.out.println("Hello User");
                System.out.println("Enter your username");
                username=sc.nextLine();
               
                System.out.println("Enter your password");
                int av=sc.nextInt();


                sc.nextLine();
                boolean je=true;
                
                 if(username.equals("jiju") && av==1234){
                    do{
                       
                        System.out.println("1. check balance");
                        System.out.println("2. withdraw");
                        System.out.println("3. Exit");
                        cd=sc.nextInt();
                        switch(cd){
                            case 1:
                            System.out.println("Balance amount ="+v);
                            break;
    
                            case 2:
                            n=sc.nextInt();
                            jeeva=n;
                            
                            if(n/2000==0 && n/500==0 && n/200==0 && n/100==0){
                                System.out.println("amount not available");
                                System.out.println("please contact bank for further information");
                                    }
                            if(n/2000!=0){
                               int with=n/2000;
                                 n=n%2000;
                                ary[0]+=with;
                               
                            }
                             if(n/500!=0){
                                int e=n/500;
                                  n=n%500;
                                 ary[1]+=e;
                                
                             }
                              if(n/200!=0){
                                int f=n/200;
                                 n=n%200;
                                 ary[2]+=f;
                                 
                             }
                              if(n/100!=0){
                                int g=n/100;
                                  n=n%100;
                                 ary[3]+=g;
                                
                             }
                             
                                for(int i=0;i<4;i++){
                                    System.out.println(ary[i]);
                                }
                           
                            break;
                            case 3:
                            je=false;
                            break;


                            
                             
                        }
                        
                       }while(je);
                 }
                 
                 //*do{
                  //  cd=sc.nextInt();

                //switch(cd){
                  //      case 1:
                    //    System.out.print("\033[H\033[2J");  
                      //  System.out.flush();
                        //System.out.println("1. check balance");
                        //System.out.println("2. withdraw");
                        //System.out.println("3. Exit");
                      //va=sc.nextInt();
                   // }
                   // switch(va){
                     //   case 1:
                       // System.out.println("Balance amount ="+(arr[0]+arr[1]+arr[2]+arr[3]));
                        //break;
                   // }
                   //}while(jpp);
              
                  
                
                
                
                
                
               // case 3:
               // break;

                


            }
        }while(ch!=3);
    }
   
}

 
