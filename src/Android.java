//Symbolised Android devices and their information.
//Android subclassed by AdapterLibraryToAndroid.
//Adaptee class for AdapterLibraryToAndroid
class Android  {
    String phoneNumber;
    String location;
    String conditionInfo;
    String myDeviceType ;
    String lastUpdateTime ;
    //Android devices has own communication method to set data to the ServerLibrary.
    public void set(String location,String conditionInfo,String lastUpdateTime) {
        this.location=location;
        this.conditionInfo=conditionInfo;
        this.lastUpdateTime=lastUpdateTime;
    }
    //Android devices has own communication method to get data to the ServerLibrary.
    String get(){
        String result =
                "\n"+
                        " > Patient Phone Number: "+phoneNumber+"\n"+
                        " > Patient Location: "+location+"\n"+
                        " > Patient Condition Info: "+conditionInfo+"\n"+
                        " > Patient Device Type: "+myDeviceType+"\n"+
                        " > Patient Last Update Time: "+lastUpdateTime+"\n"
                ;
        return result;
    }

    public Android(String phoneNumber, String location, String conditionInfo,
                   String myDeviceType,String lastUpdateTime) {

        this.phoneNumber = phoneNumber;
        this.location = location;
        this.conditionInfo = conditionInfo;
        this.myDeviceType = myDeviceType;
        this.lastUpdateTime=lastUpdateTime;
    }
}
