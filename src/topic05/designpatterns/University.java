
package topic05.designpatterns;

public class University {
    
    
    private String name;
    private String address;
    
    static int counter = 0;

    private static University instance=  null;
    
    private University(String name, String address) {
        this.name = name;
        this.address = address;
        counter++;
    }
    
    public static University getInstance(){
        if (instance == null)
            instance = new University("Prince Sulan University", "Rafha Street");
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "University{" + "name=" + name + ", address=" + address + '}';
    }
    
    
    
}
