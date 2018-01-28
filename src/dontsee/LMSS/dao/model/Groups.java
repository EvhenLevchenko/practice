package dontsee.LMSS.dao.model;


import java.io.Serializable;

public class Groups implements Serializable {


    private static final long serialVersionUID = -6841832214814037475L;
    private int groupId;
    private String groupName;

    public Groups(){}


    public Groups(int groupId, String groupName) {
        this.groupId = groupId;
        this.groupName = groupName;
    }

    public Groups(String groupName) {
        this.groupName = groupName;
    }


    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }


    @Override
    public String toString() {
        return "Groups{" +
                "id=" + groupId +
                ", groupName='" + groupName + '\'' +
                '}';
    }
}
