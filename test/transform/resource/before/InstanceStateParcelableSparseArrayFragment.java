//CONF: lombok.addGeneratedAnnotation = false
import android.app.Fragment;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

public class InstanceStateParcelableSparseArrayFragment extends Fragment {
	
	@hrisey.InstanceState
	private SparseArray<MyParcelable> myParcelableSparseArray;
}

class MyParcelable implements Parcelable {
	
	@Override
	public int describeContents() {
		return 0;
	}
	
	@Override
	public void writeToParcel(Parcel dest, int flags) {
	}
}
