package example.androidgrid.firebaserecycleradapter;

/**
 * Created by ankit on 22/1/18.
 */

public class Model {
    public String mId, mTitle, mDesc;

    public Model() {

    }

    public Model(String mId, String mTitle, String mDesc) {
        this.mId = mId;
        this.mTitle = mTitle;
        this.mDesc = mDesc;
    }

    public String getmId() {
        return mId;
    }

    public void setmId(String mId) {
        this.mId = mId;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getmDesc() {
        return mDesc;
    }

    public void setmDesc(String mDesc) {
        this.mDesc = mDesc;
    }
}
