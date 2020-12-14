public class UserSettingService
{
   public void changeEmail(User user)
   {
      if(SecurityService.checkAccess(user))
      { 
          // Grant option to change 
      }
   }
}
public class SecurityService
{
    public static boolean checkAccess(User user)
      {
          //check the access.
      }
}