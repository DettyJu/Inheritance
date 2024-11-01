public class Faculty extends Employee {
    private boolean status;
    
    public boolean isRegular() {
        return status;
    }
    
    public void setStatus(boolean status) {
        this.status = status;
    }
}
