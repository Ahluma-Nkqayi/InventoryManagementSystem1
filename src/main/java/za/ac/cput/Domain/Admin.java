package za.ac.cput.Domain;

public class Admin {
    private String adminId;
    private String userName;
    private String password;
    private String role;

    private Admin() {}

    private Admin(Builder builder) {
        this.adminId = builder.adminId;
        this.userName = builder.userName;
        this.password = builder.password;
        this.role = builder.role;


    }
    public String getAdminId() {
        return adminId;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }


    @Override
    public String toString() {
        return "Admin{" +
                "adminId='" + adminId + '\'' +
                ", username='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

    public static class Builder {
        private String adminId;
        private String userName;
        private String password;
        private String role;


        public Builder setAdminId(String adminId) {
            this.adminId = adminId;
            return this;
        }

        public Builder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder setRole(String role) {
            this.role = role;
            return this;
        }

        public Admin.Builder copy(Admin admin) {
            this.adminId = admin.adminId;
            this.userName = admin.userName;
            this.password = admin.password;
            this.role = admin.role;
            return this;
        }
        public Admin build() {return new Admin(this);}

    }

}
