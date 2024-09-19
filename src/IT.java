public class IT {
   static int ITid;
    static String Name;

   static{
       ITid = 4;
       Name = "cyber";
       System.out.println("this is static display:"+ITid);
       System.out.println("this is static display:"+Name);
   }
    String ITDepartment;
    {
        ITDepartment = "DataScience";
        System.out.println("this is instance variable display :"+ ITDepartment);
    }

    public IT(int IID, String N, String ITD){
        ITid = IID;
        Name = N;
        ITDepartment = ITD;

        System.out.println("this is static display from constructor :"+ ITid);
        System.out.println("this is static display from constructor:"+ Name);
        System.out.println("this is instance variable display from constructor :"+ ITDepartment);
    }
}
