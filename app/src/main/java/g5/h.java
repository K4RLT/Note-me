package g5;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

/* loaded from: classes.dex */
public final class h extends RemoteCallbackList {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f17448a;

    public h(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f17448a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object obj) {
        ((d) iInterface).getClass();
        obj.getClass();
        this.f17448a.f1093v.remove((Integer) obj);
    }
}
