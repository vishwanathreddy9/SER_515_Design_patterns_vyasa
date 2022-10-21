public class UserInfoItem {
    private String userName;
    private int userType;

    public UserInfoItem(String userName, int userType) {
        this.userName = userName;
        this.userType = userType;
    }

    public String getUserName() {
        return userName;
    }

    public int getUserType() {
        return userType;
    }
}
