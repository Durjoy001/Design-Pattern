    public class IUser
    {
        bool Login(string username, string password);
        bool Register(string username, string password, string email);
    }
    public class ILogger
    {
        void LogError(string error);
    }
    public class IEmail
    {
        bool SendEmail(string emailContent);
    }
