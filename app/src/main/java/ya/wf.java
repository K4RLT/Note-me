package ya;
import oa.b;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.oh;

/* loaded from: classes.dex */
public final class wf extends oh implements yf {
    /* JADX WARN: Multi-variable type inference failed */
    public final vf u4(b bVar, bg bgVar) {
        vf ohVar;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f9121w);
        int i = s.f31486a;
        obtain.writeStrongBinder(bVar);
        obtain.writeInt(1);
        bgVar.writeToParcel(obtain, 0);
        Parcel v12 = v1(obtain, 1);
        IBinder readStrongBinder = v12.readStrongBinder();
        if (readStrongBinder == null) {
            ohVar = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenter");
            if (queryLocalInterface instanceof vf) {
                ohVar = (vf) queryLocalInterface;
            } else {
                ohVar = new oh(readStrongBinder, "com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenter", 6);
            }
        }
        v12.recycle();
        return ohVar;
    }
}
