package astrochart.client.service;

import java.util.Date;
import astrochart.shared.data.Epoch;
import com.google.gwt.user.client.rpc.AsyncCallback;

public interface EpochServiceAsync {
    void readEpoch(final Date date, final AsyncCallback<Epoch> callback);
}
